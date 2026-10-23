import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int pinbenar = 123456;
    int inputpin = 0;

    while (inputpin!=pinbenar){
        System.out.print("Masukkan PIN: "); 
        inputpin = in.nextInt();

        if (inputpin!=pinbenar){
            System.out.println("PIN Salah. Silahkan Coba Lagi.");
        }
    }
    System.out.println("PIN Benar. Akses Diberikan.");
    
    in.close();

 }
}
