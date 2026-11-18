import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== BUAT AKUN BARU ===");
        System.out.print("Masukkan Username baru : ");
        String usernameTerdaftar = input.nextLine();

        System.out.print("Masukkan Password baru : ");
        String passwordTerdaftar = input.nextLine();

        System.out.println("\nAkun berhasil dibuat! Silakan login.\n");
        System.out.println("=== LOGIN KE AKUN ===");
        boolean statusLogin = false;

        while (!statusLogin) {
            System.out.print("Username : ");
            String inputUser = input.nextLine();

            System.out.print("Password : ");
            String inputPass = input.nextLine();

            if (inputUser.equals(usernameTerdaftar) && inputPass.equals(passwordTerdaftar)) {
                System.out.println("\nLogin Berhasil! Selamat datang, " + usernameTerdaftar + ".");
                statusLogin = true; 
            } else {
                System.out.println("Username atau password salah! Silakan coba lagi.\n");
            }
        }

        input.close();
    }
}
