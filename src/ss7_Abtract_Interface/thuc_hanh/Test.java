package ss7_Abtract_Interface.thuc_hanh;

import ss7_Abtract_Interface.thuc_hanh.animal.Animal;
import ss7_Abtract_Interface.thuc_hanh.animal.Chicken;
import ss7_Abtract_Interface.thuc_hanh.animal.TestAnimal;
import ss7_Abtract_Interface.thuc_hanh.animal.Tiger;
import ss7_Abtract_Interface.thuc_hanh.fruit.Apple;
import ss7_Abtract_Interface.thuc_hanh.fruit.Fruit;
import ss7_Abtract_Interface.thuc_hanh.fruit.Orange;
import ss7_Abtract_Interface.thuc_hanh.fruit.TestFruit;
import ss7_Abtract_Interface.thuc_hanh.interface1.Edible;

public class Test {
    public static void main(String[] args) {

//        Animal[] animals = new Animal[2];
//        animals[0] = new Tiger();
//        animals[1] = new Chicken();
//        for (Animal animal : animals) {
//            System.out.println(animal.makeSound());
//
//            if (animal instanceof Chicken) {
//                Edible edibler = (Chicken) animal;
//                System.out.println(edibler.howToEat());
//            }
//        }
//        Fruit[] fruits = new Fruit[2];
//        fruits[0] = new Orange();
//        fruits[1] = new Apple();
//        for (Fruit fruit : fruits) {
//            System.out.println(fruit.howToEat());
//        }
        TestAnimal.main(null);
        TestFruit.main(null);
    }
}
