//Задача 10: Поиск подстроки
//Реализуйте программу, которая реализует алгоритм Кнута-Морриса-Пратта
//(КМП) для поиска всех вхождений подстроки в строку.
//Более подробная информация
//Формат ввода:
//Две непустые строки:
//• Основная строка, в которой будет происходить поиск.
//• Подстрока, которую необходимо найти.
//Формат вывода:
//Строка, содержащая индексы всех вхождений подстроки в основной стро-
//ке, разделенные пробелами. Если подстрока не найдена, выведите -1.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        String p = s.nextLine();
        s.close();

        StringBuilder r = new StringBuilder();
        int n = t.length();
        int m = p.length();

        for (int i = 0; i <= n - m; i++) {
            if (t.substring(i, i + m).equals(p)) {
                if (r.length() > 0) {
                    r.append(" ");
                }
                r.append(i);
            }
        }

        if (r.length() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(r);
        }
    }
}
