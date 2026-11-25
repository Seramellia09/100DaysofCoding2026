import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data: ");
        int n = in.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan Nilai ke-" + (i + 1) + ":" + " ");
            angka[i] = in.nextInt();
        }
        int min = angka[0];
        for (int j = 0; j < angka.length; j++) {
            if (angka[j] < min) {
                min = angka[j];
            }
        }
        System.out.println("Nilai Terendah: " + min);

    }
}
