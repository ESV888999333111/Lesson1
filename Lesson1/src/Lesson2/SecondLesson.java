package Lesson2; //Путь к классу

public class SecondLesson {
    public static void main(String[] args){
        //Логические операторы
        // && оператор логического "и"
        int x = 50, y = 100, z =91;
        boolean res = (x % 2 == 0) && (y % 2 ==0) && (z % 2 ==0);//Всегда тип boolean true/false
        System.out.println(res);
        res = (x<z) && (y>z);
        System.out.println(res);
        // || оператор логического "или" (\\ vs Shift)
        int code = 3333, age = 34;
        res = (code == 2222) || (code == 3333) || (code == 4444);
        System.out.println(res);
        // ! оператор логического отрицания
        // меняет значение boolean на противоположное
        System.out.println(!res);
        boolean isActive = false, isConnected  = true;
        res = !isActive || !isConnected;
        System.out.println(res);
        res = !((code != 3333) || (age < 18));
        System.out.println(res);

    }
}
