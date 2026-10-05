import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

    int nilai = in.nextInt();

    if (nilai >= 90) {
        System.out.println("Nilai Anda: A");
    } else if (nilai >= 80) {
        System.out.println("Nilai Anda: B");
    } else if (nilai >= 70) {
        System.out.println("Nilai Anda: C");
    } else {
        System.out.println("Nilai Anda: D");

    }
  }
}
