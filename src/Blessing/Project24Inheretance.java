package Blessing;

public class Project24Inheretance {
        public  static void main(String[] args){
            Animal2 anim = new Animal2("Arthur", 2);
            anim.printAnimalInfo();
            Reptile roger = new Reptile("roger", 10 ,4);
            roger.printAnimalInfo();
            Dogg dogg = new Dogg("Doug",5,"Labrador");
            dogg.printAnimalInfo();
        }
}
