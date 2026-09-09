public class App {
    public static void main(String[] args) throws Exception {
     
    // Deklarasi variabel
    String nama_player ;
    int level ;

   // inisiasi data awal
   nama_player = "sera";
   level = 1;
   
    // menampikan data awal
    System.out.println("=== DATA AWAL ===");
    System.out.println("nama_player: " + nama_player);
    System.out.println("level: " + level);

    //diperbarui isi variabelnya menjadi data baru
    nama_player = "sera pro";
    level = 5;

    // menampilkan data akhir
    System.out.println("=== DATA AKHIR ===");
    System.out.println("nama_player: " + nama_player);
    System.out.println("level: " + level);

    }
}
