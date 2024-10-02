package lotr;
import lotr.kickstrategy.HobbitKick;

public class Hobbit extends Character {
    public Hobbit(){
        super(3, 0, new HobbitKick());
    }
}
    // public Hobbit(){
    //     super(hp:3,power:0);
    // }
    // @Override
    // public void kick(Character c){
    //     toCry();
    // }
    // public void toCry(){
    //     System.out.println(x:"🥲🥲🥲");
    // }
    

