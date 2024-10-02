package lotr;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class CharacterFactory {
    @SuppressWarnings("unchecked")
    public static Character createCharacter() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException  {
        @SuppressWarnings("rawtypes")
        Class characters[]={Hobbit.class,King.class,Knight.class,Elf.class};
        return (Character) characters[new Random().nextInt(characters.length)].getConstructor().newInstance();
    }

    
}
