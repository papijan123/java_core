import java.util.Scanner;
class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        System.out.print("Enter the size of the inner square: ");
        int innerSize = scanner.nextInt();
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    if ((i >= -innerSize / 2 && i < innerSize / 2) && (j >= -innerSize / 2 && j < innerSize / 2)) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}






























