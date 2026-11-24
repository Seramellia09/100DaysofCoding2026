import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah Data: ");
        int data = in.nextInt();
        int[] jumlah = new int[data];

        for (int i = 0; i < jumlah.length; i++) {
            System.out.print("Masukkan Nilai ke-" + (i + 1) + ": ");
            jumlah[i] = in.nextInt();

        }
        int maks = jumlah[0];
        for (int j = 0; j < jumlah.length; j++) {
            if (jumlah[j] > maks) {
                maks = jumlah[j];
            }
        }
        System.out.println("Nilai Tertinggi: " + maks);

    }
}
