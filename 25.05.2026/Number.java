import java.util.Scanner;

class Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        for (int k = 1; k <= num; k++) {
            for (int n = num - k; n > 0; n--) {
                System.out.print(" ");
            }
            for (int o = 1; o <= k; o++) {
                System.out.print(o);
            }
            System.out.println();
        }
    }
}