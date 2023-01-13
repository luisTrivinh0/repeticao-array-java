import java.util.Random;

public class ExercicioNove {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numerosAleatorios = new int[20];

    for (int i = 0; i < numerosAleatorios.length; i++) {
      numerosAleatorios[i] = random.nextInt(0, 60);
    }
    System.out.println("Sucessores dos números aleatórios: ");
    for (int numero : numerosAleatorios) {
      System.out.print((numero + 1) + " ");
    }

    System.out.println("");
    System.out.println("Números aleatórios: ");
    for (int numero : numerosAleatorios) {
      System.out.print(numero + " ");
    }


    System.out.println("");
    System.out.println("Antecessores dos números aleatórios: ");
    for (int numero : numerosAleatorios) {
      System.out.print((numero - 1) + " ");
    }

  }
}
