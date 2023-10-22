import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        // Користувач вводить порядковий номер пальця руки. Необхідно показати назву на екран.

        System.out.println("Введіть число від 1 до 5.");

        Scanner task7 = new Scanner(System.in);
        if(!task7.hasNextInt()) {
            System.out.println("Помилка в введеному числі. Можливо, що введена буква. Введіть інше число.");
            return;
        }
        int answer;
        answer = task7.nextInt();

        if (answer == 1) {
            System.out.println("Великий");
        }
        else if (answer == 2) {
            System.out.println("Вказівний");
        }
        else if (answer == 3) {
            System.out.println("Середній");
        }
        else if (answer == 4) {
            System.out.println("Безіменний");
        }
        else if (answer == 5) {
            System.out.println("Мізинець");
        }
        else {
            System.out.println("Введене число не подає в проміжок від 1 до 5. Введіть інше число від 1 до " +
                    "5 включно.");
        }
    }
}
