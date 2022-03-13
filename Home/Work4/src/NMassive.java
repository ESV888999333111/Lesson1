import java.util.Arrays; //импорт class работты с массивами
import java.util.Scanner; //сканер терминала

public class NMassive {
    // psvm - shortcut "public static void main(String[] args)"
    // sout - shortcut "System.out.println();"
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int numElements = in.nextInt();
        if (numElements == 0 || numElements < 0) System.out.println("Ошибка");
        else {
            int[] mass = new int[numElements];
            for (int i = 0; i < mass.length; i += 1) { //i - index элемента
                //заполнение массива
                mass[i] = (int) (Math.random() * 99); // действия с элементом массива
            }
            System.out.println("Создан мапссив на " + numElements + " элементов");
            System.out.println("Массив: " + Arrays.toString(mass)); // адкватный вывод массива
            int min = mass[0], max = mass[0];
            double sum = 0;
            for (int elements : mass) { // цикл foreach поэлементный перебор массива
                if (elements < min) min = elements;
                if (elements > max) max = elements;
                sum += elements;
            }
            System.out.println("Минимальный элемент массива: "+min);
            System.out.println("Максимальный элемент массива: "+max);
            System.out.println("Среднее значение элементов массива: "+(sum/mass.length));
        }
    }
}
