/** Задача №4
 * Ряд Фибоначчи.
 * Вывести на экран столько элементов ряда Фибоначчи, сколько указал пользователь.
 * Например, если на ввод поступило число 6, то вывод должен содержать шесть первых чисел
 * ряда Фибоначчи: 1 2 3 5 8 13.
 * Ряд Фибоначчи — это последовательность натуральных чисел, где каждое последующее число
 * является суммой двух предыдущих: 1 1 2 3 5 8 13 21 34 55 89...
 *
 * В данном примере первые два элемента ряда равны не по 1 каждый, а 1 и 2.
 *
 * Поскольку начальные значения должны быть заданы и выведены на экран,
 * то первые два элемента ряда Фибоначчи выводятся перед циклом.
 * Поэтому цикл начинается с третьего элемента ряда.
 *
 * В самом цикле выполняются следующие действия:
 * 1) Вывести сумму текущих значений последних двух элементов.
 * 2) Присвоить предпоследнему элементу значение последнего, а последнему сумму последнего
 * и предпоследнего (это делается через буферную переменную).
 *
 * Цикл выполняется до тех пор, пока переменная-счетчик, изначально равная 3,
 * не достигнет числа, введенного пользователем.
 */

package cycles;

import java.util.Scanner;

public class CyclesMain4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = 1;
        int a2 = 2;
        int a3;
        System.out.println(a1 + " " + a2);
        System.out.println("Введите количество элементов ряда Фибоначчи");
        int amount = scan.nextInt();
        System.out.println("Количество элементов: " + amount);

        for (int i = 3; i <= amount ; i++) {
            a3 = a1 + a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;
        }


    }
}
