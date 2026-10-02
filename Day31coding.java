public class App {
    public static void main(String[] args) {

int umur = 20;
int uang = 100000;
boolean punya_KTP = true;

boolean boleh_masuk = (umur > 17) && punya_KTP;
boolean diskon = (uang > 50000) || (umur < 10);
boolean tidakpunyaKTP = !punya_KTP;

System.out.println("boleh masuk: " + boleh_masuk);
System.out.println("dapat promo: " + diskon);
System.out.println("tidak punya KTP: " + tidakpunyaKTP);

    }
}
