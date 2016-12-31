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
		UP_ABILITY,
		DOWN_PROFICIENCY,
		UP_DIFFICULTY,
		DOWN_CHALLENGE
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

		if(e.getActionCommand()=="UP_ABILITY"){
			if(abilityqt.getSelectedIndex()>0){
				abilityqt.setSelectedIndex(abilityqt.getSelectedIndex()-1);
				proficiencyqt.setSelectedIndex(proficiencyqt.getSelectedIndex()+1);
			} else if (abilityqt.getSelectedIndex()==0) {
				abilityqt.setSelectedIndex(abilityqt.getSelectedIndex()+1);
			}
		}

		if(e.getActionCommand()=="UP_DIFFICULTY"){
			if(difficultyqt.getSelectedIndex()>0){
				difficultyqt.setSelectedIndex(difficultyqt.getSelectedIndex()-1);
				challengeqt.setSelectedIndex(challengeqt.getSelectedIndex()+1);
			} else if (difficultyqt.getSelectedIndex()==0) {
				difficultyqt.setSelectedIndex(difficultyqt.getSelectedIndex()+1);
			}
		}

		if(e.getActionCommand()=="DOWN_PROFICIENCY"){
			if(proficiencyqt.getSelectedIndex()>0){
				proficiencyqt.setSelectedIndex(proficiencyqt.getSelectedIndex()-1);
				abilityqt.setSelectedIndex(abilityqt.getSelectedIndex()+1);
			}
		}

		if(e.getActionCommand()=="DOWN_CHALLENGE"){
			if(challengeqt.getSelectedIndex()>0){
				challengeqt.setSelectedIndex(challengeqt.getSelectedIndex()-1);
				difficultyqt.setSelectedIndex(difficultyqt.getSelectedIndex()+1);
			}
		}
	}


}