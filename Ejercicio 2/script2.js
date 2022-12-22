var temperatura = parseInt(prompt("Ingresa el valor de la temperatura en grados Celcius."));

console.log("El tipo de valor que ingresaste es: " + typeof(temperatura));


if(typeof(temperatura) != "number"){
    console.log("Debes ingresar un valor numérico válido.");
}else{
    let temF = (temperatura*9/5) + 32;
    let temK = temperatura + 273.15;
    console.log("El valor equivalente en grados Fahrenheit es de :" + temF + "°");
    console.log("El valor equivalente en grados Kelvin es de :" + temK + "°");
} 


