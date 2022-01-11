package ss5_access_modifier.thuc_hanh;

public class testCar {
    public static void main(String[] args) {
        Car car1 = new Car("masda","2021");
        System.out.println(Car.numberOfCars);
        System.out.println(car1.getName()+car1.getEngine());
        Car car2 = new Car("honda","2022");
        System.out.println(Car.numberOfCars);
        System.out.println(car2.getName()+car2.getEngine());

    }
}
