import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // Передати на вхід програми число від 1 до 7 як аргумент. Якщо число дорівнює 1,
        // виводимо консоль “Понеділок”, 2 –”Вівторок” тощо. Якщо 6 або 7 - "Вихідний".

        System.out.println("Введіть число від 1 до 7.");
        Scanner task7 = new Scanner(System.in);
        if (!task7.hasNextInt()) {
            System.out.println("Помилка в введеному числі. Можливо, що введена буква. Введіть інше число.");
            return;
        }
        int answer;
        answer = task7.nextInt();

        if (answer == 1) {
            System.out.println("Понеділок");
        } else if (answer == 2) {
            System.out.println("Вівторок");
        } else if (answer == 3) {
            System.out.println("Середа");
        } else if (answer == 4) {
            System.out.println("Четверг");
        } else if (answer == 5) {
            System.out.println("П'ятниця");
        } else if (answer == 6 || answer == 7) {
            System.out.println("Вихідний");
        } else {
            System.out.println("Введене число не подає в проміжок від 1 до 7. Введіть інше число від 1 до " +
                    "7 включно.");
        }
    }
}
