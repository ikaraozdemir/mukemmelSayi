import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımla.
        int number, sum = 0, divider = 1 ;
        //Kullanıcıdan sayıyı al.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        number = input.nextInt();

        while (divider < number) {
            if (number % divider == 0) sum += divider;  //Girilen sayıyı kendisinden küçük tüm sayılara böl ve tam bölünürse topla.
            divider++;
        }
        if (sum==number){
            System.out.print(number + " mükkemmel sayıdır.");
        }else {
            System.out.print(number + " mükkemmel sayı değildir.");
        }
    }
}




