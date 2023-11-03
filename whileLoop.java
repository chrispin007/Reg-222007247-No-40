public class whileLoop {
        public static void main(String [] args) {
            String str = "Hello, World!";
            int i = 0;
            while (i < str.length()) {
                System.out.println(str.charAt(i));
                if (str.charAt(i) == 'o') {
                    break;
                }
                i++;
            }
        }
    }

