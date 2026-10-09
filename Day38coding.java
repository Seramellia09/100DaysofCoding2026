import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

    System.out.println("======= DAFTAR MENU =======");
    System.out.println("1. Ayam Geprek = Rp 10.000");
    System.out.println("2. Bakso       = Rp 10.000");
    System.out.println("3. Sate        = Rp 10.000");
    System.out.println("4. Mie Ayam    = Rp 10.000");
    System.out.println("5. Nasi Goreng = Rp 10.000"); 
    System.out.print("PILIH NOMOR MENU (1-5) = "); 
    
    int pilih = in.nextInt();

    if (pilih == 1) {
      System.out.println("Pesanan Anda: Ayam Geprek");
      System.out.println("Harga: Rp 10.000");
    } else if (pilih == 2) {
      System.out.println("Pesanan Anda: Bakso");
      System.out.println("Harga: Rp 10.000");
    } else if (pilih == 3) {
      System.out.println("Pesanan Anda: Sate");
      System.out.println("Harga: Rp 10.000");
    } else if (pilih == 4) {
      System.out.println("Pesanan Anda: Mie Ayam");
      System.out.println("Harga: Rp 10.000");
    } else if (pilih == 5) {
      System.out.println("Pesanan Anda: Nasi Goreng");
      System.out.println("Harga: Rp 10.000");
    } else {
      System.out.println("PESANAN ANDA TIDAK VALID! | SILAHKAN PILIH NOMOR 1-5");

      in.close();
  }
 }
}
