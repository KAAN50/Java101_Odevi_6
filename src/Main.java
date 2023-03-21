import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int s1, s2;
       int islem;

       Scanner input1 = new Scanner(System.in);
        System.out.println("Ilk Sayiyi Giriniz: ");
        s1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Ikinci Sayiyi Giriniz: ");
        s2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Islemi Seciniz; \n 1-Toplama \n 2-Çıkartma \n 3-Çarpma \n 4-Bölme");
        islem = input3.nextInt();

        switch (islem)
        {
            case 1 :
                System.out.println("Toplama işlemini şeçtiniz");
                System.out.println("İşlemin Sonucu: "+(s1+s2));
                break;
            case 2:
                System.out.println("Çıkarma işlemini şeçtiniz");
                System.out.println("İşlemin Sonucu: "+(s1-s2));
                break;
            case 3:
                System.out.println("Çarpma işlemini şeçtiniz");
                System.out.println("İşlemin Sonucu: "+(s1*s2));
                break;
            case 4:
                System.out.println("Bölme işlemini şeçtiniz");
                System.out.println("İşlemin Sonucu: "+(s1/s2));
                break;
            default:
                System.out.println("Lütfen işlem seçiniz");
        }

    }
}