import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, dongu = 0, total = 0, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                dongu++;
                total += i;
            }
        }

        result = total / dongu;
        System.out.print("3 ve 4 e bölünen sayıların ortalaması : " + result);

    }
}