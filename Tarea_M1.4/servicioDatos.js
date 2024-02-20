// let finDeTransmisionDeDatos = function(id){
//     console.log('Transferencia',id,'terminada');
// }
// let obtenDatosDeInternet = function(id,duracion){
//     console.log('Proceso',id,'obteniendo datos de Internet');
//     setTimeout(finDeTransmisionDeDatos,duracion,id);
// }
// // -----------------------------------------------------
// let finDeTransmisionDeDatos = function(id,callback){
//     console.log('Transferencia',id,'terminada');
//     callback();
// }
// let obtenDatosDeInternet = function(id,duracion,callback){
//     console.log('Proceso',id,'obteniendo datos de Internet');
//     setTimeout(finDeTransmisionDeDatos,duracion,id,callback);
// }
// //------------------------------------------------------
let finDeTransmisionDeDatos = function(id) {
    console.log('Transferencia', id, 'terminada');
}

let obtenDatosDeInternet = function(id, duracion) {
    console.log('Proceso', id, 'obteniendo datos de Internet');
    return new Promise((callback, error) => {
        setTimeout(() => {
            finDeTransmisionDeDatos(id);
            callback();
        }, duracion);
    });
}
module.exports.getDatos = obtenDatosDeInternet;