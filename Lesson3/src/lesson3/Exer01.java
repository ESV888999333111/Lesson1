package lesson3;
//вывести все неотрицательные элементы последовательности
public class Exer01 {
    public static void main(String[] args) {
        for (int num = 90; num >= 0; num -= 5) {
            System.out.println("Число: " + num);
        }
        System.out.println("the end");
    }
}
