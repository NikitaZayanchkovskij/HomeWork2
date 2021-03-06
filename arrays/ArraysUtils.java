/**
 * 2.1. Создать класс ArraysUtils:
 * 2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main.
 * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
 * 2.1.1.1. Пример int[] container = arrayFromConsole().
 * Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 * пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
 * Соответственно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён
 * в переменную container.
 *
 */

package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Каким методом хотите пользоваться?");
        System.out.println("Введите 1: метод arrayFromConsole");
        System.out.println("Введите 2: метод arrayRandom");
        int answer = scan.nextInt();

        switch (answer){
            case 1:
                int[] container = arrayFromConsole();
                System.out.println("arrayFromConsole(): " + Arrays.toString(container));
                break;
            case 2:
                int[] container2 = arrayRandom(5, 100);
                System.out.println("arrayRandom(): " + Arrays.toString(container2));
                break;
            default:
                System.out.println("Вы ввели не 1 и не 2!");
        }

    }


    public static int[] arrayFromConsole(){
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите число " + (i + 1));
            array[i] = scan.nextInt();
        }
        return array;
    }

    /**
     * 2.1.2.
     * Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
     * Данный метод принимает два аргумента. Первый (size) указывает размер массива, который
     * мы хотим получить.
     * Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
     *
     * 2.1.2.1. Пример: int[] container = arrayRandom(5, 100).
     * Результат: В методе arrayRandom будет создан массив размером 5 с числами
     * от 0 до 99 (использовать класс Random) и сохранён в переменную container.
     *
     */

    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rnd = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(maxValueExclusion);
        }
        return array;
    }


}
