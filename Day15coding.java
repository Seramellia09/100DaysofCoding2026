import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //input
        int JumlahBuku = input.nextInt();    //4
        int HargaPerBuku = input.nextInt();  //15000
        int JumlahOrang = input.nextInt();   //2

        // Proses perhitungan
        int TotalHarga = JumlahBuku * HargaPerBuku;
        int BiayaPerOrang = TotalHarga / JumlahOrang;

        // Menampilkan output menggunakan printf
        System.out.printf("Jumlah Buku = %d\n", JumlahBuku);
        System.out.printf("Harga Per Buku = Rp%d\n", HargaPerBuku);
        System.out.printf("Total Harga = Rp%d\n", TotalHarga);
        System.out.printf("Jumlah Orang = %d\n", JumlahOrang);
        System.out.printf("Biaya Per Orang = Rp%d", BiayaPerOrang);

        input.close();
    }
}
