import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = false;

        do {
            System.out.println("Music Player Menu:");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (!isPlaying) {
                        System.out.println("Music is now playing.");
                        isPlaying = true;
                    } else {
                        System.out.println("Music is already playing.");
                    }
                    break;
                case 2:
                    if (isPlaying) {
                        System.out.println("Music is paused.");
                        isPlaying = false;
                    } else {
                        System.out.println("No music is currently playing.");
                    }
                    break;
                case 3:
                    if (isPlaying) {
                        System.out.println("Music stopped.");
                        isPlaying = false;
                    } else {
                        System.out.println("No music is currently playing.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the Music Player.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (isPlaying || scanner.nextInt() == 4);

        scanner.close();
    }
}
