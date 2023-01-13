import java.util.Scanner;

public class ExercicioUm {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;
    int sn;

    System.out.println("Bem vindo ao sistema de cadastro!");
    while (true) {
      System.out.print("Nome: ");
      nome = scan.next();
      System.out.print("Idade: ");
      idade = scan.nextInt();

      System.out.println("Seu nome é " + nome);
      System.out.println("Sua idade é " + idade + " anos");

      System.out.println("Deseja cadastrar outra pessoa? [1: SIM / 0: NAO]");
      sn = scan.nextInt();
      if (sn == 0)
        break;
      System.out.println("");
      System.out.println("Novo Cadastro");
    }
    System.out.println("Obrigado por usar nossos sistemas!");
    scan.close();
  }
}
