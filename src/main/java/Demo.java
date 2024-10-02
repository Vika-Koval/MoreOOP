import java.lang.reflect.InvocationTargetException;

import lotr.Character;
import lotr.CharacterFactory;
public class Demo {
    public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();
        GameManager.fight(character1, character2);
    }
}
