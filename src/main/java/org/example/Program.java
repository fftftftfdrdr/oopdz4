package org.example;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Employee("AAAAA", 32));
        arrayList.add(12);
        arrayList.add("Hello!");

        for (Object o: arrayList) {
            if (o instanceof Employee){
                Employee e = (Employee)o;
                System.out.printf("%s - %d\n", e.getName(), e.getAge());
            }

        }


        MyArrayList<Employee> arrayList1 = new MyArrayList(new Object[10]);
        arrayList1.add(new Employee("AAAAA", 32));
        arrayList1.add(new Employee("BBBB", 44));
        System.out.println("Кол-во элементов: " + arrayList1.size());

        for (Employee o: arrayList1) {
            if (o != null)
                System.out.printf("%s - %d\n", o.getName(), o.getAge());
        }



    }

}
