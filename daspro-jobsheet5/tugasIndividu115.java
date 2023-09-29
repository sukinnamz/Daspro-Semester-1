import java.util.Scanner;

public class tugasIndividu115 {
    public static void main(String[] args) {
        int jarak;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jarak : ");
        jarak = input.nextInt();
        if (jarak < 5) {
            System.out.println("Menggunakan melee weapon");
        } else {
            System.out.println("Menggunakan ranged weapon");
        }
    }
}
