

let funciones = [function(){a=1+2;},
  function(){console.log(1+2);},
  function(){console.log(3);},
  function(){b = 3 + 4;},
  function(){console.log("3+4");},
  function(){c = 5 + 6;},
  function(){console.log("5+6");},
  function(){console.log(11);}]
let lineasCodigo = [
  "a=1+2;",
  "console.log(1+2);",
  "console.log(3);",
  "b = 3 + 4;",
  'console.log("3+4");',
  'c = 5 + 6;',
  'console.log("5+6");',
  'console.log(11);'
]
let f1 = function(){a=1+2;}
const outputDiv = document.getElementById('output');
const numProcesos = parseInt(prompt('Por favor, introduce el número de procesos a simular:'));
if(numProcesos<1|| isNaN(numProcesos)){
  numProcesos = parseInt(prompt('Por favor, introduce un número válido de procesos.'));
}
else{
let objetos = [];
for(let i =0;i<numProcesos;i++){
  
    objetos[i] = new Object();
    let canf = Math.floor(Math.random()*5);
    objetos[i].funciones = [];
    objetos[i].codigo = [];
    for(let j = 0; j <canf; j ++){
      let numf = Math.floor(Math.random()*funciones.length);
      objetos[i].funciones[j]= funciones[numf];
      objetos[i].codigo[j] = lineasCodigo[numf];
    }
    objetos[i].terminar = false;
}
let band = true;
let num = 0;
while(band){
  
  band = goTurno(objetos,num);
  num++;
}
}
function goTurno(a,num){
  let bandera = false;
  for(let i =0;i<a.length;i++){
    
    if(!a[i].terminar){
      bandera = true;
      a[i].funciones[num]();
      outputDiv.innerHTML+= `<p>proceso ${i+1}`;
      outputDiv.innerHTML+= `<p>Línea de código : ${a[i].codigo[num]}`;
    }
    if(num == a[i].funciones.length-1){
      a[i].terminar = true;
    }
    else if(num == a[i].funciones.length){
      outputDiv.innerHTML+= `<p>proceso ${i+1}: <p>Terminar`;
    }
  }
  return bandera;
}