package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Homework_Seminar3 {
//    (Дополнительно) Реализовать алгоритм сортировки слиянием

    public static void task1() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        list.add(random.nextInt(11));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

//    Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static void task2() {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + ar);

            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число:" + ar.get(i));
                    ar.remove(i);
                }
            }
            Collections.sort(ar);
            System.out.println("Список с удаленными четными числами: \n " + ar);
        }
    }

//    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

    public static void task3() {
        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrlst.add(rnd.nextInt(0,10));
        }
        System.out.println(arrlst.toString());
        int max = arrlst.get(0);
        int min = arrlst.get(0);
        int sum = 0;
        for(int i=0;i<arrlst.size();i++){
            if (arrlst.get(i)>max) max = arrlst.get(i);
            if (arrlst.get(i)<min) min = arrlst.get(i);
            sum=sum+arrlst.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/arrlst.size()));

    }
}
