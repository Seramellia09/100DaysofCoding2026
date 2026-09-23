public class App {
    public static void main(String[] args) {
    
    int A = 9;
    int B = 5;

    // sebelum ditukar
    System.out.println("A = " + A);
    System.out.println("B = " + B);

    // proses menukar dengan menggunakan (temp)
    int temp = A;
    A = B;
    B = temp;

    // setelah ditukar
    System.out.println("A = " + A);
    System.out.println("B = " + B);

    }
}
