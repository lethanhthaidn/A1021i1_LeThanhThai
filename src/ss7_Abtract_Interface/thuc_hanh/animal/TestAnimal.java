package ss7_Abtract_Interface.thuc_hanh.animal;

import ss7_Abtract_Interface.thuc_hanh.interface1.Edible;

public class TestAnimal {
    public static void main(String[] args) {


        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}