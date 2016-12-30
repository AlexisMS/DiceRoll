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
	    f.setSize(1000,200); //lar x alt
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
		JLabel actiond10 = new JLabel();
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
		showResults.add(actiond10);
		actiond10.setAlignmentX(screen.CENTER_ALIGNMENT);

		JPanel poolOptions = new JPanel();
		Integer[] diceopt = new Integer[] {0,1,2,3,4,5,6,7,8,9};
		Integer[] d10opt = new Integer[] {0,1,2};

		ImageIcon boostimg = new ImageIcon("img/boost.png");
		JLabel boostlb = new JLabel("Boost:");
		boostlb.setIcon(boostimg);
		poolOptions.add(boostlb);
		JComboBox<Integer> boostqt = new JComboBox<>(diceopt);
		poolOptions.add(boostqt);

		ImageIcon setbackimg = new ImageIcon("img/setback.png");
		JLabel setbacklb = new JLabel("Setback:");
		setbacklb.setIcon(setbackimg);
		poolOptions.add(setbacklb);
		JComboBox<Integer> setbackqt = new JComboBox<>(diceopt);
		poolOptions.add(setbackqt);

		ImageIcon abilityimg = new ImageIcon("img/ability.png");
		JLabel abilitylb = new JLabel("Ability:");
		abilitylb.setIcon(abilityimg);
		poolOptions.add(abilitylb);
		JComboBox<Integer> abilityqt = new JComboBox<>(diceopt);
		poolOptions.add(abilityqt);

		ImageIcon difficultyimg = new ImageIcon("img/difficulty.png");
		JLabel difficultylb = new JLabel("Difficulty:");
		difficultylb.setIcon(difficultyimg);
		poolOptions.add(difficultylb);
		JComboBox<Integer> difficultyqt = new JComboBox<>(diceopt);
		poolOptions.add(difficultyqt);

		ImageIcon proficiencyimg = new ImageIcon("img/proficiency.png");
		JLabel proficiencylb = new JLabel("Proficiency:");
		proficiencylb.setIcon(proficiencyimg);
		poolOptions.add(proficiencylb);
		JComboBox<Integer> proficiencyqt = new JComboBox<>(diceopt);
		poolOptions.add(proficiencyqt);

		ImageIcon challengeimg = new ImageIcon("img/challenge.png");
		JLabel challengelb = new JLabel("Challenge:");
		challengelb.setIcon(challengeimg);
		poolOptions.add(challengelb);
		JComboBox<Integer> challengeqt = new JComboBox<>(diceopt);
		poolOptions.add(challengeqt);

		ImageIcon forceimg = new ImageIcon("img/force.png");
		JLabel forcelb = new JLabel("Force:");
		forcelb.setIcon(forceimg);
		poolOptions.add(forcelb);
		JComboBox<Integer> forceqt = new JComboBox<>(diceopt);
		poolOptions.add(forceqt);

		JLabel d10lb = new JLabel("d10:");
		poolOptions.add(d10lb);
		JComboBox<Integer> d10qt = new JComboBox<>(d10opt);
		poolOptions.add(d10qt);



		JButton roll = new JButton("ROLL");
		roll.addActionListener(new RollAction(screen, showResults, actionRes, actionAdv, actionTri, actionDes, actionLig, actionDar, actiond10, boostqt, setbackqt, abilityqt, difficultyqt, proficiencyqt, challengeqt, forceqt, d10qt));
		poolOptions.add(roll);

		screen.add(poolOptions,BorderLayout.PAGE_START);
	}
}