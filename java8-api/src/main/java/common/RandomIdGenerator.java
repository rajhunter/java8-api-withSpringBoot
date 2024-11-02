package common;

import java.util.Random;
import java.util.UUID;

public class RandomIdGenerator {
    public static Long generateRandomId() {
    	final Random RANDOM = new Random();
    	//UUID uuid = UUID.randomUUID();
        //long combinedId = (uuid.getMostSignificantBits() ^ uuid.getLeastSignificantBits());
        
         return (long) (100000 + RANDOM.nextInt(900000));
    }

   
   
}
