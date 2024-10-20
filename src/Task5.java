//Задача 5: Вычисление дня недели
//Реализуйте программу, которая принимает дату в формате ”дд мм гггг”и
//возвращает день недели, соответствующий этой дате. Запрещается ис-
//пользовать стандартные классы Java для работы с датой и временем.
//Более подробная информация
//Формат ввода:
//Одна строка, содержащая дату в формате ”дд мм гггг”.
//Формат вывода:
//Строка, представляющая день недели на английском языке с заглавной
//буквы.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String i = s.nextLine();
        String[] p = i.split(" ");

        int d = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int y = Integer.parseInt(p[2]);

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int c = y / 100;
        int k = y % 100;

        int w = (d + (13 * (m + 1)) / 5 + k + k / 4 + c / 4 - 2 * c) % 7;

        String[] z = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println(z[(w + 7) % 7]);
    }
}

