/** Задача №2.
 * В массиве найти максимальный элемент с четным индексом.
 * Другая формулировка задачи: среди элементов массива с четными индексами,
 * найти тот, который имеет максимальное значение.
 *
 * В различных языках программирования индексация элементов выполняется по-разному.
 * В одних первый элемент имеет индекс 1 (например, в Паскале и КуМире),
 * в других — 0 (Python, C, Basic, JAVA).
 *
 * Таким образом, в одних языках элементами с четными индексами будут второй,
 * четвертый, шестой и т.д.
 * В других языках четные индексы будут у первого, третьего, пятого и т.д. элементов.
 *
 * Для поиска максимума только среди четных (или среди нечетных) индексов необходимо
 * при переборе массива в цикле использовать шаг, равный 2.
 *
 * Предположим, что первый элемент с четным индексом и есть максимальный.
 * Присвоим его индекс переменной max. Перебор начнем с индекса i = max + 2 до конца массива (N).
 *
 * В цикле будем сравнивать значение очередного элемента со значением элемента по индексу max.
 * Если текущий элемент больше, то запишем его индекс в max.
 *
 */

package arrays;

public class ArraysMain2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 8, 5, -8};//Max элемент 10 под чётным индексом 2
        int max = arr[0];

        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max элемент под чётным индексом: " + max);

    }
}
