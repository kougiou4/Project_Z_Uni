package package01;

import javax.swing.*;


import package01.Game.ChoiceHandler;
import java.awt.*;
import java.awt.event.*;

class GUI
{

Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);
Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);
JFrame window,window2;
JPanel Panel1, choiceButtonPanel,playerPanel;
JLabel hpNumberLabel,weaponLabelName,hpLabel,weaponLabel;
JButton choice1,choice2,choice3,choice4;
JTextArea Panel1Area;


public GUI(){
	GUI gui;
}

public void createGUI(ChoiceHandler cHandler)
{
window2 = new JFrame();
window2.setTitle("Project Z");
window2.setSize(900,600);
window2.setLocationRelativeTo(null);
window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window2.setVisible(true);

window2.setLayout(null);

window = new JFrame();
window.setTitle("Project Z");
window.setSize(900,600);
window.setLocationRelativeTo(null);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setVisible(false);

window2.setLayout(null);



JLabel l1 = new JLabel("               Project Z");
JLabel l2 = new JLabel("Americans are bombing the island of Kyushu despite surrender negotiations. ");
JLabel l3 = new JLabel(" Sights of cannibalism in rural Kyushu...");
JButton b1 = new JButton("START");
JLabel background=new JLabel(new ImageIcon("japan.jpg"));
window2.add(background);
background.setBounds(0,0,900,600);
l1.setBounds(250, -200, 900, 600);
l1.setFont(titleFont);
l1.setForeground(Color.black);
l2.setBounds(50, -70, 900, 600);
l2.setFont(normalFont);
l2.setForeground(Color.black);
l3.setBounds(45, -40, 900, 600);
l3.setFont(normalFont);
l3.setForeground(Color.black);
b1.setBounds(350, 430, 200, 50);
b1.setFont(titleFont);
b1.setForeground(Color.black);
b1.setOpaque(false);
b1.setContentAreaFilled(false);
b1.setBorderPainted(false);
b1.addActionListener(cHandler);
b1.setActionCommand("start");
background.add(l1);
background.add(l2);
background.add(l3);
background.add(b1);

Panel1 = new JPanel();
Panel1.setBounds(100, 100, 600, 250);
Panel1.setBackground(Color.black);
window.add(Panel1);

Panel1Area = new JTextArea("This is the main textarea");
Panel1Area.setBounds(100, 100, 600, 150);
Panel1Area.setBackground(Color.black);
Panel1Area.setForeground(Color.white);
Panel1Area.setFont(normalFont);
Panel1Area.setLineWrap(true);
Panel1Area.setWrapStyleWord(true);
Panel1Area.setEditable(false);
Panel1.add(Panel1Area);

choiceButtonPanel = new JPanel();
choiceButtonPanel.setBounds(50, 350, 800, 150);
choiceButtonPanel.setBackground(Color.black);
choiceButtonPanel.setLayout(new GridLayout(4,1));
window.add(choiceButtonPanel);

choice1 = new JButton("Choice 1");
choice1.setBackground(Color.black);
choice1.setForeground(Color.white);
choice1.setFont(normalFont);
choice1.setFocusPainted(false);
choice1.addActionListener(cHandler);
choice1.setActionCommand("c1");
choiceButtonPanel.add(choice1);
choice2 = new JButton("Choice 2");
choice2.setBackground(Color.black);
choice2.setForeground(Color.white);
choice2.setFont(normalFont);
choice2.setFocusPainted(false);
choice2.addActionListener(cHandler);
choice2.setActionCommand("c2");
choiceButtonPanel.add(choice2);
choice3 = new JButton("Choice 3");
choice3.setBackground(Color.black);
choice3.setForeground(Color.white);
choice3.setFont(normalFont);
choice3.setFocusPainted(false);
choice3.addActionListener(cHandler);
choice3.setActionCommand("c3");
choiceButtonPanel.add(choice3);
choice4 = new JButton("Choice 4");
choice4.setBackground(Color.black);
choice4.setForeground(Color.white);
choice4.setFont(normalFont);
choice4.setFocusPainted(false);
choice4.addActionListener(cHandler);
choice4.setActionCommand("c4");
choiceButtonPanel.add(choice4);

playerPanel = new JPanel();
playerPanel.setBounds(50, 50, 600, 250);
playerPanel.setBackground(Color.black);
//playerPanel.setLayout(new GridLayout(1,4));
window.add(playerPanel);

hpLabel = new JLabel("Insanity:");
hpLabel.setFont(normalFont);
hpLabel.setForeground(Color.white);
playerPanel.add(hpLabel);
hpNumberLabel = new JLabel();
hpNumberLabel.setFont(normalFont);
hpNumberLabel.setForeground(Color.white);
playerPanel.add(hpNumberLabel);
weaponLabel = new JLabel("Weapon:");
weaponLabel.setFont(normalFont);
weaponLabel.setForeground(Color.white);
playerPanel.add(weaponLabel);
weaponLabelName = new JLabel();
weaponLabelName.setFont(normalFont);
weaponLabelName.setForeground(Color.white);
playerPanel.add(weaponLabelName);



}

}
