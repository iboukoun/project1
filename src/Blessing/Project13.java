package Blessing;

public class Project13 {
        public static void main(String[] args){
            Player player1=new Player();// player1 is a reference variable(point to an object of  a given class)
            System.out.println(player1.name);
            System.out.println(player1.skill);
            System.out.println(player1.health);
            Player player2=new Player("Teddy","Broadsword Slash",100);
            System.out.println(player2.name);
            System.out.println(player2.skill);
            System.out.println(player2.health);

            Monster monster1=new Monster("Minotaur","ARGGHH",100);
            for (int i=1;i<=5;i++){
                player2.attack(monster1);
            }


        }
}
