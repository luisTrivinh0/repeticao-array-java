import java.util.Scanner;

public class ExercicioSeis {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int sn;

    System.out.println("Bem vindo ao seu auxiliar de matemática da Triwo!");

    while (true) {
      System.out.print("Digite o fatorial desejada: ");
      numero = scan.nextInt();

      int fatorial = 1;

      System.out.print(numero +"! = ");
      for (int i = numero; i >= 1; i--) {
        fatorial = fatorial * i;
      }

      System.out.println(fatorial);
      System.out.println("Deseja ver outro fatorial? [1: SIM / 0: NAO]");
      sn = scan.nextInt();

      if (sn == 0)
        break;
      System.out.println("");
      System.out.println("Novo Fatorial");
    }
    System.out.println("Obrigado por usar nossos sistemas!");
    scan.close();
  }
}
