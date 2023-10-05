package org.example.homework;

public class Program {


    public static void main(String[] args) {

        Box<Fruct> box1 = BoxWithFructs(10, "яблок");
        Box<Fruct> box2 = BoxWithFructs(5, "апельсинов");
        Box<Fruct> box3 = BoxWithFructs(0, "");

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        box1.OverToBox(box2); // пересыпать невозможно
        System.out.println(box1.compare(box2)); // сравнение веса первого и второго бокса

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        box1.OverToBox(box3); // пересыпать возможно

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

    }

    static Box<Fruct> BoxWithFructs(int count, String type){

        Box<Fruct> box = new Box<>();

        for (int i = 0; i < count; i++)
            box.putFruit(OneFruct(type));

        return box;
    }

    static Fruct OneFruct(String type) {

        Fruct fruct;

        if (type == "Apple") {
            fruct = new Apple();
        }
        else {
            fruct = new Orange();
        }

        return fruct;
    }

}