import java.util.Scanner;

public class ExercicioTres {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double numero;
    double maior = 0;
    int count = 0;
    double soma = 0;

    do{
      System.out.print("Número: ");
      numero = scan.nextDouble();
      if (numero > maior)
        maior = numero;
      soma = soma + numero;
      count++;
    } while (count < 5);

    System.out.println("A média dos números digitados é " + (soma / 5));
    System.out.println("O maior número digitado é " + maior);

    scan.close();
  }
}
