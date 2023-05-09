import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Home_Work3 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;
        // Массив вопросов
        String[] questions = new String[3];
        questions[0] = "Вопрос 1: какая величина числа Pi?";
        questions[1] = "Вопрос 2: Сколько месяцев в году?";
        questions[2] = "Вопрос 3: Кто убил Пушкина?";
        //Массив вариантов ответов
        String[][] answerOptions = new String[3][4];
        answerOptions[0][0] = "1. 3,14";
        answerOptions[0][1] = "2. 4,13";
        answerOptions[0][2] = "3. 5,13";
        answerOptions[0][3] = "4. 3,13";
        answerOptions[1][0] = "1. 23";
        answerOptions[1][1] = "2. 12";
        answerOptions[1][2] = "3. 11";
        answerOptions[1][3] = "4. 142";
        answerOptions[2][0] = "1. Дантес";
        answerOptions[2][1] = "2. Гитлер";
        answerOptions[2][2] = "3. Смурфик";
        answerOptions[2][3] = "4. Король Артур на нас напали";
        //Массив правильных вариантов ответов
        int[] correctAnswers = {1, 2, 1};

        Scanner scanner = new Scanner(System.in);
        //Вывод поросов и ответов
        for (int i = 0; i < 3; i++) {
            System.out.println(questions[i]);
            if (i == 0) {
                int e = 0;
                for (int j = 0; j < 4; j++) {
                    System.out.println(answerOptions[e][j]);
                }
            } else if (i == 1) {
                int e = 1;
                for (int j = 0; j < 4; j++) {
                    System.out.println(answerOptions[e][j]);
                }
            } else if (i == 2) {
                int e = 2;
                for (int j = 0; j < 4; j++) {
                    System.out.println(answerOptions[e][j]);
                }
            }
            System.out.print("Ваш ответ: ");
            // Проверка ответов и увеличение счетчиков
            int answer = scanner.nextInt();
            int correct = correctAnswers[i];
            if (correct == answer) {
                correctCount += 1;
            } else {
                wrongCount += 1;
            }
            //branch hw4
            //Выводим общий результат
            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
        }
    }
}