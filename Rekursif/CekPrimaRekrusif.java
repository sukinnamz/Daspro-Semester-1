import java.util.Scanner;

public class CekPrimaRekrusif {
    public static void cekPrimaRekursif(int n, int pembagi) {
        if (n <= 1) {
            System.out.println(n + " bukan bilangan prima.");
        } else if (pembagi == 1) {
            System.out.println(n + " adalah bilangan prima.");
        } else if (n % pembagi == 0) {
            System.out.println(n + " bukan bilangan prima.");
        } else {
            // Panggil rekursif dengan pembagi yang lebih kecil
            cekPrimaRekursif(n, pembagi - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = sc.nextInt();

        cekPrimaRekursif(angka, angka - 1);
    }
}
