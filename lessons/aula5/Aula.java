package lessons.aula5;

public class Aula {
    public static void main(String[] args){
        Pessoa Jorge = new Pessoa("Jorge", 1.70, 70);

        Jorge.getID(1);
        Jorge.calcularIMC();
    }
}
class Pessoa extends Medidas implements PessoaId{
    String nome;
    public Pessoa(String nome,double altura, double peso) {
        super(altura, peso);
        this.nome = nome;     
    }
    public void calcularIMC(){
        double IMC = Peso()/Altura();
        System.out.println(IMC); 
    }
    @Override
    public void getID(int id) {
       System.out.println(id);
    }

}

abstract class Medidas{
    private double altura;
    private double peso;
    public Medidas(double altura,double peso){     
        this.altura = altura;
        this.peso = peso;
    }
    public double Altura(){
        return altura;
    }
    public void setaltura(double altura){
        this.altura = altura;
    }
    public double Peso(){
        return peso;
    }
    public void setpeso(double peso){
        this.peso = peso;
    }
}
interface PessoaId{
    void getID(int id);
}
