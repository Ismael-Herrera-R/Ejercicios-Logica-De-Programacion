var x = parseInt(prompt("Ingresa el primer valor: "));
var y = parseInt(prompt("Ingresa el segundo valor: "));
var z = parseInt(prompt("Ingresa el tercer valor: "));

if(x == y == z){
    console.log("Los tres números son iguales.")
}else{
    if(x > y && x > z){
        if(y > z){
            console.log("El orden descendente de los números es: " + x + ", " + y + ", " + z);
            console.log("El orden ascendente de los números es: " + z + ", " + y + ", " + x);
        }else{
            console.log("El orden descendente de los números es: " + x + " " + z + " " + y);
            console.log("El orden ascendente de los números es: " + y + " " + z + " " + x);
        }
    }else if (y > x && z > x){
        if(y > z){
            console.log("El orden descendente de los números es: " + y + " " + z + " " + x);
            console.log("El orden ascendente de los números es: " + x + " " + z + " " + y);
        }else{
            console.log("El orden descendente de los números es: " + z + " " + y + " " + x);
            console.log("El orden ascendente de los números es: " + x + ", " + y + ", " + z);
        }
    }
}