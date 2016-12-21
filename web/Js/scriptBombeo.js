       
       function calcularManoObra(){
            console.log("B"+document.getElementById('valorObra').value);
            var c = document.getElementById('cantidadObra').value;
            var v = toFloat(document.getElementById('valorObra').value.replace(/\./g,""));
            
           //*valor total de la mano*//
            document.getElementById('valorTotalObra').value = (c*v);
            format(document.getElementById('valorTotalObra'));
            
            calcularTotales();

        }
        
        
        function calcularAceite(){
            console.log("B"+document.getElementById('valorAceite').value);
            var c = document.getElementById('cantidadAceite').value;
            var v = toFloat(document.getElementById('valorAceite').value.replace(/\./g,""));
           
             //*valor total aceite *//
            document.getElementById('valorTotalAceite').value = (c*v);
            format(document.getElementById('valorTotalAceite'));
            
            calcularTotales();
        }
       
        
        function calcularCombustible(){
            console.log("B"+document.getElementById('valorCombustible').value);
            var c = document.getElementById('cantidadCombustible').value;
            var v = toFloat(document.getElementById('valorCombustible').value.replace(/\./g,""));
            
            //*valor total combustible*//
            document.getElementById('valorTotalCombustible').value = (c*v);
            format(document.getElementById('valorTotalCombustible'));
            
            calcularTotales();
        }
        
        
        //* suma TOTAL *//
    
        function calcularAlquilerBomba(){
            console.log("B"+document.getElementById('valorBomba').value);
            var c = document.getElementById('cantidadBomba').value;
            var v = toFloat(document.getElementById('valorBomba').value.replace(/\./g,""));
            
            //*valor total combustible*//
            document.getElementById('valorTotalBomba').value = (c*v);
            format(document.getElementById('valorTotalBomba'));
            
            calcularTotales();
        }
        
        
        //* suma TOTAL *//
        function calcularPagoTarifa(){
            var v1 = toFloat(document.getElementById('valorDistrito').value.replace(/\./g,""));
            var v2 = toFloat(document.getElementById('valorCorponor').value.replace(/\./g,""));
            
            //*valor total combustible*//
            document.getElementById('totalTarifa').value = (v1 + v2);
            format(document.getElementById('totalTarifa'));
            
            calcularTotales();
        }
        
        
        //* suma TOTAL *//
        function calcularTotales(){
            var t1 = toFloat(document.getElementById('valorTotalObra').value.replace(/\./g,""));
            var t2 = toFloat(document.getElementById('valorTotalAceite').value.replace(/\./g,""));
            var t3 = toFloat(document.getElementById('valorTotalCombustible').value.replace(/\./g,""));
            var t4 = toFloat(document.getElementById('valorTotalBomba').value.replace(/\./g,""));
            var t5 = toFloat(document.getElementById('totalTarifa').value.replace(/\./g,""));
            
                                     //*TOTAL*//
            document.getElementById('sumaTotal').value = (t1+t2+t3+t4+t5);
            format(document.getElementById('sumaTotal'));
        }
        
        
        function toFloat(str){
            if (str == null || str == ""){
               return 0; 
            }
            return parseFloat(str);
        }
        
        
        
        function format(input)
                    {
                    var num = input.value.replace(/\./g,'');
                    if(!isNaN(num)){
                        num = num.toString().split('').reverse().join('').replace(/(?=\d*?\.?)(\d{3})/g,'$1.');
                        num = num.split('').reverse().join('').replace(/^[\.]/,'');
                        input.value = num;
                    }
                    
                    console.log(input.value);
                }
        
      function VentanaEmergente(){
          if(confirm("¿Desea Guardar La Información?")){
              $("#Bombeo").submit();
              alert("Información Guardada Exitosamente");
          }
      }