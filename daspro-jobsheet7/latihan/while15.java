public class while15 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println("Angka " + i + " adalah bilangan genap");
            } else {
                System.out.println("Angka " + i + " adalah bilangan ganjil");
            }
            i++;
        }
    }
}
