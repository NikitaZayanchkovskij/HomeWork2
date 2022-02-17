/** Задача №3
 * Посчитать четные и нечетные цифры введенного натурального числа.
 * Например, если введено число 34560,
 * то у него 3 четные цифры (4, 6 и 0) и 2 нечетные (3 и 5).
 *
 * 1) Присвоить переменным-счетчикам четных (even) и нечетных (odd) цифр значение 0.
 * 2) Пока введенное число не уменьшится до нуля выполнять нижеследующие действия:
 *  2.1) Если число четное (делится нацело на 2), значит последняя его цифра четная
 *       и надо увеличить на 1 переменную even.
 *  2.2) Иначе число нечетное и следует добавить 1 к переменной odd.
 *  2.3) Убрать последнюю цифру числа путем деления числа нацело на 10.
 */

package cycles;

import java.util.Scanner;

public class CyclesMain3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int cislo = scan.nextInt();
        int evenNumbersCount = 0;
        int unEvenNumbersCount = 0;

        while(cislo > 0){
            if(cislo % 2 == 0){
                evenNumbersCount = evenNumbersCount + 1;//Также можно написать evenNumbersCount++ или evenNumbersCount += 1
            } else {
                unEvenNumbersCount = unEvenNumbersCount + 1;//Также можно написать unEvenNumbersCount++ или unEvenNumbersCount += 1
            }
            cislo = cislo / 10;
        }

        System.out.println("Количество чётных чисел: " + evenNumbersCount);
        System.out.println("Количество нечётных чисел: " + unEvenNumbersCount);

    }
}
