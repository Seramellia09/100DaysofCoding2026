import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

    int kode = in.nextInt();
    int umur = in.nextInt();
    int saldo = in.nextInt();
    int hasil = kode*umur%100;
    boolean status = false;
  
    
    if (hasil >= 20 && hasil <= 80) {
        if (umur < 17) {
          if (saldo >= 100000) {
            status = true;
          }
        } else {
            if (saldo >= 50000) {
              status = true;
              }
            }
          }
System.out.println("Nilai Pemeriksaan: " + hasil);
if (status) {
  System.out.println("Status Tiket: VALID");
} else {
  System.out.println("Status Tiket: TIDAK VALID");
 }
}
