import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // membuat objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        String Nama;
        int Umur;
        double Tinggi;
        char jenis_kelamin;

        System.out.print("Nama: ");
        Nama = input.nextLine();

        System.out.print("Umur: ");
        Umur = input.nextInt();

        System.out.print("Tinggi: ");
        Tinggi = input.nextDouble();

        System.out.print("Jenis_Kelamin: ");
        jenis_kelamin = input.next().charAt(0);

        // output menggunakan printf
        System.out.println("\n=== BIODATA ===");
        System.out.printf("Nama\t\t: %s%n", Nama);
        System.out.printf("Umur\t\t: %d tahun\n", Umur);
        System.out.printf("Tinggi\t\t: %.1f cm\n", Tinggi);
        System.out.printf("Jenis_Kelamin\t: %c\n", jenis_kelamin);

        input.close();

    }
}
