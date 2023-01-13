import java.util.Scanner;

public class ExercicioCinco {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int sn;

    System.out.println("Bem vindo ao seu auxiliar de matemática da Triwo!");

    while (true) {
      System.out.print("Digite a tabuada desejada: ");
      numero = scan.nextInt();

      int i;
      for (i = 1; i <= 10; i++) {
        System.out.println(numero + " X " + i + " = " + (numero * i));
      }
      System.out.println("Deseja ver outra tabuada? [1: SIM / 0: NAO]");
      sn = scan.nextInt();

      if (sn == 0)
        break;
      System.out.println("");
      System.out.println("Nova Tabuada");
    }
    System.out.println("Obrigado por usar nossos sistemas!");
    scan.close();
  }

}
