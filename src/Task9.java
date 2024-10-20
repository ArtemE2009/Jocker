//Задача 9: Генерация уникальных перестановок цифр
//Реализуйте программу, которая генерирует все уникальные перестанов-
//ки цифр заданного числа. При этом перестановка не должна содержать
//ведущих нулей.
//Формат ввода:
//Одно положительное целое число N ( 1 ≤ N ≤ 109 ).
//Формат вывода:
//Все уникальные перестановки цифр числа, каждая на новой строке.

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task9 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        s.close();

        Set<String> u = new TreeSet<>();
        p("", n, u);

        boolean f = true;
        for (String x : u) {
            if (!x.startsWith("0") || x.equals("0")) {
                if (!f) {
                    System.out.print(" ");
                }
                System.out.print(x);
                f = false;
            }
        }
    }

    private static void p(String q, String r, Set<String> s) {
        int l = r.length();
        if (l == 0) {
            s.add(q);
        } else {
            for (int i = 0; i < l; i++) {
                p(q + r.charAt(i), r.substring(0, i) + r.substring(i + 1, l), s);
            }
        }
    }
}
