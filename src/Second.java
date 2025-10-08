import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("Birinci: ");
        a = sc.nextInt();
        System.out.println("Ikinci: ");
        b = sc.nextInt();

        int result = a + b;

        if (result > 10) {
            System.out.println("Cem 10dan boyuk oldu");
        } else if (result < 10) {
            System.out.println("Cem 10dan kicik oldu");
        } else {
            System.out.println("Cem 10 oldu");
        }

        System.out.println("Son");


    }
}
