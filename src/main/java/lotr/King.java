package lotr;

import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class King extends Character{
    public King(){
        super(new Random().nextInt(11)+5, new Random().nextInt(11)+5,new NobleKick());
    }
}
