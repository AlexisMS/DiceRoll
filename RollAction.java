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
	JComboBox<Integer> d10qt;
	JPanel showResults;
	JLabel actionRes;
	JLabel actionAdv;
	JLabel actionTri;
	JLabel actionDes;
	JLabel actionLig;
	JLabel actionDar;
	JLabel actiond10;
	ImageIcon successimg;
	ImageIcon failureimg;
	ImageIcon advantageimg;
	ImageIcon threatimg;
	ImageIcon triumphimg;
	ImageIcon despairimg;
	ImageIcon lightimg;
	ImageIcon darkimg;


	RollAction(JPanel screen, JPanel showResults,
				JLabel actionRes, JLabel actionAdv, JLabel actionTri, JLabel actionDes, JLabel actionLig, JLabel actionDar, JLabel actiond10,
				JComboBox<Integer> boostqt, JComboBox<Integer> setbackqt, JComboBox<Integer> abilityqt,
				JComboBox<Integer> difficultyqt, JComboBox<Integer> proficiencyqt, JComboBox<Integer> challengeqt, JComboBox<Integer> forceqt, JComboBox<Integer> d10qt){
		this.screen = screen;
		this.showResults = showResults;
		this.actionRes = actionRes;
		this.actionAdv = actionAdv;
		this.actionTri = actionTri;
		this.actionDes = actionDes;
		this.actionLig = actionLig;
		this.actionDar = actionDar;
		this.actiond10 = actiond10;
		this.boostqt = boostqt;
		this.setbackqt = setbackqt;
		this.abilityqt = abilityqt;
		this.difficultyqt = difficultyqt;
		this.proficiencyqt = proficiencyqt;
		this.challengeqt = challengeqt;
		this.forceqt = forceqt;
		this.d10qt = d10qt;
	}

	public void actionPerformed(ActionEvent e){
		actionRes.setText(" ");
		actionRes.setIcon(null);
		actionAdv.setText(" ");
		actionAdv.setIcon(null);
		actionTri.setText(" ");
		actionTri.setIcon(null);
		actionDes.setText(" ");
		actionDes.setIcon(null);
		actionLig.setText(" ");
		actionLig.setIcon(null);
		actionDar.setText(" ");
		actionDar.setIcon(null);
		actiond10.setText(" ");
		successimg = new ImageIcon("img/success.png");
		failureimg = new ImageIcon("img/failure.png");
		advantageimg = new ImageIcon("img/advantage.png");
		threatimg = new ImageIcon("img/threat.png");
		triumphimg = new ImageIcon("img/triumph.png");
		despairimg = new ImageIcon("img/despair.png");
		lightimg = new ImageIcon("img/light.png");
		darkimg = new ImageIcon("img/dark.png");

		Integer boost = (Integer)boostqt.getSelectedItem();
		Integer setback = (Integer)setbackqt.getSelectedItem();
		Integer ability = (Integer)abilityqt.getSelectedItem();
		Integer difficulty = (Integer)difficultyqt.getSelectedItem();
		Integer proficiency = (Integer)proficiencyqt.getSelectedItem();
		Integer challenge = (Integer)challengeqt.getSelectedItem();
		Integer force = (Integer)forceqt.getSelectedItem();
		Integer d10 = (Integer)d10qt.getSelectedItem();

		EdgeDiceRoll pool = new EdgeDiceRoll();
		int[] results = new int[7]; 
		results = pool.roll(boost,setback,ability,difficulty,proficiency,challenge,force,d10);

		if(boost>0 || setback>0 || ability>0 || difficulty>0 || proficiency>0 || challenge>0){
			if(results[0]>0){	
				actionRes.setIcon(successimg);		
				actionRes.setText("SUCCESS [" + String.valueOf(results[0]) + "]");				
			} else{
				actionRes.setIcon(failureimg);
				actionRes.setText("FAILURE [" + String.valueOf(Math.abs(results[0])) + "]");				
			}
		}

		if(results[1]>0){
			actionAdv.setIcon(advantageimg);
			actionAdv.setText("Advantage [" + String.valueOf(results[1]) + "]");			
		} else if (results[1]<0) {
			actionAdv.setIcon(threatimg);
			actionAdv.setText("Threat [" + String.valueOf(Math.abs(results[1])) + "]");			
		}

		if(results[2]>0){
			actionTri.setIcon(triumphimg);
			actionTri.setText("TRIUMPH [" + String.valueOf(results[2]) + "]");			
		}

		if(results[3]>0){
			actionDes.setIcon(despairimg);
			actionDes.setText("DESPAIR [" + String.valueOf(results[3]) + "]");			
		}

		if(results[4]>0){
			actionLig.setIcon(lightimg);
			actionLig.setText("Light-Side Force [" + String.valueOf(results[4]) + "]");			
		}

		if(results[5]>0){
			actionDar.setIcon(darkimg);
			actionDar.setText("Dark-Side Force [" + String.valueOf(results[5]) + "]");			
		}

		if(d10==1){
			actiond10.setText("d10 [" + String.valueOf(results[6]) + "]");
		} else if (d10==2) {
			actiond10.setText("Percentage [" + String.valueOf(results[6]) + "%]");
		}

		screen.add(showResults,BorderLayout.CENTER);
		screen.repaint();
	}
}