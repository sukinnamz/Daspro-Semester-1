public class PenjumlahanRekrusif {
    public static int jumlahRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlahRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        int angka = 8;

        System.out.print("Hasil jumlah deret bilangan : ");
        for (int i = 1; i <= angka; i++) {
            System.out.print(i);
            if (i < angka) {
                System.out.print(" + ");
            }
        }

        System.out.print(" = " + jumlahRekursif(angka));
    }
}
