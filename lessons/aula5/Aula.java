package lessons.aula5;

public class Aula {
    public static void main(String[] args){
        Pessoa Jorge = new Pessoa("Jorge", 1.70, 70);
        Jorge.calcularIMC();
    }
}
class Pessoa extends Ocupação{
    String nome;
    public Pessoa(String nome,double altura, double peso) {
        super(altura, peso);
        this.nome = nome;     
    }
    public void calcularIMC(){
        double IMC = altura/peso;
        System.out.println(IMC); 
    }

}

abstract class Ocupação{
    double altura;
    double peso;
    public Ocupação(double d,double peso){
      
        this.altura = d;
        this.peso = peso;
    }
}
