/**
 * 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой
 * программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = 120
 *
 * 1.1.2.* Используя рекурсию
 *
 */

package cycles;

public class CyclesMain7 {
    public static void main(String[] args) {
        System.out.println(peremnozenie(5));
    }

    private static int peremnozenie(int n) {
        if (n == 1) {
            return 1;
        }

        return n * peremnozenie(n - 1);
    }

}

