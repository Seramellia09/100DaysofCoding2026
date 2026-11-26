import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumnama = in.nextInt();
        in.nextLine();
        String[] dicari = new String[jumnama];

        for (int i = 0; i < dicari.length; i++) {
            System.out.print("Masukkan Nama ke-" + (i + 1) + ":" + " ");
            dicari[i] = in.nextLine();
        }
        System.out.print("Masukkan nama yang dicari: ");
        String namatampungan = in.nextLine();

        boolean ditemukan = false;
        for (int j = 0; j < dicari.length; j++) {
            if (dicari[j].equalsIgnoreCase(namatampungan)) {
                System.out.println("Nama " + dicari[j] + " ditemukan.");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Nama " + namatampungan + " Tidak Ditemukan");
        }
    }
}
