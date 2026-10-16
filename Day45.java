import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.print("Masukkan Nomor Hari: ");
int hari = in.nextInt();

switch (hari) {
    case 1 :
    System.out.println("Senin");
    break;
    case 2 :
    System.out.println("Selasa");
    break;
    case 3 :
    System.out.println("Rabu");
    break;
    case 4 :
    System.out.println("Kamis");
    break;
    case 5 :
    System.out.println("jumat");
    break;
    case 6 :
    System.out.println("Sabtu");
    break;
    case 7 :
    System.out.println("Minggu");
    break;
default:
System.out.println("Nomor Hari Tidak Valid");

}   
 }
}
