import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int nim = in.nextInt();
    int umur = in.nextInt();
    double tinggi = in.nextDouble();

    // konversi ke String
    String nm = String.valueOf(nim);
    String umr = Integer.toString(umur);
    String tgi = tinggi + "";

    // penggabungan
    String gabung = umr + tgi;

    System.out.println("\n=== DATA MAHASISWA ===");
    System.out.println("NIM                     :" + nm);
    System.out.println("Umur                    :" + umr + "Tahun");
    System.out.println("Tinggi Badan            :" + tgi + "cm");
    System.out.println("Gabungan Umur+Tinggi    :" + gabung);
    
in.close();

      
    }
}
