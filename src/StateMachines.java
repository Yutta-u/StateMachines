import java.util.Scanner;

public class StateMachines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k=scan.nextInt();
        for (int i = 0; i <k; i++) {
            long n = scan.nextInt();
            long m = scan.nextInt();
            long d = 19L *m + (n + 239)*(n + 366) / 2;
            System.out.println(d);
        }
    }
}
