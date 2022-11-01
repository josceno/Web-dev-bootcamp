let dicionario = {"a":6.66,"b":5.79,'c':4.90}
let  consumodocarro = 12
let distaniapercorrida = 1580.00

function calcularGasto(tipo,consumo,distancia){
    return (distancia/consumo * tipo).toFixed(2)
}

for (i in dicionario){
    console.log(calcularGasto(dicionario[i],consumodocarro,distaniapercorrida))
}


