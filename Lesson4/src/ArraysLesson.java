import java.lang.reflect.Array;
import java.util.Arrays; //импорт class работты с массивами
import java.util.Scanner; //сканер терминала

public class ArraysLesson {
    // psvm - shortcut "public static void main(String[] args)"
    // sout - shortcut "System.out.println();"
    public static void main(String[] args) {
        //примитивные типы данных
        //разные переменные - разные области памяти
        int a = 78;
        int b = a;
        a = 10;
        //ссылочные типы данных
        Scanner scanner = new Scanner(System.in); //к одной области памяти введут две переменные
        Scanner in = scanner; //разные переменные - область памяти одна
        //Массивы
        //Массивы в java имеют статичное количество элементов
        // Задание массива
        int[] ints /* int ints[]*/ = new int[7]; //Число 7 - это размер массива
        System.out.println(ints); // так выводить массив нельзя

        Arrays.toString(ints); //class Arrays для работы с массивами
        System.out.println(Arrays.toString(ints)); //адекватный способ вывода данных
        //открыть просмотр class Ctrl + ЛКП
        int[] ints2 = {6, -90, 55, 12, 5}; //задание массива с заданными значениями
        System.out.println(Arrays.toString(ints2));
        ints2 = new int[3]; //создается новый массив в новой области памяти, предыдущий теряется
        System.out.println(Arrays.toString(ints2));
        ints2 = new int[]{453, 54, 112, 55}; //создается новая область памяти на новый массив


        // длина массива - положительное число типа int
        int len = 10; // задаем длинну массива
        int[] ints3 = new int[len];
        System.out.println(Arrays.toString(ints3));
        System.out.println("Длина массива ints3 = " + ints3.length); // выводит длину массива


        //доступ к элементам массива
        System.out.println(ints3[3]);//3 - индекс элемета массива
        ints3[3] = 521;
        System.out.println(Arrays.toString(ints3));
        //ArrayIndexOutOfBoundsException - ошибка во время выполнения программы
        //System.out.println(ints3[100]);


        //Многомерные массивы - это когда элемент массива другой массив
        //[[0, 0, 0,0],[0, 0, 0],[0, 0, 0, 0]]
        int[][] ints5 = new int[3][4];//3 - внешний массив, 4 - внутренний массив
        System.out.println(Arrays.deepToString(ints5)); // адекватный вывод многомерного массива
        //разноразмерный многомерный массив
        //[[0, 0, 0,0],[0, 0, 0,0],[0, 0, 0,0]]
        int[][] ints6 = new int[3][];//3 - внешний массив [null,null,null]
        ints6[0] = new int[2]; // [[0, 0],null,null]
        ints6[1] = new int[3]; // [[0, 0],[0, 0, 0],null]
        ints6[2] = new int[4]; // [[0, 0],[0, 0, 0],[0, 0, 0, 0]]
        //[[0, 0, 0,0],[0, 0, 0],[0, 90, 0,0]]
        ints6[2][1] = 90;

        //Перебор массивов
        //Вар 1 - цикл for
        //Используется для изменения значений в массиве


        int[] ints7 = {3, 5, 7, -9, 0};
        // for позволяет изменить значение элемента
        // найти сумму значений элементов массива
        int sum = 0;
        for (int i = 0; i < ints7.length; i += 1) { //i - index элемента
            ints7[i] *= ints7[i]; // действия с элементом массива
            sum += ints7[i];
        }
        System.out.println("Сумма элементов: " + sum);
        // Цикл for "reach"
        //не предоставляет доступ к индексам
        //не дает возможность изменить значение элемента
        sum = 0;
        for (int element : ints7) { //идет от первого элемента к последнему
            // и каждая итерация возвращает значение элемента
            // int - формат элемента (byte, boolean, double, ...)
            sum += element;

        }
        System.out.println("Сумма элементов: " + sum);


        //найти и вывести минимальный элемент

        double[] ints8 = {3.5, 99.4, 813.4, -548, 12};
        double min = ints8[0];
        for (double elem : ints8) { //идет от первого элемента к последнему
            if (elem < min) min = elem;
        }
        System.out.println("Минимальное значение:" + min);

        // class Arrays
        //Arrays.sort(); - сортировка Arrays - class, .sort - метод
        Arrays.sort(ints8);
        Arrays.sort(ints8);
        System.out.println("Сортированный массив: " + Arrays.toString(ints8));

        int element = Arrays.binarySearch(ints8, 5); // предполагается, работает с отсортированным массивом
        System.out.println("Элемент " + element); //если элемент не найдет - возвращает отрицательное значение

        //Копирование массивов
        double[] ints9 = {3.5, 99.4, 813.4, -548, 12};
        double[] ints10 = ints9; // это не копирование, это создание второй ссылки на массив

        //клонирование
        double[] cloneInts9 = ints9.clone(); //клонирование массива, или копирование 1 вариант

        //
        //Arrays.copyOf()
        double[]copyInts9 = Arrays.copyOf(ints9, 3); //копируем 3 первых элемента
        System.out.println("Mssive1: "+ Arrays.toString(cloneInts9));
        System.out.println("Mssive2: "+ Arrays.toString(copyInts9));



        //
        double[]newDoubles=new double[10];
        System.arraycopy(ints9,1, newDoubles,3,4);// ints9 какой массив копируем
                                                                        //1 с какого индекса копируем
                                                                        //newDoubles куда копируем
                                                                        //3 с какого индекса записываем
                                                                        //4 сколько элементов будет скопировано
        System.out.println("Mssive3: "+ Arrays.toString(newDoubles));
    }
}
// алгоритм быстрой сортировки - рассказать как работает quick sort