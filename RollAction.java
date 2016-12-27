import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class RollAction implements ActionListener {
	JPanel screen;
	JComboBox<Integer> boostqt;
	JComboBox<Integer> setbackqt;
	JComboBox<Integer> abilityqt;
	JComboBox<Integer> difficultyqt;
	JComboBox<Integer> proficiencyqt;
	JComboBox<Integer> challengeqt;
	JComboBox<Integer> forceqt;
	JPanel showResults;
	JLabel actionRes;
	JLabel actionAdv;
	JLabel actionTri;
	JLabel actionDes;
	JLabel actionLig;
	JLabel actionDar;


	RollAction(JPanel screen, JPanel showResults,
				JLabel actionRes, JLabel actionAdv, JLabel actionTri, JLabel actionDes, JLabel actionLig, JLabel actionDar,
				JComboBox<Integer> boostqt, JComboBox<Integer> setbackqt, JComboBox<Integer> abilityqt,
				JComboBox<Integer> difficultyqt, JComboBox<Integer> proficiencyqt, JComboBox<Integer> challengeqt, JComboBox<Integer> forceqt){
		this.screen = screen;
		this.showResults = showResults;
		this.actionRes = actionRes;
		this.actionAdv = actionAdv;
		this.actionTri = actionTri;
		this.actionDes = actionDes;
		this.actionLig = actionLig;
		this.actionDar = actionDar;
		this.boostqt = boostqt;
		this.setbackqt = setbackqt;
		this.abilityqt = abilityqt;
		this.difficultyqt = difficultyqt;
		this.proficiencyqt = proficiencyqt;
		this.challengeqt = challengeqt;
		this.forceqt = forceqt;
	}

	public void actionPerformed(ActionEvent e){
		actionRes.setText(" ");
		actionAdv.setText(" ");
		actionTri.setText(" ");
		actionDes.setText(" ");
		actionLig.setText(" ");
		actionDar.setText(" ");

		Integer boost = (Integer)boostqt.getSelectedItem();
		Integer setback = (Integer)setbackqt.getSelectedItem();
		Integer ability = (Integer)abilityqt.getSelectedItem();
		Integer difficulty = (Integer)difficultyqt.getSelectedItem();
		Integer proficiency = (Integer)proficiencyqt.getSelectedItem();
		Integer challenge = (Integer)challengeqt.getSelectedItem();
		Integer force = (Integer)forceqt.getSelectedItem();

		EdgeDiceRoll pool = new EdgeDiceRoll();
		int[] results = new int[6]; 
		results = pool.roll(boost,setback,ability,difficulty,proficiency,challenge,force);

		if(boost>0 || setback>0 || ability>0 || difficulty>0 || proficiency>0 || challenge>0){
			if(results[0]>0){			
				actionRes.setText("SUCCESS +" + String.valueOf(results[0]));
				//showResults.add(actionRes);
			} else{
				actionRes.setText("FAILURE +" + String.valueOf(Math.abs(results[0])));
				//showResults.add(actionRes);
			}
		}

		if(results[1]>0){
			actionAdv.setText("Advantage +" + String.valueOf(results[1]));
			//showResults.add(actionAdv);
		} else if (results[1]<0) {
			actionAdv.setText("Threat +" + String.valueOf(Math.abs(results[1])));
			//showResults.add(actionAdv);
		}

		if(results[2]>0){
			actionTri.setText("TRIUMPH +" + String.valueOf(results[2]));
			//showResults.add(actionTri);
		}

		if(results[3]>0){
			actionDes.setText("DESPAIR +" + String.valueOf(results[3]));
			//showResults.add(actionDes);
		}

		if(results[4]>0){
			actionLig.setText("Light-Side Force +" + String.valueOf(results[4]));
			//showResults.add(actionLig);
		}

		if(results[5]>0){
			actionDar.setText("Dark-Side Force +" + String.valueOf(results[5]));
			//showResults.add(actionDar);
		}

		screen.add(showResults,BorderLayout.CENTER);
		//showResults.repaint();
		screen.repaint();
	}
}