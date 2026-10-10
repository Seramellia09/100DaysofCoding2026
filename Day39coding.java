import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    char c = in.next().charAt(0);

if (c == 'A') {
  System.out.println(a+b);
} else if (c == 'B') {
  System.out.println(a-b);
} else if (c == 'C') {
  System.out.println(a*b);
} else if (c == 'D') {
  System.out.println(a/b);
} else {
  System.out.println("Angka Tidak Valid");
}

 }
}
