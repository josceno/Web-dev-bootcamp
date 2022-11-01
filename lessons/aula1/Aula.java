package lessons.aula1;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Aula{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Double precocombustivel = 5.79;
        System.out.println("insira o consumo do carro(kilometros por litro)");
        int kilometroporlitor = Integer.parseInt(scanner.nextLine());
        System.out.println("insira a kilometragem rodada");
        Double distancia = Double.parseDouble(scanner.nextLine());

        System.out.println(calcularconsumo(precocombustivel, kilometroporlitor, distancia));
    }
    public static double calcularconsumo(double preco, int consumo, double distanica){
        String valor = new DecimalFormat("#,##0.00").format(distanica/consumo * preco);
        String value[] = valor.split("");
        int index = Arrays.asList(value).indexOf(",");
        value[index] = ".";
      
        valor = String.join("", value);

        return Double.parseDouble(valor);
    }
}

