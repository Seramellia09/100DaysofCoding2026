import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan Angka Pertama: ");
        double angka1 = in.nextDouble();
        System.out.print("Masukan Operator (+,-,*,/): ");
        char ope = in.next().charAt(0);
        System.out.print("Masukkan Angka Kedua: ");
        double angka2 = in.nextDouble();
        double hasil=0;

        switch (ope) {
            case '+':
            hasil = angka1 + angka2;
            break;
            case '-':
            hasil = angka1 - angka2;
            break;
            case '*':
            hasil = angka1*angka2;
            break;
            case '/':
            if (angka2 != 0){
            hasil = angka1/angka2;
            } else {
            System.out.println("Terjadi Kesalahan");
            return;
            }
            break;
            
        default:
        System.out.println("Operator Yang Anda Masukkan Salah!");
        }

        System.out.println("Hasil: " + angka1 +" "+ ope +" "+ angka2 + " = " + hasil);

    }
}
