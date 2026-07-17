import java.util.Scanner;
class Square{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();
        System.out.print("Enter the size of the inner square: ");
        int innerSize = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i>= (size-innerSize)/2 && i < (size+innerSize)/2) && (j >= (size-innerSize)/2 && j < (size+innerSize)/2)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}