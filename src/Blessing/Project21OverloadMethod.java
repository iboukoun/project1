package Blessing;

public class Project21OverloadMethod {
    public static void main(String[] args){
        Guitar g = new Guitar();
        System.out.println(g.bass(12));
        System.out.println(g.bass(4,"deep sound"));
        System.out.println(g.bass(9,"clanging sound",30));
    }
}
