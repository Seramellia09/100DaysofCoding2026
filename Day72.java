import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menu;

        do {
            System.out.println("\n=== KANTIN KAMPUS ===");
            System.out.println("1. Nasi Goreng (Rp15.000)");
            System.out.println("2. Mie Goreng (Rp12.000)");
            System.out.println("3. Ayam Geprek (Rp18.000)");
            System.out.println("4. Keluar");
            System.out.print("\nPilih Menu: ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\nAnda Memilih Nasi Goreng");
                    System.out.println("Harga: Rp15.000");
                    break;

                case 2:
                    System.out.println("\nAnda Memilih MIe Goreng");
                    System.out.println("Harga: Rp12.000");
                    break;

                case 3:
                    System.out.println("\nAnda Memilih Ayam Geprek");
                    System.out.println("Harga: Rp18.000");
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia!");
            }

        } while (menu != 4);
      in.close();
    }
}
