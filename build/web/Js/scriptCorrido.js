
    function calcularManoObraCORRIDO() {
        console.log("B"+document.getElementById('valorManoObra').value);
        var c = document.getElementById('cantidadManoObra').value;
        var v = toFloat(document.getElementById('valorManoObra').value.replace(/\./g,""));


        document.getElementById('valorTotalManoObra').value = (c * v);
        format(document.getElementById('valorTotalManoObra'));

        calcularTotales();

    }


    function calcularTotales() {

        var t1 =  toFloat(document.getElementById('valorTotalManoObra').value.replace(/\./g,""));
        var t2 =  toFloat(document.getElementById('valorTarifa').value.replace(/\./g,""));


        document.getElementById('sumaTotal').value = (t1 + t2);
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
              $("#Corrido").submit();
              alert("Información Guardada Exitosamente");
          }
      }