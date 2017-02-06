/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function calcularManoObra(){
        console.log("A" + document.getElementById('Valor').value);
        var c = document.getElementById('Cantidad').value;
        var v = toFloat(document.getElementById('Valor').value.replace(/\./g,""));
           
        document.getElementById('ValorTotalObra').value = (c*v);
        format(document.getElementById('ValorTotalObra'));
        calcularTotales();
        }
        
        
    function calcularInsumos(x, idFila){
        console.log("B" +document.getElementById('ValorUnitario'+ idFila).value);
        var c = document.getElementById('CantidadInsumos'+ idFila).value;
        var v = toFloat(document.getElementById('ValorUnitario'+ idFila).value.replace(/\./g,""));
        
        document.getElementById('ValorTotalInsumos'+ idFila).value = (c*v);
        format(document.getElementById('ValorTotalInsumos'+ idFila));
        calcularTotales();
        }
        
    function calcularTotales(){
        var t1 = toFloat(document.getElementById('ValorTotalObra').value.replace(/\./g,""));
        var t2 = toFloat(document.getElementById('ValorTotalInsumos0').value.replace(/\./g,""));
        for(var i = 1; i <= contadorfilas; i++){
            t2 += toFloat(document.getElementById('ValorTotalInsumos'+ i).value.replace(/\./g,""));
            }
            
            toFloat(document.getElementById('sumaTotal').value = (t1+t2));
            format(document.getElementById('sumaTotal'));
        }
        
        function toFloat(str){
            if(str == null || str ==""){
                return 0;
            }
            return parseFloat(str);
        }

    function toInt(str){
                if(str === null || str === ""){
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
    
    function combo_insumo(x,i){
            $.ajax({
                url : 'nombres_insumos.jsp',
                data: {'tipo_insumo' : x.value},
                success: function (resultado){
                    $("#insumo"+i).html(resultado);
                }
            });
        }

    function VentanaEmergente(){
        if(confirm("¿Desea Guardar La Información?")){
            $("#Mantenimiento").submit();
            alert("Información Guardada Exitosamente");
        }
    }
