import lotr.Character;
import lotr.Hobbit;;
public class GameManager {
    public static void fight(Character c1, Character c2) { 
        if(c1 instanceof Hobbit && c2 instanceof Hobbit ){
            System.out.println("a lot of tears, none wins"); 
        }
        else{
            while(c1.isAlive() && c2.isAlive()){
                System.out.println(c1 + "kicks" +c2);
                c1.kick(c2);
                if(c1.isAlive() && c2.isAlive()){
                    System.out.println(c2 + "kicks" +c1);
                    c2.kick(c1);}
            }
            if (c1.isAlive()){
                System.out.println(c1+"wins"+c2+"is dead");
            }
            else{
                System.out.println(c2+"wins"+c1+"is dead");
            }
        }
    }
    
}
