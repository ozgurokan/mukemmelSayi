import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, aliquotSum = 0;

        // Kullanıcıdan sayı alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();


        // number sayısı kendisinden küçük her sayıya bölünür
        for (int i = 1; i < number; i++) {

            // bölümden kalan sıfırsa tam bölendir bu yüzden aliquotSum değişkenine eklenir
            if (number % i == 0) {
                aliquotSum += i;
            }
        }

        // sayı , bölenlein toplamınıa eşitse mükkeml sayı yazdırır değilse mükammel sayı değil yazdırır
        if (aliquotSum == number) {

            System.out.print(number + " sayısı bir mükemmel sayıdır");

        } else {

            System.out.print(number + " sayısı bir mükemmel sayı değildir");

        }


    }
}