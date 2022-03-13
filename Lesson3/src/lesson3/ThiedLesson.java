package lesson3;

import java.util.Scanner;

public class ThiedLesson {
    public static void main(String[] args) {
        // Пользовательский ввод
        Scanner in = new Scanner(System.in);
        //System.out.println("Введите число");
        int userNum = in.nextInt(); // введенное число присвоиться к useNum
        //System.out.println(userNum * userNum);
        //
        //Цикл while (true/false)
        //для выхода из текужего цикла используется break
        while (true) {
            System.out.println("Введите положительное число " + "или 0 для выхода из программы");
            userNum = in.nextInt();
            if (userNum == 0) break; // завершение текущего цикла
            if (userNum < 0) continue; // переход на следующую итерацию, т.е. возвращение в начало цикла,
            // и последующие инструкции не будут выполнены
            System.out.println(userNum * userNum);
        }
        //do {} while (true/false) первую итерацию выполнит в любом случае с пост проверкой условия
        do {
            System.out.println("Do Введите положительное число " + "или 0 для выхода из программы");
            userNum = in.nextInt();
            if (userNum == 0) break; // завершение текущего цикла
            if (userNum < 0) continue;
            System.out.println(userNum * userNum);
        } while (userNum != 0);
    }
}
