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
            float userNumberTask7;
            userNumberTask7 = task7.nextFloat();
            float userNumberTask8;
            userNumberTask8 = task8.nextFloat();
            float userNumberTask9;
            userNumberTask9 = task9.nextFloat();

            float answer;
            int n = 3;

            answer = (userNumberTask7 + userNumberTask8 + userNumberTask9) / n;

            if ((userNumberTask7 + userNumberTask8 + userNumberTask9) % n == 0) {
                int answerInt = (int) answer;
                System.out.println("Середнє з трьох чисел дорівнює " + answerInt);
            } else {
                System.out.println("Середнє з трьох чисел дорівнює " + answer);
            }
        }
    }
}
