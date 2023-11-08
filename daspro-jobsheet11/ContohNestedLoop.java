import java.util.Scanner;

public class ContohNestedLoop { // aplikasi untuk membuat kombinasi yang mungkin dari dua array dengan panjang
                                // yang sama
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int panjang = sc.nextInt();
        int[] setA = new int[panjang];
        int[] setB = new int[panjang];

        for (int i = 0; i < setA.length; i++) {
            System.out.print("Angka ke- " + (i + 1) + " angka untuk array pertama : ");
            setA[i] = sc.nextInt();
        } // looping untuk input nilai array pertama
        System.out.println("=======================================");
        for (int i = 0; i < setB.length; i++) {
            System.out.print("Angka ke- " + (i + 1) + " angka untuk array kedua : ");
            setB[i] = sc.nextInt();
        } // looping untuk input nilai array kedua

        // Menghitung jumlah kombinasi antara setA dan setB
        int count = 0;
        for (int i = 0; i < setA.length; i++) {
            for (int j = 0; j < setB.length; j++) {
                count++;
                System.out.println("Kombinasi ke-" + count + ": " + setA[i] + " dan " + setB[j]);
            }
        }
    }
}
