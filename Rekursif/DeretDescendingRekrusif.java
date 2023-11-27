public class DeretDescendingRekrusif {
    public static void deretRekrusif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretRekrusif(n - 1);
        }
    }

    public static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Deret rekrusif : ");
        deretRekrusif(5);
        System.out.print("\nDeret iteratif : ");
        deretIteratif(5);
    }
}
