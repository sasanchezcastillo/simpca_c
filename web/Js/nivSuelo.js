/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//CALCULAR VALOR TOTAL DE CABALLONEO
    function calcularTotalCaballoneo(){
        var cantC= document.getElementById('cantCab').value;
        var pasesC= document.getElementById('pasesCab').value;
        var valorUnitarioC= document.getElementById('valorUnitarioCab').value.replace(/\./g,"");
        
        document.getElementById('valorTotalCab').value=(cantC*pasesC)*valorUnitarioC;
        format(document.getElementById('valorTotalCab'));
        calcularTotal();
    }
        
//CALCULAR VALOR TOTAL DE CINCEL 
    function calcularTotalCincel(){
        var cantC= document.getElementById('cantCin').value;
        var pasesC= document.getElementById('pasesCin').value;
        var valorUnitarioC= document.getElementById('valorUnitarioCin').value.replace(/\./g,"");
                
        document.getElementById('valorTotalCin').value=(cantC*pasesC)*valorUnitarioC;
        format(document.getElementById('valorTotalCin'));
        calcularTotal();
    }
       
        
//CALCULAR VALOR TOTAL DE GRADA
    
    function calcularTotalGrada(){
        var cantG= document.getElementById('cantGrada').value;
        var pasesG= document.getElementById('pasesGrada').value;
        var valorUnitarioG= document.getElementById('valorUnitarioGrada').value.replace(/\./g,"");
        
        document.getElementById('valorTotalGrada').value=(cantG*pasesG)*valorUnitarioG;
        format(document.getElementById('valorTotalGrada'));
        calcularTotal();
    }
        
//CALCULAR VALOR TOTAL DE PALA

    function calcularTotalPala(){
        var cantP= document.getElementById('cantPala').value;
        var pasesP= document.getElementById('pasesPala').value;
        var valorUnitarioP= document.getElementById('valorUnitarioPala').value.replace(/\./g,"");
                
        document.getElementById('valorTotalPala').value=(cantP*pasesP)*valorUnitarioP;
        format(document.getElementById('valorTotalPala'));
        calcularTotal();
    }
    
//CALCULAR VALOR TOTAL DE PALA CAJÓN

            function calcularTotalPC(){
                var cantP= document.getElementById('cantPC').value;
                var pasesP= document.getElementById('pasesPC').value;
                var valorUnitarioP= document.getElementById('valorUnitarioPC').value.replace(/\./g,"");
                
                document.getElementById('valorTotalPC').value= (cantP*pasesP)*valorUnitarioP;
                format(document.getElementById('valorTotalPC'));
                calcularTotal();
            }

        
//CALCULAR VALOR TOTAL DE PALA LÁSER
      
    function calcularTotalPL(){
        var cantP= document.getElementById('cantPL').value;
        var pasesP= document.getElementById('pasesPL').value;
        var valorUnitarioP= document.getElementById('valorUnitarioPL').value.replace(/\./g,"");
                
        document.getElementById('valorTotalPL').value= (cantP*pasesP)*valorUnitarioP;
        format(document.getElementById('valorTotalPL'));
        calcularTotal();
    }

//CALCULAR VALOR TOTAL DE PALO
    
    function calcularTotalPalo(){
        var cantP= document.getElementById('cantPalo').value;
        var pasesP= document.getElementById('pasesPalo').value;
        var valorUnitarioP= document.getElementById('valorUnitarioPalo').value.replace(/\./g,"");
                
        document.getElementById('valorTotalPalo').value= (cantP*pasesP)*valorUnitarioP;
        format(document.getElementById('valorTotalPalo'));
        calcularTotal();
    }

//CALCULAR VALOR TOTAL DE RASTRA
        
    function calcularTotalRastra(){
        var cantP= document.getElementById('cantRastra').value;
        var pasesP= document.getElementById('pasesRastra').value;
        var valorUnitarioP= document.getElementById('valorUnitarioRastra').value.replace(/\./g,"");
                
        document.getElementById('valorTotalRastra').value= (cantP*pasesP)*valorUnitarioP;
        format(document.getElementById('valorTotalRastra'));
        calcularTotal();
    }

//CALCULAR VALOR TOTAL DE RASTRILLO
        
    function calcularTotalRastrillo(){
        var cantP= document.getElementById('cantRast').value;
        var pasesP= document.getElementById('pasesRast').value;
        var valorUnitarioP= document.getElementById('valorUnitarioRast').value.replace(/\./g,"");
                
        document.getElementById('valorTotalRast').value= (cantP*pasesP)*valorUnitarioP;
        format(document.getElementById('valorTotalRast'));
        calcularTotal();
    }

//CALCULAR VALOR TOTAL DE TAIPA

    function calcularTotalTaipa(){
        var cantP= document.getElementById('cantTaipa').value;
        var pasesP= document.getElementById('pasesTaipa').value;
        var valorUnitarioP= document.getElementById('valorUnitarioTaipa').value.replace(/\./g,"");
                
        document.getElementById('valorTotalTaipa').value= (cantP*pasesP)*valorUnitarioP;
        format(document.getElementById('valorTotalTaipa'));
        calcularTotal();
    }

        
//CALCULAR VALOR TOTAL DE ZANJADORA-->

    function calcularTotalZanja(){
        var cantP= document.getElementById('cantZanja').value;
        var pasesP= document.getElementById('pasesZanja').value;
        var valorUnitarioP= document.getElementById('valorUnitarioZanja').value.replace(/\./g,"");
                
        document.getElementById('valorTotalZanja').value= (cantP*pasesP)*valorUnitarioP;
        format(document.getElementById('valorTotalZanja'));
        calcularTotal();
    }

        
//CALCULAR EL VALOR TOTAL
    function calcularTotal(){
        var t1= toInt(document.getElementById('valorTotalCab').value.replace(/\./g,""));
        var t2= toInt(document.getElementById('valorTotalCin').value.replace(/\./g,""));
        var t3= toInt(document.getElementById('valorTotalGrada').value.replace(/\./g,""));
        var t4= toInt(document.getElementById('valorTotalPala').value.replace(/\./g,""));
        var t5= toInt(document.getElementById('valorTotalPC').value.replace(/\./g,""));
        var t6= toInt(document.getElementById('valorTotalPL').value.replace(/\./g,""));
        var t7= toInt(document.getElementById('valorTotalPalo').value.replace(/\./g,""));
        var t8= toInt(document.getElementById('valorTotalRastra').value.replace(/\./g,""));
        var t9= toInt(document.getElementById('valorTotalRast').value.replace(/\./g,""));
        var t10= toInt(document.getElementById('valorTotalTaipa').value.replace(/\./g,""));
        var t11= toInt(document.getElementById('valorTotalZanja').value.replace(/\./g,""));
                
        document.getElementById('Total').value= (t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11);
        format(document.getElementById('Total'));        
    }
    
    function toInt(str){
        if (str == null || str == ""){
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
            $("#RegistrarPS").submit();
            alert("Información Guardada Exitosamente");
        }
    }