/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function calcularTotal(){
            console.log("A" +document.getElementById('valor').value);
            var c = document.getElementById('cantidad').value;
            var v = toFloat(document.getElementById('valor').value.replace(/\./g,""));
            
            document.getElementById('total').value = (c*v);
            format(document.getElementById('total'));
        }
        
        function toFloat(str){
           if (str == null || str ==""){
               return 0;
           } 
           return parseFloat(str);
        }
        
        function format(input){
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
                $("#CortaMaleza").submit();
                alert("Información Guardada Exitosamente");
            }
        }