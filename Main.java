import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {
	
	

	public static void main (String[] args){
		JFrame f = new JFrame();
		JPanel screen = new JPanel();
		f.setContentPane(screen);
		screenConfig(screen);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setSize(800,200); //lar x alt
	    f.setTitle("Star Wars RPG Dice Roller");
	    f.setVisible(true);
	    f.setResizable(false);

	}

	static void screenConfig (JPanel screen){
		screen.setLayout(new BorderLayout(5,5));

		JPanel showResults = new JPanel();
		screen.add(showResults,BorderLayout.CENTER);
		showResults.setLayout(new BoxLayout(showResults,BoxLayout.Y_AXIS));

		JLabel actionRes = new JLabel();
		JLabel actionAdv = new JLabel();
		JLabel actionTri = new JLabel();
		JLabel actionDes = new JLabel();
		JLabel actionLig = new JLabel();
		JLabel actionDar = new JLabel();
		showResults.add(actionRes);
		actionRes.setAlignmentX(screen.CENTER_ALIGNMENT);
		showResults.add(actionAdv);
		actionAdv.setAlignmentX(screen.CENTER_ALIGNMENT);
		showResults.add(actionTri);
		actionTri.setAlignmentX(screen.CENTER_ALIGNMENT);
		showResults.add(actionDes);
		actionDes.setAlignmentX(screen.CENTER_ALIGNMENT);
		showResults.add(actionLig);
		actionLig.setAlignmentX(screen.CENTER_ALIGNMENT);
		showResults.add(actionDar);
		actionDar.setAlignmentX(screen.CENTER_ALIGNMENT);

		JPanel poolOptions = new JPanel();
		Integer[] diceqt = new Integer[] {0,1,2,3,4,5,6,7,8,9};

		JLabel boostlb = new JLabel("boost:");
		poolOptions.add(boostlb);
		JComboBox<Integer> boostqt = new JComboBox<>(diceqt);
		poolOptions.add(boostqt);

		JLabel setbacklb = new JLabel("setback:");
		poolOptions.add(setbacklb);
		JComboBox<Integer> setbackqt = new JComboBox<>(diceqt);
		poolOptions.add(setbackqt);

		JLabel abilitylb = new JLabel("ability:");
		poolOptions.add(abilitylb);
		JComboBox<Integer> abilityqt = new JComboBox<>(diceqt);
		poolOptions.add(abilityqt);

		JLabel difficultylb = new JLabel("difficulty:");
		poolOptions.add(difficultylb);
		JComboBox<Integer> difficultyqt = new JComboBox<>(diceqt);
		poolOptions.add(difficultyqt);

		JLabel proficiencylb = new JLabel("proficiency:");
		poolOptions.add(proficiencylb);
		JComboBox<Integer> proficiencyqt = new JComboBox<>(diceqt);
		poolOptions.add(proficiencyqt);

		JLabel challengelb = new JLabel("challenge:");
		poolOptions.add(challengelb);
		JComboBox<Integer> challengeqt = new JComboBox<>(diceqt);
		poolOptions.add(challengeqt);

		JLabel forcelb = new JLabel("force:");
		poolOptions.add(forcelb);
		JComboBox<Integer> forceqt = new JComboBox<>(diceqt);
		poolOptions.add(forceqt);

		JButton roll = new JButton("ROLL");
		roll.addActionListener(new RollAction(screen, showResults, actionRes, actionAdv, actionTri, actionDes, actionLig, actionDar, boostqt, setbackqt, abilityqt, difficultyqt, proficiencyqt, challengeqt, forceqt));
		poolOptions.add(roll);

		screen.add(poolOptions,BorderLayout.PAGE_START);
	}
}