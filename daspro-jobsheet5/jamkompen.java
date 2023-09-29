import java.util.Scanner;

public class jamkompen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total jam alfa :");
        int jam = input.nextInt();

        if (jam >= 18 && jam < 36) {
            System.out.println("Anda mendapat SP I");
        } else if (jam >= 36 && jam < 72) {
            System.out.println("Anda mendapat SP II");
        } else if (jam >= 72) {
            System.out.println("Anda mendapat SP III");
        } else {
            System.out.println("Anda tidak mendapat SP");
        }
    }
}
