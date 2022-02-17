/**
 * 1.5. Вывести таблицу умножения в консоль.
 * В консоли должно получиться также как и на картинке (динозаврика рисовать не надо)
 * https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */

package cycles;

public class CyclesMain9 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {

            System.out.println("2x" + i + " =  " + (2 * i)
                    + "\t" + "3x" + i + " =  " + (3 * i) + "\t" + "4x" + i + " =  " + (4 * i)
                    + "\t" + "5x" + i + " =  " + (5 * i) + "\t" + "6x" + i + " =  " + (6 * i)
                    + "\t" + "7x" + i + " =  " + (7 * i) + "\t" + "8x" + i + " =  " + (8 * i)
                    + "\t" + "9x" + i + " =  " + (9 * i));

        }
    }
}
