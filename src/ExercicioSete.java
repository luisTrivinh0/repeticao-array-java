public class ExercicioSete {
  public static void main(String[] args) {

    int[] vetor = { 0, -5, 10, 14, 2, -3 };
    int count = 0;
    int length = (vetor.length - 1);

    System.out.println("Ordem da array: ");
    while (count <= vetor.length - 1) {
      System.out.println(vetor[count]);
      count++;
    }
    System.out.println("Ordem inversa da array: ");
    while (length >= 0) {
      System.out.println(vetor[length]);
      length--;
    }
  }
}
