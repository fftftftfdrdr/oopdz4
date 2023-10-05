package org.example.homework;


import java.util.ArrayList;

public class Box<T extends Fruct> {

    ArrayList<T> fructs;
    String type;

    public Box(){
        this.fructs = new ArrayList<>();
    }

    public Boolean putFruit(T fruit) {

        if (fructs.size() == 0) setType(fruit);

        if (checkFructType(fruit)) {
            fructs.add(fruit);
            return true;
        }

        System.out.println("Невозможно положить, т.к. ящик уже заполнен другими фруктами.");
        return false;

    }

    public Boolean OverToBox(Box<T> box) {

        if (this.isFilledBox()) {

            if ( (box.isFilledBox() && checkFructType(box)) || !box.isFilledBox()) {
                this.moveTo(box);
                this.cleanBox();
                return true;
            }
            else {
                System.out.println("Нельзя пересыпать, в ящике другой тип фруктов.");
                return false;
            }

        }
        else {
            System.out.println("ящик пуст.");
            return false;
        }

    }

    public void moveTo(Box<T> box) {
        for (T fruct : this.fructs) {
            box.putFruit(fruct);
        }
    }

    public float getWeight() {

        if (isFilledBox())
            return fructs.get(0).getWeight() * fructs.size();

        return 0f;
    }

    public Boolean compare(Box<T> box) {
        return this.getWeight() == box.getWeight();
    }

    private Boolean isFilledBox() {
        return this.fructs.size() > 0;
    }

    private Boolean checkFructType(Box<T> box) {

        return checkFructType(box.fructs.get(0));
    }

    private Boolean checkFructType(T fruit) {

        if (fruit instanceof Apple) {
            if (this.type == "Apple")
                return true;
        }
        else if (fruit instanceof Orange) {
            if (this.type == "Orange")
                return true;
        }

        return false;
    }

    private void setType(T fruit) {

        if (fruit instanceof Apple) {
            this.type = "Apple";
        }
        else if (fruit instanceof Orange) {
            this.type = "Orange";
        }

    }

    private void cleanBox() {
        this.fructs = new ArrayList<>();
        this.type = "";
    }

    @Override
    public String toString() {
        if (isFilledBox()) {
            return String.format("коробка %s %d штук.",  this.type, fructs.size());
        }
        else {
            return String.format("коробка пуста");
        }

    }

}