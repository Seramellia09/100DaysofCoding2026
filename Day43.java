import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.print("Masukkan Angka: ");
int angka = in.nextInt();

if (angka%3==0 && angka%5==0){
    System.out.println("Kelipatan 3 dan 5");
} else if (angka%3==0){
    System.out.println("Kelipatan 3");
} else if (angka%5==0){
    System.out.println("Kelipatan 5");
} else if (angka%3!=0 && angka%5!=0){
    System.out.println("Bukan Kelipatan 3 dan 5");
} else {
}

 }
}
