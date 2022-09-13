import java.util.Scanner;
//C(n,r) = n! / (r! * (n-r)!)
public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("n değerini gir: ");int n=input.nextInt();
        System.out.print("r değerini gir: ");int r=input.nextInt();
        while (true) {
            if (n < r) {
                System.out.println("n degeri r'den buyuk olmasi lazim tekrar deneyin");
                break;
            }
            int sayac = 1;
            int sayac2 = 1;
            int sayac3 = 1;
            for (int i = 1; i <= n; i++) {
                sayac = sayac * i;
            }

            for (int j = 1; j <= r; j++) {
                sayac2 = sayac2 * j;
            }

            for (int k = 1; k <= (n - r); k++) {
                sayac3 = sayac3 * k;
            }

            int kombinasyon = sayac / (sayac2 * sayac3);
            System.out.println("Sonuc: " + kombinasyon);
            break;
        }

    }
}
