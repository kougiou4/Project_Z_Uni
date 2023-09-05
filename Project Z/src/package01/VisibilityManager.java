package package01;

public class VisibilityManager {

    GUI gui;

    public VisibilityManager(GUI userInterface) {

        gui = userInterface;
    }

    public void showTitleScreen() {

        gui.Panel1.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);
        gui.window2.setVisible(true);
        
    }

    public void titleToTown() {

        gui.Panel1.setVisible(true);
        gui.choiceButtonPanel.setVisible(true);
        gui.playerPanel.setVisible(true);
        gui.window.setVisible(true);
        gui.window2.setVisible(false);

    }
}