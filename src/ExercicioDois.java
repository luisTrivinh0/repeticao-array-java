import java.util.Scanner;

public class ExercicioDois {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String materia;
    Double nota;
    Integer sn;

    System.out.println("Bem vindo ao Portal da Triwo School!");
    while (true) {
      System.out.print("Digite a Matéria: ");
      materia = scan.next();
      System.out.print("Digite a nota para calcular sua média: ");
      nota = scan.nextDouble();

      while (nota < 0 || nota > 10) {
        System.out.println("Nota Inválida!");
        System.out.print("Digite a nota novamente: ");
        nota = scan.nextDouble();
      }
      if (nota < 5)
        System.out.println("Você ficou de recuperação em " + materia + "!");
      else if (nota == 5)
        System.out.println("Você foi para a prova final em " + materia + "!");
      else if (nota > 5 && nota < 9)
        System.out.println("Você foi aprovado em " + materia + "!");
      else
        System.err.println("Você tirou a nota máxima em " + materia + "! Parabéns!!");

      System.out.println("Deseja ver outra matéria? [1: SIM / 0: NAO]");
      sn = scan.nextInt();

      if (sn == 0)
        break;
      System.out.println("");
      System.out.println("Nova Matéria");
    }
    System.out.println("Obrigado por usar nossos sistemas!");
    scan.close();
  }
}
