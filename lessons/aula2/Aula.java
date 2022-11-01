package lessons.aula2;

import java.util.Scanner;

public class Aula {
    int numero;
    int divisor;
    
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Aula aula = new Aula();
        
        System.out.println("insira o valor divisor");
        aula.divisor = Integer.parseInt(aula.input.nextLine());
       
        System.out.println("insira o numero a ser divido");
        aula.numero = Integer.parseInt(aula.input.nextLine());
        
        aula.calcularDivisibilidade(aula.numero,aula.divisor);
    }
    public void calcularDivisibilidade(int numero,int divisor){
        boolean isdiisible = numero%divisor == 0;
        if(isdiisible){
            System.out.println("o numero "+ numero+" é divisivél por " + divisor);
        }
        if(!isdiisible){
            System.out.println("o numero "+ numero+" não é divisivél por " + divisor);
        }
    }
}
