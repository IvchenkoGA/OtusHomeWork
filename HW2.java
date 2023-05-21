import java.util.Scanner;

public class HomeWork2 {
    public static void homeWork2(String[] args) {
        int firstQuestion = 2;
        int secondQuestion = 3;
        int thirdQuestion = 1;
        int result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Как называются работы, проводимые для восстановления земель?\n""1)Культивация\n""2)Рекультивация\n""3)Распашка\n""4)Пассивация");
        int answer1 = sc.nextInt();
        if (answer1 = firstQuestion){
            result = result + 1;
        }

        System.out.println("Какой прибор позволяет регистрировать землетрясения?\n""1)Радиолокатор\n""2)Осциллограф\n""3)Сейсмограф\n""4)Индикатор");
        int answer2 = sc.nextInt();
        if (answer2 = secondQuestion){
            result = result + 1;
        }

        System.out.println("В результате чего возникают овраги?\n""1)Распашка земель\n""2)Наводнения, потопы\n""3)Загрязнение почвы\n""4)Все вышеперечисленные факторы влияют на появления оврагов");
        int answer3 = sc.nextInt();
        if (answer3 = thirdQuestion){
            result = result + 1;
        }
        System.out.println("Вы ответили верно на " + result + "вопросов.");

    }
}