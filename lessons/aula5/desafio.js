class Carros{
    marca;
    cor;
    gastomedio;
    constructor(brand,color,gastomedioporkm){
        this.marca = brand;
        this.cor = color;
        this.gastomedio =  gastomedioporkm
        
    }
    calculogastomedio(preco) {
        this.gastomedio = this.gastomedio*preco   
    }
}
   
const valorcombustivel =5.79
let carros = new Carros('ford','azul',1580/12)

carros.calculogastomedio(valorcombustivel)

console.log('R$'+carros.gastomedio.toFixed(2))