const servicio = require("./servicioDatos");

// servicio.getDatos(1,3000);
// servicio.getDatos(2,500);
// servicio.getDatos(3,4000);
// servicio.getDatos(4,700);
// servicio.getDatos(5,3500);
// // -------------------------------------------
// servicio.getDatos(1,300,function(){
//     servicio.getDatos(2,500,function(){
//         servicio.getDatos(3,4000,function(){
//             servicio.getDatos(4,700,function(){
//                 servicio.getDatos(5,3500,function(){})
//             })
//         })
//     })
// });
// // -------------------------------------------


// Utilizando async/await
async function obtenerDatos() {
try {
    console.log("Metodo await");
    await servicio.getDatos(1, 300);
    await servicio.getDatos(2, 500);
    await servicio.getDatos(3, 4000);
    await servicio.getDatos(4, 700);
    await servicio.getDatos(5, 3500);
} catch (error) {
    console.error("Error al obtener datos:", error);
}
}
console.log("Metodo then()");
servicio.getDatos(1, 300)
.then(() => servicio.getDatos(2, 500))
.then(() => servicio.getDatos(3, 4000))
.then(() => servicio.getDatos(4, 700))
.then(() => servicio.getDatos(5, 3500))
.then(()=>obtenerDatos())
.catch(error => console.error("Error al obtener datos:", error));