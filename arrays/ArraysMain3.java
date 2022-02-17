/** Задача №3.
 * Найти в массиве те элементы, значение которых меньше среднего арифметического,
 * взятого от всех элементов массива.
 *
 * 1) Посчитать сумму всех элементов массива. Для этого до цикла вводится переменная
 *    для суммы (например, sum). Далее в цикле перебираются элементы массива и значение
 *    каждого добавляется к этой переменной. Подсчет суммы можно выполнить в том же цикле,
 *    что и заполнение массива.
 * 2) Когда сумма элементов посчитана, находится среднее арифметическое, которое равно
 *    сумме разделенной на количество элементов массива.
 * 3) Массив перебирается в цикле, каждый элемент сравнивается с найденным средним значением.
 *    Если элемент меньше, то он выводится на экран (или сохраняется в другом массиве).
 *
 */

package arrays;

public class ArraysMain3 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 10, 8, 5, -8};//Сумма 2+3+10+8+5+(-8)=29+(-8)=21
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            }

        int average = sum / arr.length;//average: 21 / 7 = 3

        for (int i = 0; i < average; i++) {
            if (arr[i] < average){
                System.out.println("Элементы, значение которых меньше" +
                        "среднего арифметического: " + arr[i]);
            }
        }


    }
}