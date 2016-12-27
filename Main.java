class Main {
	
	

	public static void main (String[] args){
		Dice boost = new Dice(6);
		Dice setback = new Dice(6);
		Dice ability = new Dice(8);
		Dice difficulty = new Dice(8);
		Dice proficiency = new Dice(12);
		Dice force = new Dice(12);

		System.out.println("Boost: " + boost.roll());
		System.out.println("Setback: " + setback.roll());
		System.out.println("Ability: " + ability.roll());
		System.out.println("Difficulty: " + difficulty.roll());
		System.out.println("Proficiency: " + proficiency.roll());
		System.out.println("Force: " + force.roll());
	}
}