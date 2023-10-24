import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        // Користувач вводить два цілих однозначних числа. Якщо числа не однозначні або
        // від'ємні - сповістіть про це користувача. Вивести йому на екран результат множення цих чисел.

        System.out.println("Введіть два однозначних числа.");

        Scanner task7 = new Scanner(System.in);
        Scanner task8 = new Scanner(System.in);

        if (!task7.hasNextInt()) {
            System.out.println("Введена буква. Введіть інше перше число.");
        } else if (!task8.hasNextInt()) {
            System.out.println("Введена буква. Введіть інше друге число.");
        } else {
            int num1;
            num1 = task7.nextInt();
            int num2;
            num2 = task8.nextInt();
            int num3;
            num3 = num1 * num2;

            if (num1 < 0 && num2 < 0) {
                System.out.println("Числа відємні. Відповідь " + num3);
            } else if (num1 < 0) {
                System.out.println("Перше число відємне. Відповідь " + num3);
            } else if (num2 < 0) {
                System.out.println("Друге число відємне. Відповідь " + num3);
            } else if (num1 > 9) {
                System.out.println("Перше число не односзначне. Відповідь " + num3);
            } else if (num2 > 9) {
                System.out.println("Друге число не односзначне. Відповідь " + num3);
            } else {
                System.out.println("Результат множення введенних чисел " + num3);
            }
        }
    }
}
