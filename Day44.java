import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.print("Masukkan Nilai Ujian: ");
int nilai = in.nextInt();

if (nilai>=90 && nilai<=100) {
    System.out.println("Predikat Nilai: A");
} else if (nilai>=80 && nilai<=89){
    System.out.println("Predikat Nilai: B");
} else if (nilai>=70 && nilai<=79){
    System.out.println("Predikat Nilai: C");
} else if (nilai>=60 && nilai<=69){
    System.out.println("Predikat Nilai: D");
} else if (nilai>=0 && nilai<=59){
    System.out.println("Predikat Nilai: E");
} else {
    System.out.println("Nilai Tidak Valid");
}

 }
}
