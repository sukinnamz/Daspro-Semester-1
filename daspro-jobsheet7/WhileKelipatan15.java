import java.util.Scanner;

public class WhileKelipatan15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, rataRata = 0, total = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
                rataRata = total / counter;
            }
            i++;
        }

        System.out.printf("Banyaknya %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata rata adalah adalah " + rataRata);
    }
}
