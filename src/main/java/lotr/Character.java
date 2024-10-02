package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.kickstrategy.KickStrategy;

@Getter @AllArgsConstructor @Setter
public abstract class Character {
    private int hp;
    private int power;
    public void setHp(int hp) {
        if (hp>=0){
        this.hp = hp;}
        else{
            this.hp=0;
        }
    }
    private KickStrategy kickStrategy;
    public void kick(Character c){
        kickStrategy.kick(this,c);
    }
    public boolean isAlive(){
        return hp>0;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{hp=" + hp + ", power=" + power + "}";
    }
    
}
