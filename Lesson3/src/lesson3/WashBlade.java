package lesson3;

import java.util.Scanner;

public class WashBlade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество тарелок: ");
        int numPlate = in.nextInt();
        System.out.println("Введите количество моющего средства");
        double fairy = in.nextInt();
        int a = 0;
        /*for (; fairy > 0 && numPlate > 0; a += 1, fairy -= 0.5, numPlate -= 1) {
        }
        System.out.println("Моющего средства осталось: " + fairy + " - Помыто тарелок: " + a + " - Осталось :" + numPlate);
        */

        while (fairy > 0 && numPlate > 0) {
        fairy-=0.5;
        numPlate-=1;
        a+=1;
            System.out.println("Моющего средства осталось: " + fairy);
        }
        System.out.println("Моющего средства осталось: " + fairy + " - Помыто тарелок: " + a + " - Осталось :" + numPlate);

    }

}
