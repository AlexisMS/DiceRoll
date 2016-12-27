import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Dice {

	int sides;

	Dice(int sides){
		this.sides = sides;
	}

	int roll(){
		return ThreadLocalRandom.current().nextInt(1, sides+1);
	}
}