import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double armutFiyati = 2.14,elmaFiyati = 3.67,domatesFiyati = 1.11,muzFiyati=0.95,patlicanFiyati = 5.0;
        double toplam;

        System.out.println("Armutun kilosunu giriniz");
        armutKilo = input.nextInt();

        System.out.println("Elmanin kilosunu giriniz");
        elmaKilo = input.nextInt();

        System.out.println("Domatesin kilosunu giriniz");
        domatesKilo = input.nextInt();

        System.out.println("Muzun kilosunu giriniz");
        muzKilo = input.nextInt();

        System.out.println("Patlicanin kilosunu giriniz");
        patlicanKilo = input.nextInt();

        toplam = (armutKilo*armutFiyati)+(elmaKilo*elmaFiyati)+(domatesKilo*domatesFiyati)+(muzFiyati*muzKilo)+(patlicanKilo*patlicanFiyati);
        System.out.println("Borcunuz = "+toplam);
    }
}