package lotr;

import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class Knight extends Character{
    public Knight(){
        super(new Random().nextInt(11)+2, new Random().nextInt(11)+2,new NobleKick());
    }
}