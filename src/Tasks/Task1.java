package Tasks;

import java.util.Scanner;

//1. Ввести n строк с консоли, найти самую короткую строку. Вывести эту строку и ее длину.

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите необходимое количество строк");
        Scanner in1 = new Scanner(System.in);
        int strok = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        String min = null;

        for (
                int i = 0;
                i < strok; i++) {
            System.out.println("Введите строку №" + (i + 1));
            String min1 = in2.nextLine();
            if (i == 0) {
                min = min1;
            } else if (min.length() > min1.length()) {
                min = min1;
            }
        }
        System.out.println("Длина самой короткой строки: " + min.length());
        System.out.println("Самая короткая строка: " + min);
    }
}
