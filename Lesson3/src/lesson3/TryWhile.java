package lesson3;

import java.util.Scanner;

public class TryWhile {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int userNum = in.nextInt(); // введенное число присвоиться к useNum
        int start = 1, end = 12;
        // вывести все четные числа от star до end
        // четное число %2 == 0
        while (start <= end) {
            if (start % 2 == 0) System.out.println(start);
            start += 1; //start = start +1;
        }
    }
}
