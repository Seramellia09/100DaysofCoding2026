import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

    int angka = in.nextInt();
    String kode = "";

    if (angka > 0) {
      if (angka % 2 == 0) {
        kode = "A";
      } else {
        kode = "B" ; 
      }
    } else if (angka < 0) {
      if (angka % 2 == 0) {
        kode = "C";
      } else {
        kode = "D";
      }
    } else {
      kode = "N";
    }
    

    if (angka > 100) {
         kode += "+";
    } else if (angka < -100) {
         kode += "-";
    }

    System.out.println(kode);
    in.close();
 }
}
