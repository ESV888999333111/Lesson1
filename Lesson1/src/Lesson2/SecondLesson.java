package Lesson2; //Путь к классу

public class SecondLesson {
    public static void main(String[] args) {
        //Логические операторы
        // && оператор логического "и"
        int x = 50, y = 100, z = 91;
        boolean res = (x % 2 == 0) && (y % 2 == 0) && (z % 2 == 0);//Всегда тип boolean true/false
        System.out.println(res);
        res = (x < z) && (y > z);
        System.out.println(res);
        // || оператор логического "или" (\\ vs Shift)
        int code = 3333, age = 34;
        res = (code == 2222) || (code == 3333) || (code == 4444);
        System.out.println(res);
        // ! оператор логического отрицания
        // меняет значение boolean на противоположное
        System.out.println(!res);
        boolean isActive = false, isConnected = true;
        res = !isActive || !isConnected;
        System.out.println(res);
        res = !((code != 3333) || (age < 18));
        System.out.println(res);
        /* операторы принятия решения
        if (){} else {}

        if (){}
        else if(){}
        else if(){}
        else {}
         */
        int state = 0;
        //
        if (state == 0) {
            System.out.println("Закрытие приложения");
        } else if (state == 1) {
            System.out.println("Открытие приложения");
        } else {
            System.out.println("Ошибка");
        }
        int month = 8;
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Зима");
        } else if ((month >= 3) && (month <= 5)) {
            System.out.println("Весна");
        } else if ((month >= 6) && (month <= 8)) {
            System.out.println("Лето");
        } else if ((month >= 9) && (month <= 11)) {
            System.out.println("Осень");
        } else {
            System.out.println("Серьезно!!!!");
        }
        // Вариант 2 короче
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Зима");
        } else if (month <= 5) {
            System.out.println("Весна");
        } else if (month <= 8) {
            System.out.println("Лето");
        } else if (month <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Серьезно!!!!");
        }
        /* операторы принятия решения
        Switch (выражения или переменные){
        case значение1:
        инструкции
        [break]
        case значение2:
        инструкции
        [break]
        case значение3:
        инструкции
        [break]
        default:
        инструкции
        [break]
        }
        Switch выполнит иструкции от первого совпадения до конца или до break
         */
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весно");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("NOUP");
        }
        int sum = 1000, saleCode = 4525;
        switch (saleCode) {
            case 4525:
                System.out.println("Сумма покупки: " + sum * 0.7);
                break;
            case 6424:
            case 7012:
                System.out.println("Сумма покупки: " + (double) sum * 0.8);
                break;
            case 7647:
            case 9011:
            case 6612:
                System.out.println("Сумма покупки: " + (double) sum * 0.9);
                break;
            default:
                System.out.println("Сумма покупки: " + sum);
        }
    }
}
