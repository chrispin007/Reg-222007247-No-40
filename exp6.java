public class exp6 {
    public static void main(String args[]) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (isEven(i)) {
                System.out.println("= is Prime number");
            } else {
                System.out.println("= is not Prime number");
            }
        }
    }

    public static boolean isEven(int num) {
        if (num == 2) {
            return true;
        }
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}