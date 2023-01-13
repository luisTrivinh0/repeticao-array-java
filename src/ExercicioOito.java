import java.util.Scanner;

public class ExercicioOito {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] consoantes = new String[6];
    int quatidadeConsoantes = 0;

    int count = 0;
    do {
      System.out.print("Letra: ");
      String letra = scan.next();

      if(!(letra.equalsIgnoreCase("a") ||
           letra.equalsIgnoreCase("e") ||
           letra.equalsIgnoreCase("i") ||
           letra.equalsIgnoreCase("o") ||
           letra.equalsIgnoreCase("u"))) {

        consoantes[count] = letra;
        quatidadeConsoantes++;
      }

      count++;
    } while (count < consoantes.length);

    System.out.print("Consoantes: ");
    for (String consoante : consoantes) {
      if(consoante != null)
        System.out.print(consoante + " ");
    }
    System.out.println("Quantidade: " + quatidadeConsoantes);

    scan.close();
  }
}
