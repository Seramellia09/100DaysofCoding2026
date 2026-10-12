import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.print("Masukan Suhu Ruangan: ");
int suhu = in.nextDouble();
System.out.print("Masukan Kelembapan Ruangan: ");
int kelembapan = in.nextInt();

if (suhu >= 18 && suhu <= 28 && kelembapan >= 40 && kelembapan <= 60){
    System.out.println("Ruangan Nyaman");
} else if (suhu < 18 || kelembapan < 40) {
    System.out.println("Suhu atau Kelembapan Terlalu rendah");
} else if (suhu > 28 || kelembapan > 60) {
    System.out.println("Suhu atau Kelembapan Terlalu Tinggi");
} else {
}


 }
}
