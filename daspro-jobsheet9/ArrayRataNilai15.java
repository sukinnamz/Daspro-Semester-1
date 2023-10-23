import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyak;
        System.out.print("Masukkan jumlah mahasiswa : ");
        banyak = sc.nextInt();
        int[] nilaiMhs = new int[banyak];
        double total = 0;
        double rata2;
        int lulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus += 1;
            }
        }
        rata2 = total / nilaiMhs.length;
        System.out.println("rata-rata nilai lulus = " + rata2);
        System.out.println("Banyaknya mahasiswa yang lulus adalah " + lulus + " orang");

        
    }
}
