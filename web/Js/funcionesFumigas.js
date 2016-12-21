/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function calcularManoObra(){
            console.log("A" + document.getElementById('valorObra').value);
            var c = document.getElementById('cantidadObra').value;
            var v = toFloat(document.getElementById('valorObra').value.replace(/\./g,""));
            
            document.getElementById('valorTotalObra').value = (c*v);
            format(document.getElementById('valorTotalObra'));
            calcularTotales();
        }
        function calcularInsumos(x,idFila){
            console.log("B" +document.getElementById('valorInsumos'+ idFila).value);
            var c = document.getElementById('cantidadInsumos'+ idFila).value;
            var v = toFloat(document.getElementById('valorInsumos'+ idFila).value.replace(/\./g,""));
            
            document.getElementById('valorTotalInsumos'+ idFila).value = (c*v);
            format(document.getElementById('valorTotalInsumos'+ idFila));
            calcularTotales();
        }
        function calcularTotales(){
            var t1 = toFloat(document.getElementById('valorTotalObra').value.replace(/\./g,""));
            var t2 = toFloat(document.getElementById('valorTotalInsumos0').value.replace(/\./g,""));
            for( var i = 1; i <= contadorFilas; i++){
                t2+= toFloat(document.getElementById('valorTotalInsumos'+i).value.replace(/\./g,""));
            }
            toFloat(document.getElementById('sumaTotal').value = (t1+t2));
            format(document.getElementById('sumaTotal'));
        }
        function toFloat(str){
            if(str == null || str == ""){
                return 0;
            }
            return parseFloat(str);
        }
        var contadorFilas=0;
       
        function format(input){
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
        $("#Fumigas").submit();
        alert("Información Guardada Exitosamente");
    }
}