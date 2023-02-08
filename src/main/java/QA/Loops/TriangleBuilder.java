package QA.Loops;

public class TriangleBuilder {
    static void firstTriangle() {
        int height;
        int width;
        for (height = 0; height < 5; height++) {
            for (width = 0; width < height; width++) {
                System.out.print("x");
            }
            System.out.println("x");
        }
        for (height = height - 1; height != 0; height--) {
            for (width = height - 1; width != 0; width--) {
                System.out.print("x");
            }
            System.out.println("x");
        }
    }

    public static void main(String[] args) {
        firstTriangle();
        System.out.println(); // to separate triangles at console
        secondTriangle();
        System.out.println(); // to separate triangles at console
        thirdTriangle();
    }

    static void secondTriangle() {
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = height; j > i; j--) {
                System.out.print("x");
            }

            System.out.println();
        }
    }

    static void thirdTriangle() {
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
