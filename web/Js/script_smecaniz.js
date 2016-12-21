
function calculartotal(){
            var t1 = toInt(document.getElementById('costo_maquina_s').value.replace(/\./g,""));
            var t3 = toInt(document.getElementById('costo_secado_s').value.replace(/\./g,""));
            var t5 = toInt(document.getElementById('costo_mano_obra').value.replace(/\./g,""));
            var t6 = toInt(document.getElementById('cantidad_B').value);
            var t7 = toInt(document.getElementById('valor_bulto').value.replace(/\./g,""));
            var t8 = toInt(document.getElementById('transporte_semilla').value.replace(/\./g,""));
           
            var t9= toInt(t6*t7);
            
            document.getElementById('costo_semilla').value = (t9);
            format(document.getElementById('costo_semilla'));
            
            document.getElementById('total_siembra').value = (t1+t3+t5+t8+t9);
            format(document.getElementById('total_siembra'));
        }
        
        
        function toInt(str){
            if(str == null || str == ""){
                return 0;
            }
            return parseInt(str);
        }
        //Código para colocar 
//los indicadores de miles mientras se escribe
//script por tunait!

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
            $("#SiembraMecanizada").submit();
            alert("Información Guardada Exitosamente");
        }
    }