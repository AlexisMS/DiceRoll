import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.event.ActionEvent;    
import java.awt.event.ActionListener;

class ChangeSelection implements ActionListener {
	JPanel screen;
	JComboBox<Integer> boostqt;
	JComboBox<Integer> setbackqt;
	JComboBox<Integer> abilityqt;
	JComboBox<Integer> difficultyqt;
	JComboBox<Integer> proficiencyqt;
	JComboBox<Integer> challengeqt;
	JComboBox<Integer> forceqt;
	JComboBox<Integer> d10qt;

	ChangeSelection(JPanel screen, JComboBox<Integer> boostqt, JComboBox<Integer> setbackqt,
					JComboBox<Integer> abilityqt, JComboBox<Integer> difficultyqt,
					JComboBox<Integer> proficiencyqt, JComboBox<Integer> challengeqt,
					JComboBox<Integer> forceqt,	JComboBox<Integer> d10qt) {
		this.screen = screen;
		this.boostqt = boostqt;
		this.setbackqt = setbackqt;
		this.abilityqt = abilityqt;
		this.difficultyqt = difficultyqt;
		this.proficiencyqt = proficiencyqt;
		this.challengeqt = challengeqt;
		this.forceqt = forceqt;
		this.d10qt = d10qt;
	}

/*	enum Actions{
		RESET,
		UP_ABILITY
	}*/

	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand()=="RESET"){
			boostqt.setSelectedIndex(0);
			setbackqt.setSelectedIndex(0);
			abilityqt.setSelectedIndex(0);
			difficultyqt.setSelectedIndex(0);
			proficiencyqt.setSelectedIndex(0);
			challengeqt.setSelectedIndex(0);
			forceqt.setSelectedIndex(0);
			d10qt.setSelectedIndex(0);

		}
	}


}