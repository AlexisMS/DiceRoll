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
	    f.setSize(500,300); //lar x alt
	    f.setTitle("Star Wars RPG Dice Roller");
	    ImageIcon img = new ImageIcon("img/ds.png");
	    f.setIconImage(img.getImage());
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
		poolOptions.setLayout(new BorderLayout(5,5));
		JPanel poolOptions1 = new JPanel();
		poolOptions.add(poolOptions1,BorderLayout.PAGE_START);
		JPanel poolOptions2 = new JPanel();
		poolOptions.add(poolOptions2,BorderLayout.CENTER);
		JPanel poolOptions3 = new JPanel();
		poolOptions3.setLayout(new BorderLayout(5,5));
		poolOptions.add(poolOptions3,BorderLayout.PAGE_END);
		JPanel poolOptions31 = new JPanel();
		poolOptions3.add(poolOptions31,BorderLayout.PAGE_START);
		JPanel poolOptions32 = new JPanel();
		poolOptions3.add(poolOptions32,BorderLayout.CENTER);
		

		Integer[] diceopt = new Integer[] {0,1,2,3,4,5,6,7,8,9};
		Integer[] d10opt = new Integer[] {0,1,2};

		ImageIcon boostimg = new ImageIcon("img/boost.png");
		JLabel boostlb = new JLabel("Boost:");
		boostlb.setIcon(boostimg);
		poolOptions1.add(boostlb);
		JComboBox<Integer> boostqt = new JComboBox<>(diceopt);
		poolOptions1.add(boostqt);

		ImageIcon setbackimg = new ImageIcon("img/setback.png");
		JLabel setbacklb = new JLabel("Setback:");
		setbacklb.setIcon(setbackimg);
		poolOptions2.add(setbacklb);
		JComboBox<Integer> setbackqt = new JComboBox<>(diceopt);
		poolOptions2.add(setbackqt);

		ImageIcon abilityimg = new ImageIcon("img/ability.png");
		JLabel abilitylb = new JLabel("Ability:");
		abilitylb.setIcon(abilityimg);
		poolOptions1.add(abilitylb);
		JComboBox<Integer> abilityqt = new JComboBox<>(diceopt);
		poolOptions1.add(abilityqt);

		ImageIcon difficultyimg = new ImageIcon("img/difficulty.png");
		JLabel difficultylb = new JLabel("Difficulty:");
		difficultylb.setIcon(difficultyimg);
		poolOptions2.add(difficultylb);
		JComboBox<Integer> difficultyqt = new JComboBox<>(diceopt);
		poolOptions2.add(difficultyqt);

		ImageIcon proficiencyimg = new ImageIcon("img/proficiency.png");
		JLabel proficiencylb = new JLabel("Proficiency:");
		proficiencylb.setIcon(proficiencyimg);
		poolOptions1.add(proficiencylb);
		JComboBox<Integer> proficiencyqt = new JComboBox<>(diceopt);
		poolOptions1.add(proficiencyqt);

		ImageIcon challengeimg = new ImageIcon("img/challenge.png");
		JLabel challengelb = new JLabel("Challenge:");
		challengelb.setIcon(challengeimg);
		poolOptions2.add(challengelb);
		JComboBox<Integer> challengeqt = new JComboBox<>(diceopt);
		poolOptions2.add(challengeqt);

		ImageIcon forceimg = new ImageIcon("img/force.png");
		JLabel forcelb = new JLabel("Force:");
		forcelb.setIcon(forceimg);
		poolOptions1.add(forcelb);
		JComboBox<Integer> forceqt = new JComboBox<>(diceopt);
		poolOptions1.add(forceqt);

		JLabel d10lb = new JLabel("d10:");
		poolOptions2.add(d10lb);
		JComboBox<Integer> d10qt = new JComboBox<>(d10opt);
		poolOptions2.add(d10qt);

		JButton reset = new JButton("Reset");
		reset.setActionCommand("RESET");
		reset.addActionListener(new ChangeSelection(screen, boostqt, setbackqt, abilityqt,
													difficultyqt, proficiencyqt,
													challengeqt, forceqt, d10qt));
		poolOptions31.add(reset);

		JButton upability = new JButton("Up.Ability");
		upability.setActionCommand("UP_ABILITY");
		upability.addActionListener(new ChangeSelection(screen, boostqt, setbackqt, abilityqt,
													difficultyqt, proficiencyqt,
													challengeqt, forceqt, d10qt));
		poolOptions32.add(upability);

		JButton downproficiency = new JButton("Down.Profic.");
		downproficiency.setActionCommand("DOWN_PROFICIENCY");
		downproficiency.addActionListener(new ChangeSelection(screen, boostqt, setbackqt, abilityqt,
													difficultyqt, proficiencyqt,
													challengeqt, forceqt, d10qt));
		poolOptions32.add(downproficiency);

		JButton updifficulty = new JButton("Up.Difficulty");
		updifficulty.setActionCommand("UP_DIFFICULTY");
		updifficulty.addActionListener(new ChangeSelection(screen, boostqt, setbackqt, abilityqt,
													difficultyqt, proficiencyqt,
													challengeqt, forceqt, d10qt));
		poolOptions32.add(updifficulty);

		JButton downchallenge = new JButton("Down.Challe.");
		downchallenge.setActionCommand("DOWN_CHALLENGE");
		downchallenge.addActionListener(new ChangeSelection(screen, boostqt, setbackqt, abilityqt,
													difficultyqt, proficiencyqt,
													challengeqt, forceqt, d10qt));
		poolOptions32.add(downchallenge);


		JButton roll = new JButton("ROLL");
		roll.addActionListener(new RollAction(screen, showResults, actionRes, actionAdv, actionTri, actionDes, actionLig, actionDar, actiond10,
											 boostqt, setbackqt, abilityqt, difficultyqt, proficiencyqt, challengeqt, forceqt, d10qt));
		poolOptions31.add(roll);

		screen.add(poolOptions,BorderLayout.PAGE_START);
	}
}