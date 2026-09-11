public class App {
    public static void main(String[] args) throws Exception {
     
// deklarasi variabel
    byte level;
    short jumlah_item;
    int exp;
    long gold;

// memberikan nilai awal
    level = 10;
    jumlah_item = 50;
    exp = 1000;
    gold = 50000;

    // menampilkan batas nilai maksimal dari setiap tipe data
    System.out.println("=== BATAS MAKSIMAL TIPE DATA ===");
    System.out.println("Maks Byte:" + Byte.MAX_VALUE);
    System.out.println("Maks Short:" + Short.MAX_VALUE);
    System.out.println("Maks int: " + Integer.MAX_VALUE);
    System.out.println("Maks long: " + Long.MAX_VALUE);

// menampilkan data awal sebelum di isi
   System.out.println("=== DATA AWAL KARAKTER ===");
   System.out.println("level: " + level);
   System.out.println("jumlah_item: " + jumlah_item);
   System.out.println("exp: " + exp);
   System.out.println("gold: " + gold);

// update data
   level = (byte) (level + 2);
   jumlah_item = (short) (jumlah_item + 5);
   exp = (int) (exp + 250);
   gold = (long) (gold + 10000);

// menampilkan data akhir setelah di isi
System.out.println("=== DATA AKHIR SETELAH DI ISI ===");
System.out.println("level: " + level);
System.out.println("jumlah_item: " + jumlah_item);
System.out.println("exp: " + exp);
System.out.println("gold: " + gold);


    }
}
