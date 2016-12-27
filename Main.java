import java.util.*;

class Main {
	
	

	public static void main (String[] args){
		EdgeDiceRoll edge = new EdgeDiceRoll();
		int[] roll = new int[6];
		roll = edge.rollPool(1,1,1,1,1,1,1);

		if(roll[0]>0)
			System.out.println("SUCCESS +" + roll[0]);
		else
			System.out.println("FAILURE +" + Math.abs(roll[0]));

		if(roll[1]>0)
			System.out.println("Advantage +" + roll[1]);
		else if (roll[1]<0)
			System.out.println("Threat +" + Math.abs(roll[1]));

		if(roll[2]>0)
			System.out.println("TRIUMPH +" + roll[2]);

		if(roll[3]>0)
			System.out.println("DESPAIR +" + roll[3]);

		if(roll[4]>0)
			System.out.println("Light-Side Force +" + roll[4]);

		if(roll[5]>0)
			System.out.println("Dark-Side Force +" + roll[5]); 

	}
}