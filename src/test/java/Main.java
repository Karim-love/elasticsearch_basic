import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        scan.close();

        System.out.println(a/b);

    }
}
