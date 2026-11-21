public class App {
    public static void main(String[] args) {
        
        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = (i + 1) * 10;
        }

        System.out.println("Isi elemen array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks ke-" + i + " : " + angka[i]);
        }
    }
}
