package jobida;

public class InterfaceLearning {
    public static void main(String[] args){
        Parrot parrot = new Parrot();
        parrot.fly();
        Penguin penguin = new Penguin();
        penguin.dive();
        penguin.swim();
        Duck duck = new Duck();
        duck.dive();
        duck.fly();
        duck.swim();

    }
}
