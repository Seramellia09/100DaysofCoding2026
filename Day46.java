import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.println("=== MENU LAYANAN MAHASISWA ===");
System.out.println("1. Melihat Jadwal Kuliah");
System.out.println("2. Melihat Informasi Nilai");
System.out.println("3. Melihat Informasi Akademik");
System.out.println("4. Keluar Dari Program");
System.out.print("Masukkan Pilihan Menu: ");
int menu = in.nextInt();

switch (menu){
    case 1:
    System.out.println("Anda Memilih Layanan Jadwal Kuliah");
    break;
    case 2:
    System.out.println("Anda Memilih Layanan Informasi Nilai");
    break;
    case 3:
    System.out.println("Anda Memilih Layanan Informasi Akademik");
    break;
    case 4:
    System.out.println("Anda Memilih Keluar Dari Program");
    break;
    default:
    System.out.println("Pilihan Tidak Tersedia");
  }
 }
}
