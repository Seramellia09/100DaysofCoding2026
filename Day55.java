public class App {
    public static int cariAngka(int batas) {

    for (int i = 1; i <= batas; i++){
        if (i % 5 == 0) {
        continue;
    }
        if (i > 100) {
        System.out.println("Sudah Melebihi 100, Loop Berhenti");
        break;
    }
        if (i % 3 == 0 && i % 7 == 0) {
            return i;
        }
      }
      return -1;
    }

public static void main(String[] args) {
    int hasil = cariAngka(150);
    System.out.println("Angka Yang Ditemukan " + hasil);

 }
}
