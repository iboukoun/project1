package jobida;

public class Project27CastingObject {
        public static void main(String[] args){
            Animal animal=new Dog();
            animal.name="Charlie";
            animal.doTrick();
            Animal animal1 = new Cat();
            animal1.name="Wanda";
            animal1.doTrick();
            makeAnimalSpeak(animal);
            makeAnimalSpeak(animal1);
        }

        public static void makeAnimalSpeak(Animal animal){
            if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.bark();
            } else if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.meow();

            }

        }
}
