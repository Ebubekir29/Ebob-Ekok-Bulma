import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi1,sayi2,enKucuk,i=1,ebob=1,ekok;
        System.out.print("1.Sayiyi giriniz : ");
        sayi1 = scan.nextInt();

        System.out.print("2.Sayiyi giriniz : ");
        sayi2 = scan.nextInt();

        if(sayi1>sayi2)
            enKucuk=sayi2;
        else
            enKucuk=sayi1;
        while (i<=enKucuk)
        {
            if(sayi1%i==0 && sayi2%i==0)
            {
               ebob =i;
            }
            i++;
        }
        System.out.println(sayi1+" ve "+sayi2+"'nin Ebobu : "+ebob);
         ekok = sayi1*sayi2/ebob;
        System.out.println(sayi1+" ve "+sayi2+"'nin Ekoku : "+ekok);
    }
}
