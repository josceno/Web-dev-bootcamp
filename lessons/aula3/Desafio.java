package lessons.aula3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Desafio {
    public Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        List<Object> pessoa = new ArrayList <Object>();
        Desafio desafio = new Desafio();
        String pessoanome = desafio.EscreverMeunome();
        System.out.println("insira a idade");
        int idade = Integer.parseInt(desafio.input.nextLine());
        desafio.verificarIdade(pessoanome, idade);
        pessoa.add(pessoanome);
        pessoa.add(idade);
    }
    public String EscreverMeunome(){   
        System.out.println("escreva seu nome");
        String nome = input.nextLine();
        return nome;
    }
    public void verificarIdade(String nome, int idade){
        
        if (idade > 18){
            System.out.println(nome+" tem "+ idade +" e é maior de idade");
        }
        
        if(idade<18){
            System.out.println(nome+" tem "+ idade +"anos e é menor de idade");
        }
    
    }
}
