import java.util.Scanner;

public class Main {

    /*
        Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

        Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    static boolean palindromMu(int sayi)
        {
            int geciciSayi = sayi, sayininTersi = 0, sonBasamak;
            while (geciciSayi != 0)
            {
                System.out.println("---------------------\nSayi : " + geciciSayi);
                sonBasamak = geciciSayi % 10;

                System.out.println("Son Basamak : " + sonBasamak);
                sayininTersi = (sayininTersi * 10 ) + sonBasamak;

                System.out.println("Yeni Sayi : " + sayininTersi);
                geciciSayi /= 10;
            }
            if (sayi == sayininTersi)
            {
                System.out.println("---------------------\n" + sayi + " Palindrom Sayidir.");
                return true;
            }
            else
            {
                System.out.println("---------------------\n" + sayi + " Palindrom Sayi Degildir.");
                return false;
            }

        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(palindromMu(sayi));

    }

}
