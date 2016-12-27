class EdgeDiceRoll {

	Dice boost = new Dice(6);
	Dice setback = new Dice(6);
	Dice ability = new Dice(8);
	Dice difficulty = new Dice(8);
	Dice proficiency = new Dice(12);
	Dice force = new Dice(12);
	int[] result = new int[4];
	int sucess = 0;
	int failure = 0;
	int advantage = 0;
	int threat = 0;
	int triumph = 0;
	int despair = 0;

	EdgeDiceRoll(){}

	int[] rollPool(int dboost, int dsetback, int dability, int dproficiency, int dforce){

	}

	void rollBoost(){
		int res = boost.roll();
		switch (res){
			case 1:
				break;
			case 2:
				break;
			case 3:
				sucess++;
				break;
			case 4:
				sucess++;
				advantage++;
				break;
			case 5:
				advantage++;
				advantage++;
				break;
			case 6:
				advantage++;
				break;
			default:
				break;
		}
	} 
}