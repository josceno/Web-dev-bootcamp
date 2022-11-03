const pessoa={
  nome : "jorge",
  idade: 21,
  exibir(){
        console.log(this.nome)
  }
}
pessoa['nome'] = 'rogerio'
pessoa.nome = "roger"
pessoa.exibir()