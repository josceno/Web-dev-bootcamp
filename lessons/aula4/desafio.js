class pessoa{
    nome;
    idade;
    constructor(name,age){
        this.nome = name;
        this.idade = age; 
    }
}
victor = new pessoa('victor',23)
joao = new pessoa("joao",40)
function comparaidade(){
    switch(victor.idade>joao.idade){
        case true:
            console.log('victor é mais velho')
            break;
        case false:
            console.log('joao é mais velho')   
            break; 
    }
}
comparaidade();