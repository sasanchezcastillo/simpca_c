/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*********************/
 /*DESPALILLE
/*********************/

 function calcularMODespalille(){
            
            console.log("B"+document.getElementById('valorDespalille').value);
            var c = toFloat(document.getElementById('cantidadDespallile').value);
            var v = toFloat(document.getElementById('valorDespalille').value.replace(/\./g,""));
            
            document.getElementById('valorTotalDespalille').value=(c*v);
            
            format(document.getElementById('valorTotalDespalille'));
            calcularTotalesDEM();

        }
        
        
        function calcularMOEntresaque(){
            
            console.log("B"+document.getElementById('valorEntresaque').value);
            var c = toFloat(document.getElementById('cantidadEntresaque').value);
            var v = toFloat(document.getElementById('valorEntresaque').value.replace(/\./g,""));
           
            document.getElementById('valorTotalEntresaque').value = (c*v);
            format(document.getElementById('valorTotalEntresaque'));
            calcularTotalesDEM();

        }
        
        function calcularMOMacheteada(){
            
             console.log("B"+document.getElementById('valorMacheteada').value);
            var c = toFloat(document.getElementById('cantidadMacheteada').value);
            var v = toFloat(document.getElementById('valorMacheteada').value.replace(/\./g,""));
           
            document.getElementById('valorTotalMacheteada').value = (c*v);
            format(document.getElementById('valorTotalMacheteada'));
            calcularTotalesDEM();

        }

        function calcularTotalesDEM(){
            var t1 = toFloat((document.getElementById('valorTotalDespalille').value.replace(/\./g,"")));
            var t2 = toFloat((document.getElementById('valorTotalEntresaque').value.replace(/\./g,"")));
            var t3 = toFloat((document.getElementById('valorTotalMacheteada').value.replace(/\./g,"")));
            
            document.getElementById('sumaTotalDEM').value = (t1+t2+t3);
            format(document.getElementById('sumaTotalDEM'));
        }
        
        function toFloat(str){
            if(str == null || str ==""){
                return 0;
            }
            return parseFloat(str);
        }
        
        function format(input)
        {
        var num = input.value.replace(/\./g,'');
        if(!isNaN(num)){
            num = num.toString
            ().split('').reverse().join('').replace(/(?=\d*?\.?)(\d{3})/g,'$1.');
            num = num.split('').reverse().join('').replace(/^[\.]/,'');
            input.value = num;
        }
        console.log(input.value);
    }
     


/*********************/
 /*CORTA BULTOS/*
/*********************/

 function calcularMaquinaLlantaB(){
            
            console.log("B"+document.getElementById('valorMaquinaLlantaB').value);
            var c = toFloat(document.getElementById('cantidadMaquinaLlantaB').value);
            var v = toFloat(document.getElementById('valorMaquinaLlantaB').value.replace(/\./g,""));

            document.getElementById('valorTotalMaquinaLlantaB').value = (c*v);
            format(document.getElementById('valorTotalMaquinaLlantaB'));
            calcularTotalesB();

        }
        
 
        function calcularMaquinaOrugaB(){
            
            console.log("B"+document.getElementById('valorMaquinaOrugaB').value);
            var c = toFloat(document.getElementById('cantidadMaquinaOrugaB').value);
            var v = toFloat(document.getElementById('valorMaquinaOrugaB').value.replace(/\./g,""));
            
            document.getElementById('valorTotalMaquinaOrugaB').value = (c*v);
            format(document.getElementById('valorTotalMaquinaOrugaB'));
            calcularTotalesB();

        }

        function calcularLlenadorB(){
            
            console.log("B"+document.getElementById('valorLlenadorB').value);
            var c = toFloat(document.getElementById('cantidadLlenadorB').value);
            var v = toFloat(document.getElementById('valorLlenadorB').value.replace(/\./g,""));
           
            document.getElementById('valorTotalLlenadorB').value = (c*v);
            format(document.getElementById('valorTotalLlenadorB'));
            calcularTotalesB();

        }


        function calcularTractorB(){
            
            console.log("B"+document.getElementById('valorTractorB').value);
            var c = toFloat(document.getElementById('cantidadTractorB').value);
            var v = toFloat(document.getElementById('valorTractorB').value.replace(/\./g,""));
            
            document.getElementById('valorTotalTractorB').value = (c*v);
            format(document.getElementById('valorTotalTractorB'));
            calcularTotalesB();

        }


        function calcularBulteadorB(){
            
            console.log("B"+document.getElementById('valorBulteadorB').value);
            var c = toFloat(document.getElementById('cantidadBulteadorB').value);
            var v = toFloat(document.getElementById('valorBulteadorB').value.replace(/\./g,""));
 
            document.getElementById('valorTotalBulteadorB').value = (c*v);
            format(document.getElementById('valorTotalBulteadorB'));
            calcularTotalesB();

        }


        function calcularFleteB(){
            
            console.log("B"+document.getElementById('valorFleteB').value);
            var c = toFloat(document.getElementById('cantidadFleteB').value);
            var v = toFloat(document.getElementById('valorFleteB').value.replace(/\./g,""));
            
            document.getElementById('valorTotalFleteB').value = (c*v);
            format(document.getElementById('valorTotalFleteB'));
            calcularTotalesB();

        }


        function calcularTotalesB(){
            var t1 = toFloat(document.getElementById('valorTotalMaquinaLlantaB').value.replace(/\./g,""));
            var t2 = toFloat(document.getElementById('valorTotalMaquinaOrugaB').value.replace(/\./g,""));
            var t3 = toFloat(document.getElementById('valorTotalLlenadorB').value.replace(/\./g,""));
            var t4 = toFloat(document.getElementById('valorTotalTractorB').value.replace(/\./g,""));
            var t5 = toFloat(document.getElementById('valorTotalBulteadorB').value.replace(/\./g,""));
            var t6 = toFloat(document.getElementById('valorTotalFleteB').value.replace(/\./g,""));
            var t7 = toFloat(document.getElementById('valorCabuyaNylonB').value.replace(/\./g,""));
            var t8 = toFloat(document.getElementById('valorCeladuriaMaquinaB').value.replace(/\./g,""));
            var t9 = toFloat(document.getElementById('valorAlimentacionB').value.replace(/\./g,""));
            var t10 = toFloat(document.getElementById('valorAdministracionB').value.replace(/\./g,""));
            var t11 = toFloat(document.getElementById('transporteorugaB').value.replace(/\./g,""));
            
            document.getElementById('sumaTotalB').value = (t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11);
            format(document.getElementById('sumaTotalB'));
        }
        
        
        function format(input){
            
        var num = input.value.replace(/\./g,'');
        if(!isNaN(num)){
            num = num.toString
            ().split('').reverse().join('').replace(/(?=\d*?\.?)(\d{3})/g,'$1.');
            num = num.split('').reverse().join('').replace(/^[\.]/,'');
            input.value = num;
        }
        console.log(input.value);
    }
    
    
    
    /*******************/
     /*CORTA GRANEL */
    /******************/
    
       function calcularMaquinaLlantaG(){
            
            console.log("B"+document.getElementById('valorMaquinaLlantaG').value);
            var c = toFloat(document.getElementById('cantidadMaquinaLlantaG').value);
            var v = toFloat(document.getElementById('valorMaquinaLlantaG').value.replace(/\./g,""));
           
            document.getElementById('valorTotalMaquinaLlantaG').value = (c*v);
            format(document.getElementById('valorTotalMaquinaLlantaG'));
            calcularTotalesG();

        }
        

        function calcularMaquinaOrugaG(){
            
            console.log("B"+document.getElementById('valorMaquinaOrugaG').value);
            var c = toFloat(document.getElementById('cantidadMaquinaOrugaG').value);
            var v = toFloat(document.getElementById('valorMaquinaOrugaG').value.replace(/\./g,""));
           
            document.getElementById('valorTotalMaquinaOrugaG').value = (c*v);
            format(document.getElementById('valorTotalMaquinaOrugaG'));
            calcularTotalesG();

        }
  
  
        function calcularFleteG(){
           
           console.log("B"+document.getElementById('valorFleteG').value);
            var c = toFloat(document.getElementById('cantidadFleteG').value);
            var v = toFloat(document.getElementById('valorFleteG').value.replace(/\./g,""));
            
           
            document.getElementById('valorTotalFleteG').value = (c*v);
            format(document.getElementById('valorTotalFleteG'));
            calcularTotalesG();

        }
  
  
        function calcularTotalesG(){
            var t1 = toFloat(document.getElementById('valorTotalMaquinaLlantaG').value.replace(/\./g,""));
            var t2 = toFloat(document.getElementById('valorTotalMaquinaOrugaG').value.replace(/\./g,""));
            var t3 = toFloat(document.getElementById('valorTotalFleteG').value.replace(/\./g,""));
            var t4 = toFloat(document.getElementById('valorCeladuriaG').value.replace(/\./g,""));
            var t5 = toFloat(document.getElementById('valorAlimentacionG').value.replace(/\./g,""));
            var t6 = toFloat(document.getElementById('valorAdministracionG').value.replace(/\./g,""));
            var t7 = toFloat(document.getElementById('transporteorugaG').value.replace(/\./g,""));
            
            document.getElementById('sumaTotalG').value = (t1+t2+t3+t4+t5+t6+t7);
            format(document.getElementById('sumaTotalG'));
        }
        
        function format(input)
        {
        var num = input.value.replace(/\./g,'');
        if(!isNaN(num)){
            num = num.toString
            ().split('').reverse().join('').replace(/(?=\d*?\.?)(\d{3})/g,'$1.');
            num = num.split('').reverse().join('').replace(/^[\.]/,'');
            input.value = num;
        }
        console.log(input.value);
    }
    
    
    
    /*******************/
     /* PAJAREO */
    /******************/
    
    function calcularManoObra(){
            
            console.log("B"+document.getElementById('valorManoObra').value);
            var c = toFloat(document.getElementById('cantidadManoObra').value);
            var v = toFloat(document.getElementById('valorManoObra').value.replace(/\./g,""));
           
            document.getElementById('valorTotalManoObra').value = (c*v);
            format(document.getElementById('valorTotalManoObra'));
            
            calcularTotales();

        }
        
        function calcularPolvora(){
            
            console.log("B"+document.getElementById('valorPolvora').value);
            var c = toFloat(document.getElementById('cantidadPolvora').value);
            var v = toFloat(document.getElementById('valorPolvora').value.replace(/\./g,""));

           
            document.getElementById('valorTotalPolvora').value = (c*v);
            format(document.getElementById('valorTotalPolvora'));
            
            calcularTotales();

        }


        function calcularTotales(){
            var t1 =  toFloat(document.getElementById('valorTotalManoObra').value.replace(/\./g,""));
            var t2 = toFloat(document.getElementById('valorTotalPolvora').value.replace(/\./g,""));
            
            document.getElementById('sumaTotal').value = (t1+t2);
            format(document.getElementById('sumaTotal'));
        }
        
        
    function format(input){
             
        var num = input.value.replace(/\./g,'');
        if(!isNaN(num)){
            num = num.toString
            ().split('').reverse().join('').replace(/(?=\d*?\.?)(\d{3})/g,'$1.');
            num = num.split('').reverse().join('').replace(/^[\.]/,'');
            input.value = num;
        }
        console.log(input.value);
    }
    
    function VentanaEmergenteD(){
        
        if(confirm("¿Desea Guardar La Información?")){
            $("#registrarD_E_M").submit();
            alert("Informacion Guardada Exitosamente");
        }
    }
    
    function VentanaEmergenteP(){
        
        if(confirm("¿Desea Guardar La Información?")){
            $("#Pajareo").submit();
            alert("Informacion Guardada Exitosamente");
        }
    }
    
    function VentanaEmergenteCB(){
        
        if(confirm("¿Desea Guardar La Información?")){
            $("#Corta_Bultos").submit();
            alert("Informacion Guardada Exitosamente");
        }
    }
    
     function VentanaEmergenteCG(){
        
        if(confirm("¿Desea Guardar La Información?")){
            $("#Corta_Granel").submit();
            alert("Informacion Guardada Exitosamente");
        }
    }