import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        int num = 1;
        int count = 0;
        while (true) {
            count++;
            if (count > a) break;
            System.out.print(num);
            num += 2;
            if (num > (2 * a - 1)) break;
            System.out.print(", ");
        }
    }
}
