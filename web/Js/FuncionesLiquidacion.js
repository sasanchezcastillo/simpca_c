/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var kilo = 0;
      var peso = 0;
      var unitario = 0;
      var total = 0;
      function Sumar(){
        var total_peso = 0, total_kilo=0, total_und=0, total_totales=0;
        for(var j = 0; j <= contadorFilas; j++){
            total_peso += toFloat($("#pesoFinal"+j).val().toString().replace(/\./g,""));
            total_kilo += toFloat($("#kilosVerde"+j).val().toString());
            total_und += toFloat($("#valorUnitario"+j).val().toString().replace(/\./g,""));
            total_totales +=toFloat($("#valorTotal"+j).val().toString().replace(/\./g,""));
        }
        
        console.log("peso "+total_peso);
        console.log("totales"+total_totales);
        console.log("unid"+total_und);
        console.log("kilo"+total_kilo);
        $("#TotalpesoFinal").val(total_peso);
        $("#TotalkilosVerde").val(total_kilo);
        $("#totalvalorUnitario").val(total_und);
        $("#totalvalorTotal").val(total_totales); 
    }
      
         function liquidacion(x, idFila) {
             
            console.log("A" + document.getElementById('valorUnitario'+ idFila).value);
            var c = toFloat(document.getElementById('pesoFinal'+ idFila).value.replace(/\./g,"")) ;
            var v = toFloat(document.getElementById('valorUnitario'+ idFila).value.replace(/\./g,""));
            
            toFloat(document.getElementById('valorTotal'+ idFila).value = (c * v));
            format(document.getElementById('valorTotal'+ idFila)); 
            Sumar();       
        }
                    
        var contadorFilas = 0;
        function agregarFilaTabla() {
            Sumar();
            contadorFilas++;
            var i = contadorFilas;
            var fila_nueva = '<tr>' +
                    '<td align="center"><input type="date" style="font-family: Times New Roman; font-size: 16px;" class="textboxF" name="fecha" id="fecha' + i + '"/></td>' +
                    '<td><input type="text" class="textbox" name="tiquete" id="tiquete' + i + '"/></td>' +
                    '<td><input type="text" class="textbox" name="pesoNeto" id="pesoNeto' + i + '"/></td>' +
                    '<td><input type="text" class="textbox" name="bultos" id="bultos' + i + '"/></td>' +
                    '<td><input type="text" class="textbox" name="pesoFinal" id="pesoFinal' + i + '" onchange="javascript: liquidacion(this,' + i + ');format(this); valorTotal(this,' + i + ')" /></td>' +
                    '<td><input type="text" class="textbox" name="f24" id="fertilizante_a' + i + '"/></td>' +
                    '<td><input type="text" class="textbox" name="f4" id="fertilizante_b' + i + '"/></td>' +
                    '<td><input type="text" class="textbox" name="kilosVerde" id="kilosVerde' + i + '"/></td>' +
                    '<td><input type="text" class="textbox" name="valorUnitario" id="valorUnitario' + i + '" onkeyup="liquidacion(this,' + i + '); format(this,' + i + '); " onchange="format(this,' + i + ')"/></td>' +
                    '<td><input type="text" class="textbox" style="background-color:#CCC; width: 120px;" name="valorTotal" id="valorTotal' + i +'" onkeyup="format(this,' + i + '); " onchange="format(this,' + i + ')"/></td>' +
                    '</tr>';
            $("#cuerpoTabla").append(fila_nueva);  
        }
        
    function toFloat(str){
            if(str == null || str == ""){
                return 0;
            }
            return parseFloat(str);
        }
        
    function format(input,x){
        var num = input.value.replace(/\./g,'');
        if(!isNaN(num)){
            num = num.toString().split('').reverse().join('').replace(/(?=\d*?\.?)(\d{3})/g,'$1.');
            num = num.split('').reverse().join('').replace(/^[\.]/,'');
            input.value = num;
        }
    }
    
    function VentanaEmergenteL(){
        
        if(confirm("¿Desea Guardar La Información?")){
            $("#Liquidacion").submit();
            alert("Informacion Guardada Exitosamente");
        }
    }
    
    function parafiscales(){
        var total = toFloat(document.getElementById('totalvalorTotal').value);
        var fomento_arrocero = toFloat(total * 0.05);
        
        document.getElementById('fomento-arrocero').value = (fomento_arrocero);
        format(document.getElementById(fomento-arrocero));
    }
    
    function selector(value){
        var total = toFloat(document.getElementById('totalvalorTotal').value);
        var bolsa_agropecuaria = toFloat(total * 0.03);
        var comision_bolsa = toFloat(total * 0.03);
        var retencion_fuente = toFloat(total * 0.15);
        
        if(value === "bolsa"){
            
            document.getElementById('option').value = (bolsa_agropecuaria + comision_bolsa);
            format(document.getElementById('option'));
        }else if(value === "retencion"){
            
            document.getElementById('option').value = (retencion_fuente);
            format(document.getElementById('option'));
        }
    }