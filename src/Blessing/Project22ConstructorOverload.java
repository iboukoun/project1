package Blessing;

public class Project22ConstructorOverload {
    public static void main(String[] args){
        Vehicle car1 = new Vehicle("Honda","civic",2020);
        System.out.println(car1);
        Vehicle car2 = new Vehicle("Tesla","Model S");
        System.out.println(car2);
        Vehicle car3 = new Vehicle ("Ford");
        System.out.println(car3);
    }
}
