import java.util.Scanner;

public class NestedLoop_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arrayInnam = new double[5][7];
        double[] ratarata = new double[5];
        double[] jumlah = new double[5];
        double total = 0;
        for (int i = 0; i < arrayInnam.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < arrayInnam[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                arrayInnam[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < arrayInnam.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < arrayInnam[0].length; j++) {
                System.out.print(arrayInnam[i][j] + " ");
                jumlah[i] += arrayInnam[i][j];
            }
            System.out.println();
        }
        for (int i = 0; i < ratarata.length; i++) {
            ratarata[i] = jumlah[i] / 7;
            System.out.println("Rata-rata kota ke-" + (i + 1) + " adalah " + ratarata[i]);
        }

        // for (int i = 0; i < arrayInnam.length; i++) {
        // System.out.print("Kota ke-" + (i + 1) + ": ");
        // for (int j = 0; j < arrayInnam[0].length; j++) {
        // System.out.print(arrayInnam[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
