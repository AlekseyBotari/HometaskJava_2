import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Введіть будь-яке число");

        Scanner task7 = new Scanner(System.in);
        if (!task7.hasNextInt()) {
            System.out.println("Помилка в введеному числі. Можливо, що введена буква. Введіть інше число.");
        } else {

            int userNumberTask6;
            userNumberTask6 = task7.nextInt();
            if (userNumberTask6 == 0) {
                System.out.println("Результат завжди дорівнює нулю, тому що введене число дорівнює нулю. Введіть" +
                        " інше число, щоб перевірити кратність трьом.");
            }
            else if ((userNumberTask6 % 3) == 0) {
                System.out.println("Введене число кратне трьом");
            }
            else {
                System.out.println("Введене число не кратне трьом");
            }
        }
    }
}
