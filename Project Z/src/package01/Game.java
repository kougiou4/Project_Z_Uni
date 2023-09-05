package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;



public class Game {


	GUI gui = new GUI();
	VisibilityManager vm = new VisibilityManager(gui);
	Story story = new Story(this, gui, vm);
	ChoiceHandler cHandler = new ChoiceHandler();
	
	String nextPosition1,nextPosition2,nextPosition3,nextPosition4;
	
	public static void main(String[] args) {			
			new Game();
		}
	
	public Game() {
		gui.createGUI(cHandler);
		story.defaultSetup();
		vm.showTitleScreen();
	}
	
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String yourChoice = e.getActionCommand();
			
			switch(yourChoice) {
			case "start": vm.titleToTown(); story.boat(); break;
			case "c1": story.selectPosition(nextPosition1); break;
			case "c2": story.selectPosition(nextPosition2); break;
			case "c3": story.selectPosition(nextPosition3); break;
			case "c4": story.selectPosition(nextPosition4); break;
			}
	}
}
}
