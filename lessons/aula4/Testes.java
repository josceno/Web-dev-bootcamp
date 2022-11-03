package lessons.aula4;

import java.util.Scanner;

public class Testes{
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa("joao",0);
       System.out.println(pessoa.getnome());
    }

}
class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String name, int age){
       nome = name;
       idade = age;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String name){
        this.nome =name;
    }

}