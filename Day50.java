import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = in.nextInt();

        String status = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah bilangan " + status);
        
        in.close();
    }
}
