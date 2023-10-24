import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        // Користувач вводить три числа. Знайдіть середнє з трьох.

        System.out.println("Введіть три будь-яких числа");

        Scanner task7 = new Scanner(System.in);
        Scanner task8 = new Scanner(System.in);
        Scanner task9 = new Scanner(System.in);

        if (!task7.hasNextInt()) {
            System.out.println("Помилка в введеному числі. Можливо, що введена буква. Введіть інше перше число.");
        } else if (!task8.hasNextInt()) {
            System.out.println("Помилка в введеному числі. Можливо, що введена буква. Введіть інше друге число.");
        } else if (!task9.hasNextInt()) {
            System.out.println("Помилка в введеному числі. Можливо, що введена буква. Введіть інше третє число.");
        } else {
            int userNumberTask7;
            userNumberTask7 = task7.nextInt();
            int userNumberTask8;
            userNumberTask8 = task8.nextInt();
            int userNumberTask9;
            userNumberTask9 = task9.nextInt();

            if (userNumberTask7 > userNumberTask8 && userNumberTask7 < userNumberTask9) {
                System.out.println("Середнє з трьох чисел дорівнює " + userNumberTask7);
            }
            else if (userNumberTask8 > userNumberTask7 && userNumberTask8 < userNumberTask9) {
                System.out.println("Середнє з трьох чисел дорівнює " + userNumberTask8);
            }
            else if (userNumberTask9 > userNumberTask8 && userNumberTask9 < userNumberTask7) {
                System.out.println("Середнє з трьох чисел дорівнює " + userNumberTask9);
            }
        }
    }
}
