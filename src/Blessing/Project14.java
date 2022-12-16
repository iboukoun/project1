package Blessing;

public class Project14 {
        public static void main(String[] args){
//            create some apartment objects
            Apartment apartment1=new Apartment(234);
            Apartment apartment2=new Apartment(123);
//            use the object instance variable
            System.out.println("Apartment1's floor number: "+apartment1.floorNumber);
            System.out.println("Apartment2's floor number: "+apartment2.floorNumber);


            for (int i=0;i<=5;i++){
//                use the objects instance methods
                apartment1.useWater();
                apartment2.useWater();
            }
        }
//        keep using the water until there is no more left


}
