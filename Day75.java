public class App {
    public static void main(String[] args) {

        String teks1 = "Java Programming";
        String teks2 = "java programming";
        String teksKosong = "";

        // 1. equals() (harus sama persis)
        boolean hasil = teks1.equals(teks2);
        System.out.println("equals(): " + hasil);

        // 2. equalsIgnoreCase() nd papa huruf besar/kecil
        boolean hasil2 = teks1.equalsIgnoreCase(teks2);
        System.out.println("equalsIgnoreCase(): " + hasil2);

        // 3. contains() untuk mengecek di string ada kata yang dicari atau tidak
        boolean hasil3 = teks1.contains("Programming");
        System.out.println("contains(): " + hasil3); // true

        // 4. isEmpty() untuk mengecek stringnya kosong atau tidak
        boolean hasil4 = teksKosong.isEmpty();
        System.out.println("isEmpty(): " + hasil4);
    }
}
