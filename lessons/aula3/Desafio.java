package lessons.aula3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Desafio {
    public Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        List<Object> pessoa = new ArrayList <Object>();
        Desafio desafio = new Desafio();
        pessoa.add(desafio.EscreverMeunome());
        pessoa.add(desafio.verificarIdade());
        System.out.println(pessoa);
    }
    public String EscreverMeunome(){   
        System.out.println("escreva seu nome");
        String nome = input.nextLine();
        return nome;
    }
    public int verificarIdade(){
        System.out.println("insira a idade");
        int idade = Integer.parseInt(input.nextLine());
        if (idade > 18){
            System.out.println("maior de idade");
        }
        
        if(idade<18){
            System.out.println("menor de idade");
        }
        return idade;
    }
}
