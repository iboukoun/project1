package jobida;

public class Duck extends  Bird implements Swimmer,Flyer {
 @Override
 public void swim(){
     System.out.println("Duck can swim by padding their feet under" +
             "the water");


    }
    @Override
    public void fly(){
     System.out.println("Duck can fly great distances when migrating");
    }
    @Override
    public  void dive() {
     System.out.println("Duck can hold their breathe for several minutes" +
             "when they dive for food");
    }

}
