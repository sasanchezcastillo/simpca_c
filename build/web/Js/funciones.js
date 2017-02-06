/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   function calcularInsumos(x, idFila){
       console.log("A" +document.getElementById('valorInsumos'+ idFila).value);
            var c = document.getElementById('cantidadInsumos'+ idFila).value;
            var v = toFloat(document.getElementById('valorInsumos'+ idFila).value.replace(/\./g,""));
              
            document.getElementById('valorTotalInsumos'+ idFila).value = (c * v);
            format(document.getElementById('valorTotalInsumos'+ idFila));
            calcularTotales();
        }
        
        function calcularManoObra(){
            console.log("C" +document.getElementById('costoUnitarioManoObra').value);
            var c3 = document.getElementById('cantidadManoObra').value;
            var v3 = toFloat(document.getElementById('costoUnitarioManoObra').value.replace(/\./g,""));
            
            document.getElementById('costoTotalManoObra').value = (c3*v3);
            format(document.getElementById('costoTotalManoObra'));
            calcularTotales();
        }
        
        function calcularTransporte(){
            console.log("D" +document.getElementById('costoUnitarioTransporte').value);
            var c4 = document.getElementById('cantidadTransporte').value;
            var v4 = toFloat(document.getElementById('costoUnitarioTransporte').value.replace(/\./g,""));
            
            document.getElementById('costoTotalTransporte').value = (c4*v4);
            format(document.getElementById('costoTotalTransporte'));
            calcularTotales();
        }
        
        function calcularTotales(){
            var t1 = toFloat(document.getElementById('valorTotalInsumos0').value.replace(/\./g,""));
            var t3 = toFloat(document.getElementById('costoTotalManoObra').value.replace(/\./g,""));
            var t4 = toFloat(document.getElementById('costoTotalTransporte').value.replace(/\./g,""));
            for (var i = 1; i <= contadorfilas; i++){
                t1 += toFloat(document.getElementById('valorTotalInsumos'+ i).value.replace(/\./g,""));
            }
            
            toFloat(document.getElementById('sumaTotal').value = (t1+t3+t4));
            format(document.getElementById('sumaTotal'));
        }
        
        function toFloat(str){
            if (str == null || str ==""){
                return 0;
            }
            return parseFloat(str);
        }
        
    function toInt(str){
        if (str === null || str === ""){
            return 0;
        }
        return parseInt(str);
    }
          
    function format(input) {
     var num = input.value.replace(/\./g,'');
     if (!isNaN(num)){
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
        $("#Abonadas").submit();
        alert("Información Guardada Exitosamente");
    }
}