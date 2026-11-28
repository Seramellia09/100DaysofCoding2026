public class App {

    static void sapa() {
        System.out.println("Selamat datang di bahasa pemrograman Java.");
    }
    static void peserta(String nama) {
        System.out.println("Nama peserta: " + nama);
    }
    static void hitung(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang (" + panjang + " x " + lebar + ") = " + luas);
    }
    public static void main(String[] args) {
        
        sapa();
        System.out.println("-----------------------------------");

        peserta("Sera");
        peserta("Amellia");
        System.out.println("-----------------------------------");

        hitung(10, 5);
        hitung(7, 3);
    }
}
