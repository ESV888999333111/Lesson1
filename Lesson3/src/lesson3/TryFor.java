package lesson3;

import java.util.Scanner;

public class TryFor {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int userNum = in.nextInt(); // введенное число присвоиться к useNum
        int start = 1, end = 12;
// цикл for (){}, бесконечный цикл - for(;;){}
// for(инициализация переменных;булевое выражение(условие);обновление значение переменной){}
        for (start = 1, end = 12; start <= end; start += 1) {
            if (start % 2 == 0) System.out.println(start);
        }
    }
}
