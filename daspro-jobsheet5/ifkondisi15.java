import java.util.Scanner;

public class ifkondisi15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.println("Masukkan Suhu : ");
        int suhu = sc15.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket");
        }
        if (suhu < 20) {
            System.out.println("Silahkan menggunakan baju tebal");
        } else {
            System.out.println("Silahkan pakai topi");
        }
    }
}