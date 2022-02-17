/**
 * 1.3. Возведение в степень.
 * Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить.
 * Второе число это степень, в которую возводят первое число.
 * Степень - только положительная и целая. Возводимое число - может быть отрицательным
 * и оно будет дробным. Math использовать нельзя.
 *
 * 1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 * 1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

package cycles;

import java.util.Scanner;

public class CyclesMain8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double cislo = scan.nextDouble();
        System.out.println("В какую степень возвести?");
        int stepen = scan.nextInt();
        double vStepeni = 1;

        for (int i = 1; i <= stepen; i++) {
            vStepeni = vStepeni * cislo;
        }

        System.out.println(vStepeni);

        }
    }

