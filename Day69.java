public class App {
    public static void main(String[] args) {

        int baris = 4;
        int kolom = 6; 

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
