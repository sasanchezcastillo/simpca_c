
function calcularTotalObreros(){
    
   
}
//permite Calcular totales de la Siembra
function calcularTotalSiembra(){
            var t2 = toInt(document.getElementById('costo_semilla').value.replace(/\./g,""));
            var t3 = toInt(document.getElementById('costo_transporte').value.replace(/\./g,""));
            var t4 = toInt(document.getElementById('secado_semilla').value.replace(/\./g,""));
            
            var cant= toInt(document.getElementById('cantidad_bulto').value);
            var valor= toInt(document.getElementById('precio_bulto').value.replace(/\./g,""));
            
            var t5 = cant*valor;
            
            document.getElementById('total_obreros').value=(t5);
            format(document.getElementById('total_obreros'));
            
            document.getElementById('total_siembra').value = (t2+t3+t4+t5);
            format(document.getElementById('total_siembra'));
        }
//
            
        function toFloat(str){
            if(str == null || str == ""){
                return 0;
            }
            return parseFloat(str);
        }
 //Código para colocar 
//los indicadores de miles mientras se escribe
//script por tunait!
 function toInt(str){
            if(str == null || str == ""){
                return 0;
            }
            return parseInt(str);
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
            $("#SiembraManual").submit();
            alert("Información Guardada Exitosamente");
        }
    }