/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//permite Calcular El valor Total de la Mano de Obra en Quema Fisica

     function calcularManoObraFisica(){
    console.log("B"+document.getElementById('valorUnidadMO').value);
    var c = document.getElementById('cantidadMO').value;
    var v = toFloat(document.getElementById('valorUnidadMO').value.replace(/\./g,""));
    
    document.getElementById('valortotal').value = (c*v);
    formatFisica(document.getElementById('valortotal'));
    calcularTotalesFisica();
}
        

//permite Calcular El valor Total de Insumos en Quema Fisica

        
        function calcularInsumosFisica(){
            console.log("B"+document.getElementById('valor').value);
            var c = document.getElementById('cantidadins').value;
            var v = toFloat(document.getElementById('valor').value.replace(/\./g,""));
            
            document.getElementById('valorTotalins').value = (c*v);
            formatFisica(document.getElementById('valorTotalins'));
            
            calcularTotalesFisica();
        }
        
 
//permite Calcular el Costo Total de la Quema Fisica

        function calcularTotalesFisica(){
            
            var t1 = toFloat(document.getElementById('valortotal').value.replace(/\./g,""));
            var t2 = toFloat(document.getElementById('valorTotalins').value.replace(/\./g,""));
            
            document.getElementById('valorTotalQF').value = (t1+t2);
            formatFisica(document.getElementById('valorTotalQF'));
        }
          
         function toFloat(str){
            if (str == null || str == ""){
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

 
    function guardar(){
        alert("Validando informacion para el Registro");
    }
    function volver(){
        volver=confirm("¿Desea usted salir Sin Guardad?");
        if(volver===true){
            window.location="preparacion_de_lotes.jsp";
        }
    }
    
    //Este escript permite agregar el punto mil(.) a los valores ingresados.
    
    function formatFisica(input)
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
        
        if(confirm("¿Desea Guardar la Información?")){
            $("#QuemaFisica").submit();
            alert("Información Guardada Exitosamente");
        }
    }
