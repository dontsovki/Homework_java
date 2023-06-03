import Task.Homework_Certification_Laptop;
import Task.Homework_Seminar1;
import Task.Homework_Seminar2;
import Task.Homework_Seminar3;

import java.util.*;

public class Main {
//    public static void main(String[] args) {
//        Homework_Seminar1.task1();
//        Homework_Seminar1.task2();
//        Homework_Seminar1.task3();
//        Homework_Seminar2.task1();
//        Homework_Seminar2.task2();
//        Homework_Seminar3.task1();
//        Homework_Seminar3.task2();
//        Homework_Seminar3.task3();
//    }
public static void main(String[] args) {
    Homework_Certification_Laptop lap1 = new Homework_Certification_Laptop("A5",1236,"Xiaomi"); // Объект ноутбук1
    lap1.setColor("black");
    lap1.setHDD(700);
    lap1.setOS("Windows");
    lap1.setRAM(8);

    Homework_Certification_Laptop lap2=new Homework_Certification_Laptop("ABC30",6467,"Acer"); // Объект ноутбук2
    lap2.setColor("white");
    lap2.setHDD(1000);
    lap2.setOS("Windows");
    lap2.setRAM(8);

    Homework_Certification_Laptop lap3=new Homework_Certification_Laptop("AB97",67201,"Acer"); // Объект ноутбук3
    lap3.setColor("rose");
    lap3.setHDD(900);
    lap3.setOS("Windows");
    lap3.setRAM(16);

    Homework_Certification_Laptop lap4=new Homework_Certification_Laptop("OMAN11",1111,"hp"); // Объект ноутбук4
    lap4.setColor("black");
    lap4.setHDD(700);
    lap4.setOS("Linux");
    lap4.setRAM(8);

    Homework_Certification_Laptop lap5=new Homework_Certification_Laptop("MAC101",8438483,"Apple"); // Объект ноутбук5
    lap5.setColor("silver");
    lap5.setHDD(1000);
    lap5.setOS("macOS");
    lap5.setRAM(8);

    HashSet<Homework_Certification_Laptop> laptops = new HashSet<>(Arrays.asList(lap1,lap2,lap3,lap4,lap5));
    HashSet <Homework_Certification_Laptop> res = new HashSet<>();

    System.out.println("Здравствуйте");
    System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
    Scanner sc = new Scanner(System.in);
    Integer n = sc.nextInt();
    sc.nextLine();
    HashMap<String, Object> filters = new HashMap<>();
    while(n!=5){
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = sc.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
    }
    for (Map.Entry<String, Object> entry : filters.entrySet()) {
        if(entry.getKey().equals("RAM")){
            Iterator it = laptops.iterator();
            while(it.hasNext()){
                Homework_Certification_Laptop lap = (Homework_Certification_Laptop) it.next();
                if(lap.getRAM()>=(Integer)entry.getValue()){
                    res.add(lap);
                }
            }
        }
        if(entry.getKey().equals("HDD")){
            Iterator it = laptops.iterator();
            while(it.hasNext()){
                Homework_Certification_Laptop lap = (Homework_Certification_Laptop)it.next();
                if(lap.getHDD()>=(Integer)entry.getValue()){
                    res.add(lap);
                }
            }
        }
        if(entry.getKey().equals("OS")){
            Iterator it = laptops.iterator();
            while(it.hasNext()){
                Homework_Certification_Laptop lap = (Homework_Certification_Laptop)it.next();
                if(lap.getOS().equals(entry.getValue())){
                    res.add(lap);
                }
            }
        }
        if(entry.getKey().equals("color")){
            Iterator it = laptops.iterator();
            while(it.hasNext()){
                Homework_Certification_Laptop lap = (Homework_Certification_Laptop)it.next();
                if(lap.getColor().equals(entry.getValue())){
                    res.add(lap);
                }
            }
        }
    }

    Iterator it = res.iterator();
    while(it.hasNext()){
        Homework_Certification_Laptop lap = (Homework_Certification_Laptop)it.next();
        System.out.println(lap.toString());
        System.out.println();
    }


}
}