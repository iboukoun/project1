package jobida;

public class Penguin extends Bird implements Swimmer{
    @Override
    public void swim(){
        System.out.println("Penguins are agile swimmers");

    }
    @Override
    public void dive(){
        System.out.println("penguins can drive hundreds of feet to ctch fish");
    }

}
