package Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Homework_Seminar2 {
//    Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//    результат после каждой итерации запишите в лог-файл.
    public static void task1() {
        StringBuilder sb = new StringBuilder();
        int[] arr = {5, 7, -1, 0, 11, 18, 8, 3, 9, 2};
        int temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                sb.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter fw = new FileWriter("log_task1.txt", false);
                    fw.write(sb.toString());
                    fw.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }
        }

    }
    // //Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// 3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

    public static void task2() {
        String dataFile = "file.txt";
        String[] infoBase;
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            String line; {
                while ((line = br.readLine()) != null) {
                    infoBase = line.replace("\"", "").split(":|,");
                    sb.append("Студент ").append(infoBase[1]).append(" получил ").append(infoBase[3])
                            .append(" по предмету ").append(infoBase[5]).append(".\n");
                }
                System.out.println(sb);
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
