import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
        System.out.print("Masukkan Jumlah barang: ");
        int jumlah = in.nextInt();
        int[] jumbarang = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumbarang.length; i++) {
            System.out.print("Masukkan harga Barang ke- " + (i + 1) + " :");
            jumbarang[i] = in.nextInt();
            total += jumbarang[i];

        }
        System.out.println("\nTotal Belanja: " + total);

    }
}
