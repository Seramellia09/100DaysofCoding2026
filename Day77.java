import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap   : ");
        String namalengkap = in.nextLine();
        System.out.print("Konfirmasi nama lengkap :");
        String konfirmasi = in.nextLine();
        System.out.print("Masukkan program studi  :");
        String prodi = in.nextLine();
        System.out.print("Masukkan alamat email   :");
        String email = in.nextLine();

        String hasiltrim = namalengkap.trim();
        int panjang = namalengkap.length();
        String kapital = namalengkap.toUpperCase();
        String kecil = namalengkap.toLowerCase();
        String indeks = namalengkap.substring(0, 3);
        String replace = namalengkap.replace(" ", "_");
        boolean kosong = namalengkap.isEmpty();
        boolean namasesuai = namalengkap.equals(konfirmasi);
        boolean studi = prodi.equalsIgnoreCase(prodi);
        boolean emailkampus = email.contains(email);

        System.out.println();
        System.out.println();
        System.out.println("Nama Setelah Trim       : " + hasiltrim);
        System.out.println("Jumlah karakter         : " + panjang);
        System.out.println("Nama Huruf Kapital      : " + kapital);
        System.out.println("Nama Huruf Kecil        : " + kecil);
        System.out.println("Tiga Karakter Pertama   : " + indeks);
        System.out.println("Nama Setelah Replace    : " + replace);
        System.out.println("Nama Kosong             : " + kosong);
        System.out.println("Konfirmasi Nama Sesuai  : " + namasesuai);
        System.out.println("Program Studi Sesuai    : " + studi);
        System.out.println("Email Kampus            : " + emailkampus);

    }
}
