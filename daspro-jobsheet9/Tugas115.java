import java.util.Scanner;

public class Tugas115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int banyak = sc.nextInt();
        int[] arrayku = new int[banyak];
        double sum = 0, rata2;
        for (int i = 0; i < arrayku.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            arrayku[i] = sc.nextInt();
        }
        int tinggi = arrayku[0], rendah = arrayku[0];
        for (int i = 0; i < arrayku.length; i++) {
            if (arrayku[i] > tinggi) {
                tinggi = arrayku[i];
            }
            if (arrayku[i] < rendah) {
                rendah = arrayku[i];
            }
            sum += arrayku[i];
        }
        rata2 = sum / arrayku.length;
        System.out.println("Rata-rata : " + rata2);
        System.out.println("Nilai tertinggi : " + tinggi);
        System.out.println("Nilai terendah : " + rendah);
    }
}
