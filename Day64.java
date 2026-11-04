import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        long faktorial = 1;

        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }
        System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);

        in.close();
    }
}
