package lesson3;

// вывести на экран первые 10 элементов последовательности 2 4 6 8 10 ...
public class Print10 {
    public static void main(String[] args) {
        for (int a = 2, b = 1; b <= 10; b += 1, a += 2) {
            System.out.println("№:" + b + " - Число: " + a);
            // a += 2;
        }
    }
}
