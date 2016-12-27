class EdgeDiceRoll {

	Dice boost = new Dice(6);
	Dice setback = new Dice(6);
	Dice ability = new Dice(8);
	Dice difficulty = new Dice(8);
	Dice proficiency = new Dice(12);
	Dice challenge = new Dice(12);
	Dice force = new Dice(12);
	int success = 0;
	int failure = 0;
	int advantage = 0;
	int threat = 0;
	int triumph = 0;
	int despair = 0;
	int light = 0;
	int dark = 0;

	EdgeDiceRoll(){}


	int[] roll(int dboost, int dsetback, int dability, int ddifficulty, int dproficiency, int dchallenge, int dforce){
 		success = 0;
 		failure = 0;
 		advantage = 0;
 		threat = 0;
 		triumph = 0;
 		despair = 0;
 		light = 0;
 		dark = 0;
 		if(dboost>0){
 			for(int i=1; i<dboost+1; i++){
 				this.rollBoost();
 			}
 		}
 		if(dsetback>0){
 			for(int i=1; i<dsetback+1; i++){
 				this.rollSetback();
 			}
 		}
 		if(dability>0){
 			for(int i=1; i<dability+1; i++){
 				this.rollAbility();
 			}
 		}
 		if(ddifficulty>0){
 			for(int i=1; i<ddifficulty+1; i++){
 				this.rollDifficulty();
 			}
 		}

 		if(dproficiency>0){
 			for(int i=1; i<dproficiency+1; i++){
 				this.rollProficiency();
 			}
 		}
 		if(dchallenge>0){
 			for(int i=1; i<dchallenge+1; i++){
 				this.rollChallenge();
 			}
 		}
 		if(dforce>0){
 			for(int i=1; i<dforce+1; i++){
 				this.rollForce();
 			}
 		}
 		int[] result = new int[6];
 		result[0] = success-failure;
 		result[1] = advantage-threat;
 		result[2] = triumph;
 		result[3] = despair;
 		result[4] = light;
 		result[5] = dark;
 		return result;
	}

	void rollBoost(){
		int res = boost.roll();
		switch (res){
			case 1:
			case 2:
				break;
			case 3:
				success++;
				break;
			case 4:
				success++;
				advantage++;
				break;
			case 5:
				advantage+=2;
				break;
			case 6:
				advantage++;
				break;
			default:
				break;
		}
	} 

	void rollSetback(){
		int res = setback.roll();
		switch (res){
			case 1:
			case 2:
				break;
			case 3:
			case 4:
				failure++;
				break;
			case 5:
			case 6:
				threat++;
				break;
			default:
				break;
		}
	}

	void rollAbility(){
		int res = ability.roll();
		switch (res){
			case 1:
				break;
			case 2:
			case 3:
				success++;
				break;
			case 4:
				success+=2;
				break;
			case 5:
			case 6:
				advantage++;
				break;
			case 7:
				success++;
				advantage++;
				break;
			case 8:
				advantage+=2;
				break;
			default:
				break;
		}
	}

	void rollDifficulty(){
		int res = difficulty.roll();
		switch (res){
			case 1:
				break;
			case 2:
				failure++;
				break;
			case 3:
				failure+=2;
				break;
			case 4:
			case 5:
			case 6:
				threat++;
				break;
			case 7:
				threat+=2;
				break;
			case 8:
				failure++;
				threat++;
				break;
			default:
				break;
		}
	}

	void rollProficiency(){
		int res = proficiency.roll();
		switch (res){
			case 1:
				break;
			case 2:
			case 3:
				success++;
				break;
			case 4:
			case 5:
				success+=2;
				break;
			case 6:
				advantage++;
				break;
			case 7:
			case 8:
			case 9:
				success++;
				advantage++;
				break;
			case 10:
			case 11:
				advantage+=2;
				break;
			case 12:
				triumph++;
				success++;
				break;
			default:
				break;
		}
	}

	void rollChallenge(){
		int res = challenge.roll();
		switch(res){
			case 1:
				break;
			case 2:
			case 3:
				failure++;
				break;
			case 4:
			case 5:
				failure+=2;
				break;
			case 6:
			case 7:
				threat++;
				break;
			case 8:
			case 9:
				failure++;
				threat++;
				break;
			case 10:
			case 11:
				threat+=2;
				break;
			case 12:
				despair++;
				failure++;
				break;
			default:
				break;
		}
	}

	void rollForce(){
		int res = force.roll();
		switch (res){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				dark++;
				break;
			case 7:
				dark+=2;
				break;
			case 8:
			case 9:
				light++;
				break;
			case 10:
			case 11:
			case 12:
				light+=2;
				break;
			default:
				break;
		}
	}
}