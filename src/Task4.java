//Задача 4: Анаграммы
//Реализуйте программу, которая проверяет, являются ли две строки ана-
//граммами. Две строки являются анаграммами, если одна строка может
//быть преобразована в другую путем перестановки букв. Игнорируйте ре-
//гистр букв и пробелы.
//Более подробная информация
//Формат ввода:
//Две строки, каждая из которых может содержать буквы латинского ал-
//фавита в любом регистре и пробелы.
//Формат вывода:
//Строка «Yes», если строки являются анаграммами, и «No», если нет (вы-
//вод без кавычек).

import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine().toLowerCase().replaceAll("\s", "");
        String b = s.nextLine().toLowerCase().replaceAll("\s", "");

        if (a.length() != b.length()) {
            System.out.println("No");
            return;
        }

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if (Arrays.equals(x, y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
