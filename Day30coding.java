public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 5;

        // Contoh operator <= (lebih kecil atau sama dengan) 

        System.out.println(a <= b); // true (karena 5 lebih kecil dari 10)
        System.out.println(a <= c); // true (karena 5 sama dengan 5)
        System.out.println(b <= a); // false (karena 10 lebih besar atau tidak sama dengan 5)

        // Contoh operator >= (lebih besar atau sama dengan)

        System.out.println(b >= a); // true (karena 10 lebih besar dari 5)
        System.out.println(a >= c); // true (karena 5 sama dengan 5)
        System.out.println(a >= b); // false (karena 5 lebih kecil atau tidak sama dengan 10)

    }
}
