import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dogruPin = 1234;
        double bakiye = 1000.0;

        System.out.print("PIN kodunuzu girin: ");
        int girilenPin = input.nextInt();

        if (girilenPin == dogruPin)                 {int devam;

do {            System.out.println("Giriş başarılı.");
            System.out.println("Bakiyeniz: " + bakiye + " TL");int secim;

System.out.println("\n===== ATM MENÜ =====");
System.out.println("1 - Bakiye Görüntüle");
System.out.println("2 - Para Yatır");
System.out.println("3 - Para Çek");
System.out.println("4 - Çıkış");

System.out.print("Seçiminiz: ");
secim = input.nextInt();

if (secim == 1) {
    System.out.println("Bakiyeniz: " + bakiye + " TL");
}
else if (secim == 2) {
    System.out.println("Para yatırma seçildi.");double miktar;

System.out.print("Yatırılacak miktar: ");
miktar = input.nextDouble();

bakiye = bakiye + miktar;

System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
}
else if (secim == 3) {
    double miktar;

System.out.print("Çekilecek miktar: ");
miktar = input.nextDouble();

if (miktar <= bakiye) {
    bakiye = bakiye - miktar;
    System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
} else {
    System.out.println("Yetersiz bakiye!");
}
}
else if (secim == 4) {
    System.out.println("İyi günler.");
}
else {
    System.out.println("Geçersiz seçim!");
}System.out.println("\nBaşka bir işlem yapmak ister misiniz?");
System.out.println("1 - Evet");
System.out.println("2 - Hayır");
System.out.print("Seçiminiz: ");
devam = input.nextInt();

} while (devam == 1);

System.out.println("ATM'den çıkış yapıldı.");
        } else {
            System.out.println("Hatalı PIN.");
        }

        input.close();
    }
}
