package com.company;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<Visitor> priorityQueue = new ArrayDeque<Visitor>();
        priorityQueue.add(new Visitor(25, "Tom"));
        priorityQueue.add(new Visitor(47, "Vasil"));
        priorityQueue.add(new Visitor(19, "Ivan"));
        priorityQueue.addFirst(new Visitor(62, "Nick"));    //Встает первым с методом addFirst
        priorityQueue.add(new Visitor(34, "Kolya"));
        priorityQueue.addFirst(new Visitor(67, "Petr"));    //Встает первым с методом addFirst
        for (Visitor s : priorityQueue)
            System.out.println(s.name + " - " + s.age);
    }

    //Описание Класса посетитель
    static class Visitor implements Comparable<Visitor>{
        public int age;
        public String name;

        public Visitor (int age, String name){
            this.age = age;
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }

        @Override
        public int compareTo(Visitor visitor) {
            return 0;
        }
    }

}
