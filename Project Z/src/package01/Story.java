package package01;

import package02.Weapon_Katana;
import package02.Weapon_Knife;
import package03.Monster_Goblin;
import package03.SuperMonster;


public class Story {
	
	Game game;
	GUI gui;
	VisibilityManager vm;
	Player player = new Player();
	SuperMonster monster;
	int prot15,prot18,prot19,prot20;
	
	int sauronRing;
	
	public Story(Game g,GUI userInterface, VisibilityManager vManager) {
		
		game = g;
		gui = userInterface;
		vm = vManager;
	}

	public void defaultSetup() {
		
		player.insanity = 0;
		gui.hpNumberLabel.setText("" + player.insanity+ "          ");
		
		player.currentWeapon = new Weapon_Knife();
		gui.weaponLabelName.setText(player.currentWeapon.name);
		
		sauronRing = 0;
	}
	
	public void selectPosition(String nextPosition) {
		
		switch(nextPosition) {
		case "boat": boat(); break;
		case "boat1": boat1(); break;
		case "sirens": sirens(); break;
		case "boat2": boat2(); break;
		case "boat2_a": boat2_a(); break;
		case "boat3": boat3(); break;
		case "boat4": boat4(); break;
		case "boat4a": boat4a(); break;
		case "getH": getH(); break;
		case "boat2a": boat2a(); break;
		case "silent": silent(); break;
		case "chapter2": chapter2(); break;
		case "chapter2start": chapter2start(); break;
		case "chapter2astart": chapter2astart(); break;
		case "chapter2bstart": chapter2bstart(); break;
		case "sixa": sixa(); break;
		case "sixb": sixb(); break;
		case "else6": else6(); break;
		case "seven": seven(); break;
		case "fight7d": fight7d(); break;
		case "fight8": fight8(); break;
		case "fight8a": fight8a(); break;
		case "leave1": leave1(); break;
		case "afterleave1": afterleave1(); break;
		case "fightsoldiers": fightsoldiers(); break;
		case "end1a": end1a(); break;
		case "end1b": end1b(); break;
		case "survive1a": survive1a(); break;
		case "survive1b": survive1b(); break;
		case "continue1a": continue1a(); break;
		case "continue1a1": continue1a1(); break;
		case "continue1ba": continue1ba(); break;
		case "continue1bb": continue1bb(); break;
		case "continue1b": continue1b(); break;
		case "continue1ca": continue1ca(); break;
		case "continue1cb": continue1cb(); break;
		case "continue1c": continue1c(); break;
		case "continue1d": continue1d(); break;
		case "continue1d1": continue1d1(); break;
		case "continue1e": continue1e(); break;
		case "continue1ea": continue1ea(); break;
		case "continue1eb": continue1eb(); break;
		case "continue1f": continue1f(); break;
		case "continue1g1": continue1g1(); break;
		case "continue1g2": continue1g2(); break;
		case "continue1g3": continue1g3(); break;
		case "continue1g4": continue1g4(); break;
		case "continue1ga": continue1ga(); break;
		case "continue1gb": continue1gb(); break;
		case "continue1gb1": continue1gb1(); break;
		case "survive1ba": survive1ba(); break;
		case "survive1baa": survive1baa(); break;
		case "survive1bb": survive1bb(); break;
		case "survive1b_a": survive1b_a(); break;
		case "survive1b_b": survive1b_b(); break;
		case "survive1b_c": survive1b_c(); break;
		case "survive1b_d": survive1b_d(); break;
		case "survive1b_continue": survive1b_continue(); break;
		case "survive1b_continue2": survive1b_continue2(); break;
		case "survive1b_continue3": survive1b_continue3(); break;
		case "survive1b_continue4": survive1b_continue4(); break;
		case "end1c": end1c(); break;
		case "end1d": end1d(); break;
		case "end1e": end1e(); break;
		case "leavekatana": leavekatana(); break;
		case "fightforkatana1": fightforkatana1(); break;
		case "fightforkatana2": fightforkatana2(); break;
		case "survive1b_continue5": survive1b_continue5(); break;
		case "approachvillager": approachvillager(); break;
		case "attackguard": attackguard(); break;
		case "sneakvillage": sneakvillage(); break;
		case "sneakvillagenight": sneakvillagenight(); break;
		case "battle_villageguard": battle_villageguard(); break;
		case "survive1b_continue6": survive1b_continue6(); break;
		case "survive1b_continue7": survive1b_continue7(); break;
		case "survive1b_continue7a": survive1b_continue7a(); break;
		case "survive1b_continue7b": survive1b_continue7b(); break;
		case "survive1b_continue8a": survive1b_continue8a(); break;
		case "survive1b_continue8b": survive1b_continue8b(); break;
		case "survive1b_continue8bb": survive1b_continue8bb(); break;
		case "survive1b_continue9a": survive1b_continue9a(); break;
		case "survive1b_continue9b": survive1b_continue9b(); break;
		case "survive1b_continue9c": survive1b_continue9c(); break;
		case "survive1b_continue10a": survive1b_continue10a(); break;
		case "survive1b_continue10b": survive1b_continue10b(); break;
		case "survive1b_continue10c": survive1b_continue10c(); break;
		case "survive1b_continue10d": survive1b_continue10d(); break;
		case "chapter2ending_a": chapter2ending_a(); break;
		case "chapter2ending_b": chapter2ending_b(); break;
		case "chapter2ending_c": chapter2ending_c(); break;
		case "chapter2ending_d": chapter2ending_d(); break;
		case "Chapter3": Chapter3(); break;
		case "window": window(); break;
		case "door": door(); break;
		case "alt2_19a": alt2_19a(); break;
		case "alt2_20a": alt2_20a(); break;
		case "alt2_20a_con": alt2_20a_con(); break;
		case "alt2_20a_end1": alt2_20a_end1(); break;
		case "alt2_20a_end1_a": alt2_20a_end1_a(); break;
		case "alt2_win": alt2_win(); break;
		case "alt2_lose": alt2_lose(); break;
		case "alt2_20a_end1_b": alt2_20a_end1_b(); break;
		case "alt2_win1": alt2_win1(); break;
		case "alt2_lose1": alt2_lose1(); break;
		case "alt2_20a_end2": alt2_20a_end2(); break;
		case "alt2_20b_end1": alt2_20b_end1(); break;
		case "alt2_20b_end1_con": alt2_20b_end1_con(); break;
		case "alt2_20b_end1_cona": alt2_20b_end1_cona(); break;
		case "win_Taiyo": win_Taiyo(); break;
		case "lose_Taiyo": lose_Taiyo(); break;
		case "force_win": force_win(); break;
		case "alt2_19d": alt2_19d(); break;
		case "endz": endz(); break;
		
		
		case "chapter3a": chapter3a(); break;
		case "chapter3a_begin": chapter3a_begin(); break;
		case "chapter3Aa": chapter3Aa(); break;
		case "chapter3Ab": chapter3Ab(); break;
		case "chapter3Aa_continue1": chapter3Aa_continue1(); break;
		case "chapter3Aa_continue1_a": chapter3Aa_continue1_a(); break;
		case "chapter3Aa_continue1_b": chapter3Aa_continue1_b(); break;
		case "chapter3Aa_19a": chapter3Aa_19a(); break;
		case "chapter3Aa_19b": chapter3Aa_19b(); break;
		case "chapter3Aa_19c": chapter3Aa_19c(); break;
		case "chapter3Aa_19d": chapter3Aa_19d(); break;
		case "chapter3Aa_19a_continue": chapter3Aa_19a_continue(); break;
		case "chapter3Aa_19a_end": chapter3Aa_19a_end(); break;
		case "chapter3Aa_19b_continue": chapter3Aa_19b_continue(); break;
		case "chapter3Aa_19b_end": chapter3Aa_19b_end(); break;
		case "chapter3Aa_19c_continue1": chapter3Aa_19c_continue1(); break;
		case "chapter3Aa_19c_continue2": chapter3Aa_19c_continue2(); break;
		case "chapter3Aa_19c_continue3": chapter3Aa_19c_continue3(); break;
		case "chapter3Aa_19c_continue2_end1": chapter3Aa_19c_continue2_end1(); break;
		case "chapter3Aa_19c_continue2_end2": chapter3Aa_19c_continue2_end2(); break;
		case "withcaution": withcaution(); break;
		case "losefight": losefight(); break;
		case "winfight": winfight(); break;
		case "chapter3Aa_continue2": chapter3Aa_continue2(); break;
		case "chapter3Aa_continue2a": chapter3Aa_continue2a(); break;
		case "chapter3Aa_continue2b": chapter3Aa_continue2b(); break;
		case "chapter3Aa_continue2b_end": chapter3Aa_continue2b_end(); break;
		case "chapter3Aa_continue2c": chapter3Aa_continue2c(); break;
		case "chapter3Aa_continue2c_end": chapter3Aa_continue2c_end(); break;
		case "chapter3Aa_continue2d": chapter3Aa_continue2d(); break;
		case "chapter3Aa_continue2d_end": chapter3Aa_continue2d_end(); break;
		case "chapter3Aa_continue2d_endd": chapter3Aa_continue2d_endd(); break;
		case "chapter3Aa_continue2d_enddd": chapter3Aa_continue2d_enddd(); break;
		case "Ena": Ena(); break;
		case "Ena_a": Ena_a(); break;
		case "Ena_b": Ena_b(); break;
		case "Ena_c": Ena_c(); break;
		case "Ena_d": Ena_d(); break;
		case "Ryoichi": Ryoichi(); break;
		case "Ena_b1": Ena_b1(); break;
		case "chapter3Aa_continue3": chapter3Aa_continue3(); break;
		case "keep": keep(); break;
		case "half": half(); break;
		case "third": third(); break;
		case "quarter": quarter(); break;
		case "keepend": keepend(); break;
		case "thirdend": thirdend(); break;
		case "chapter3Aa_continue3end": chapter3Aa_continue3end(); break;
		case "counterattack": counterattack(); break;
		case "counterattackfail": counterattackfail(); break;

		
		
		case "toTitle": toTitle(); break;
		}
	}
	
	public void boat() {
		
		gui.Panel1Area.setText("Char1: I still cant believe that we lost the war our officers talked about constant successes.");
		gui.choice1.setText("I cant believe how may people died but thankfuly it's over.");
		gui.choice2.setText("I cant believe how you fell for those lies.");
		gui.choice3.setText("I have to agree with you mate.");
		gui.choice4.setText("...<say nothing>");
		
		game.nextPosition1 = "boat1";
		game.nextPosition2 = "boat1";
		game.nextPosition3 = "boat1";	
		game.nextPosition4 = "boat1";	
	}
	
	public void boat1() {
		
			gui.Panel1Area.setText("Whatever i'm just happy that we are going back home after 3 years of service.");
			gui.choice1.setText("We lost so many friends i dont think it's going to be the same");
			gui.choice2.setText("I cant wait to see my family");
			gui.choice3.setText("I'm happy because we can finally drink good quality sake *laughs*");
			gui.choice4.setText("...<say nothing>");
			
			game.nextPosition1 = "sirens";
			game.nextPosition2 = "sirens";
			game.nextPosition3 = "boat2a";	
			game.nextPosition4 = "silent";	
		}

	
	public void sirens() {
		gui.Panel1Area.setText("*sirens sounding*\n" + 
				"Char1:What the hell is going on?\n" + 			 
				"OfficerName:BELOW DECK NOW,ENEMY AIRCRAFT ON SIGHT!!\n" + 				
				"*Bombs falling and destroying the ship*\n" + 
				"*Ship is starting to sink*\n" + 
				"OfficerName:THIS SHIP WONT STAY AFLOAT FOR LONG!");
	
		gui.choice1.setText("YOU DEFINITELY ARE A CLEVER ONE!");
		gui.choice2.setText("YOU ARE RIGHT, WHAT ARE WE GOING TO DO OFFICER?");
		gui.choice3.setText("WE WONT MAKE IT SIR!");
		gui.choice4.setText("...<say nothing>");
		
		game.nextPosition1 = "getH";
		game.nextPosition2 = "boat2";
		game.nextPosition3 = "getH";	
		game.nextPosition4 = "boat2a";	
	}

	public void boat2() {
		
		player.insanity += 1;
		gui.hpNumberLabel.setText(player.insanity+"          ");
		
		gui.Panel1Area.setText("OfficerName:There is a lifeboat if we are quick enough maybe we can get it.");
		gui.choice1.setText("LETS GO QUICKLY!");
		gui.choice2.setText("WHAT ABOUT THE OTHERS?");
		gui.choice3.setText("NO ITS FOR THE ADMIRAL!");
		gui.choice4.setText("...<say nothing>");
		
		game.nextPosition1 = "boat3";
		game.nextPosition2 = "boat4a";
		game.nextPosition3 = "boat4";	
		game.nextPosition4 = "boat4";
	}
	
	public void boat2_a() {
		gui.Panel1Area.setText("OfficerName:There is a lifeboat if we are quick enough maybe we can get it.");
		gui.choice1.setText("LETS GO QUICKLY!");
		gui.choice2.setText("WHAT ABOUT THE OTHERS?");
		gui.choice3.setText("NO ITS FOR THE ADMIRAL!");
		gui.choice4.setText("...<say nothing>");
		
		game.nextPosition1 = "boat3";
		game.nextPosition2 = "boat4a";
		game.nextPosition3 = "boat4";	
		game.nextPosition4 = "boat4";
	}
	
	public void boat3() {
		
		player.insanity += 1;
        gui.hpNumberLabel.setText(player.insanity+"          ");
		
		gui.Panel1Area.setText("OfficerName:YES TIME IS AGAINST US!\n"+ 
		"*Both running toward the lifeboat*\n" 
		+"OfficerName:QUICK ON THE BOAT!!! \n" + 
		"*bomb falls nearby and both fall off the ship*\n" + 
		"*enemy aircraft retreat as black clouds come closer\n" + 
		"*you slowly fall unconsious *");
		
		gui.choice1.setText("Continue to chapter2");
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
	
	public void boat4() {
		
		player.insanity += 1;
        gui.hpNumberLabel.setText(player.insanity+"          ");
		
		gui.Panel1Area.setText("OfficerName:STAY HERE AND DIE THEN!\n"+ 
				"*Both running toward the lifeboat*\n" 
				+"OfficerName:QUICK ON THE BOAT!!! \n" + 
				"*bomb falls nearby and both fall off the ship*\n" + 
				"*enemy aircraft retreat as black clouds come closer\n" + 
				"*you slowly fall unconsious *");
				
				gui.choice1.setText("Continue to chapter2");
				gui.choice2.setText("");
				gui.choice3.setText("");
				gui.choice4.setText("");
				
				game.nextPosition1 = "chapter2";
				game.nextPosition2 = "";
				game.nextPosition3 = "";	
				game.nextPosition4 = "";
	}
	
	public void boat4a() {
		
		player.insanity += 4;
        gui.hpNumberLabel.setText(player.insanity+"          ");
		
		gui.Panel1Area.setText("OfficerName:STAY HERE AND DIE THEN!\n"+ 
				"*Both running toward the lifeboat*\n" 
				+"OfficerName:QUICK ON THE BOAT!!! \n" + 
				"*bomb falls nearby and both fall off the ship*\n" + 
				"*enemy aircraft retreat as black clouds come closer\n" + 
				"*you slowly fall unconsious *");
				
				gui.choice1.setText("Continue to chapter2");
				gui.choice2.setText("");
				gui.choice3.setText("");
				gui.choice4.setText("");
				
				game.nextPosition1 = "chapter2";
				game.nextPosition2 = "";
				game.nextPosition3 = "";	
				game.nextPosition4 = "";
	}
	
	public void getH() {
		
		player.insanity += 1;
		gui.hpNumberLabel.setText(player.insanity+"          ");
		
		gui.Panel1Area.setText("OfficerName:Get a hold of yourself man!\n" +"OfficerName:There is a lifeboat if we are quick enough maybe we can get it.");
		gui.choice1.setText("LETS GO QUICKLY!");
		gui.choice2.setText("WHAT ABOUT THE OTHERS?");
		gui.choice3.setText("NO ITS FOR THE ADMIRAL!");
		gui.choice4.setText("...<say nothing>");
		
		game.nextPosition1 = "boat3";
		game.nextPosition2 = "boat4";
		game.nextPosition3 = "boat4";	
		game.nextPosition4 = "boat4";
	}
	
	public void boat2a() {
		gui.Panel1Area.setText("Char1:You are goddamn right *laughs*\n" 
				+"*sirens sounding*\n" + 
				"Char1:What the hell is going on?\n" + 			 
				"OfficerName:BELOW DECK NOW,ENEMY AIRCRAFT ON SIGHT!!\n" + 				
				"*Bombs falling and destroying the ship*\n" + 
				"*Ship is starting to sink*\n" + 
				"OfficerName:THIS SHIP WONT STAY AFLOAT!");
	
		gui.choice1.setText("YOU DEFINITELY ARE A CLEVER ONE!");
		gui.choice2.setText("YOU ARE RIGHT, WHAT ARE WE GOING TO DO OFFICER?");
		gui.choice3.setText("WE WONT MAKE IT SIR!");
		gui.choice4.setText("...<say nothing>");
		
		game.nextPosition1 = "getH";
		game.nextPosition2 = "boat2";
		game.nextPosition3 = "getH";	
		game.nextPosition4 = "boat2";	
	}
	
	public void silent() {
		
		gui.Panel1Area.setText("Char1:Quite talkative today arent we Protagonist?\n" 
				+"*sirens sounding*\n" + 
				"Char1:What the hell is going on?\n" + 			 
				"OfficerName:BELOW DECK NOW,ENEMY AIRCRAFT ON SIGHT!!\n" + 				
				"*Bombs falling and destroying the ship*\n" + 
				"*Ship is starting to sink*\n" + 
				"OfficerName:THIS SHIP WONT STAY AFLOAT!");
	
		gui.choice1.setText("YOU DEFINITELY ARE A CLEVER ONE!");
		gui.choice2.setText("YOU ARE RIGHT, WHAT ARE WE GOING TO DO OFFICER?");
		gui.choice3.setText("WE WONT MAKE IT SIR!");
		gui.choice4.setText("...<say nothing>");
		
		game.nextPosition1 = "getH";
		game.nextPosition2 = "boat2";
		game.nextPosition3 = "getH";	
		game.nextPosition4 = "boat2";	
	}
	
	public void chapter2() {
		
		gui.Panel1Area.setText("*Chapter2*\n\n\n" +"7 days later around midnight, you wake up hungry,thristy and weak.\n" +"Prot:Where am i?");
		
		gui.choice1.setText("Damn American are we negotiating or not?");
		gui.choice2.setText("I really hope not Korea.");
		gui.choice3.setText("It really looks like North Kyushu but i might be wrong.");
		gui.choice4.setText("The only thing i know is that i ll be dead if i dont eat something.");
		
		game.nextPosition1 = "chapter2start";
		game.nextPosition2 = "chapter2astart";
		game.nextPosition3 = "chapter2bstart";	
		game.nextPosition4 = "chapter2start";
		
	}
	
	public void chapter2start() {
		
		gui.Panel1Area.setText("Prot:What should i do for now?");
		
		gui.choice1.setText("Find some food and water.");	
		gui.choice2.setText("Scout the area.");
		gui.choice3.setText("Shout out loud for help.");
		gui.choice4.setText("Panic.");
		
		game.nextPosition1 = "sixa";
		game.nextPosition2 = "sixb";
		game.nextPosition3 = "else6";	
		game.nextPosition4 = "else6";		
	}
	
	public void chapter2astart() {
		
		player.insanity += 1;
        gui.hpNumberLabel.setText(player.insanity+"          ");
        
		gui.Panel1Area.setText("Prot:What should i do for now?");
		
		gui.choice1.setText("Find some food and water.");	
		gui.choice2.setText("Scout the area.");
		gui.choice3.setText("Shout out loud for help.");
		gui.choice4.setText("Panic.");
		
		game.nextPosition1 = "sixa";
		game.nextPosition2 = "sixb";
		game.nextPosition3 = "else6";	
		game.nextPosition4 = "else6";		
	}
	
	public void chapter2bstart() {
		
		player.insanity -= 1;
        gui.hpNumberLabel.setText(player.insanity+"          ");
		
		gui.Panel1Area.setText("Prot:What should i do for now?");
		
		gui.choice1.setText("Find some food and water.");	
		gui.choice2.setText("Scout the area.");
		gui.choice3.setText("Shout out loud for help.");
		gui.choice4.setText("Panic.");
		
		game.nextPosition1 = "sixa";
		game.nextPosition2 = "sixb";
		game.nextPosition3 = "else6";	
		game.nextPosition4 = "else6";		
	}
	
	public void sixa() {
		
		player.insanity -= 1;
        gui.hpNumberLabel.setText(player.insanity+"          ");
		
	      if(player.insanity <= 3)
	        {
				gui.Panel1Area.setText("You found some fruits and you notice smoke coming from nearby.\n"
						+ "Prot:How should i approach?");
				
				gui.choice1.setText("It's fine just walk there.");	
				gui.choice2.setText("Maybe they are hunters i should announce myself.");
				gui.choice3.setText("Watch carefuly and then decide.");
				gui.choice4.setText("");
				
				game.nextPosition1 = "seven";
				game.nextPosition2 = "seven";
				game.nextPosition3 = "seven";	

	        }
	        else
	        {
				gui.Panel1Area.setText("You found some fruits and you notice smoke coming from nearby.\n"
						+ "Prot:How should i approach?");
				
				gui.choice1.setText("It's fine just walk there.");	
				gui.choice2.setText("Maybe they are hunters i should announce myself.");
				gui.choice3.setText("Watch carefuly and then decide.");
				gui.choice4.setText("Sneak up on them.(Insanity>3)");
				
				game.nextPosition1 = "seven";
				game.nextPosition2 = "seven";
				game.nextPosition3 = "seven";	
				game.nextPosition4 = "fight7d";		
	        }	
	}

	public void sixb() {
		
	      if(player.insanity <= 3)
	        {
				gui.Panel1Area.setText("You see the surrounding area and see a fire nearby.\n"
						+ "Prot:How should i approach?");
				
				gui.choice1.setText("It's fine just walk there.");	
				gui.choice2.setText("Maybe they are hunters i should announce myself.");
				gui.choice3.setText("Watch carefuly and then decide.");
				gui.choice4.setText("");
				
				game.nextPosition1 = "seven";
				game.nextPosition2 = "seven";
				game.nextPosition3 = "seven";	

	        }
	        else
	        {
	        	gui.Panel1Area.setText("You see the surrounding area and see a fire nearby.\n"
						+ "Prot:How should i approach?");
				
				gui.choice1.setText("It's fine just walk there.");	
				gui.choice2.setText("Maybe they are hunters i should announce myself.");
				gui.choice3.setText("Watch carefuly and then decide.");
				gui.choice4.setText("Sneak up on them.(Insanity>3)");
				
				game.nextPosition1 = "seven";
				game.nextPosition2 = "seven";
				game.nextPosition3 = "seven";	
				game.nextPosition4 = "fight7d";		
	        }	
	}
	
	public void else6() {
		
		player.insanity += 5;
        gui.hpNumberLabel.setText(player.insanity+"          ");
		
        if(player.insanity <= 3)
        {
			gui.Panel1Area.setText("While trying to calm down you notice smoke coming from somewhere close.\n"
					+ "Prot:How should i approach?");
			
			gui.choice1.setText("It's fine just walk there.");	
			gui.choice2.setText("Maybe they are hunters i should announce myself.");
			gui.choice3.setText("Watch carefuly and then decide.");
			gui.choice4.setText("");
			
			game.nextPosition1 = "seven";
			game.nextPosition2 = "seven";
			game.nextPosition3 = "seven";	

        }
        else
        {
			gui.Panel1Area.setText("While trying to calm down you notice smoke coming from somewhere close.\n"
					+ "Prot:How should i approach?");
			
			gui.choice1.setText("It's fine just walk there.");	
			gui.choice2.setText("Maybe they are hunters i should announce myself.");
			gui.choice3.setText("Watch carefuly and then decide.");
			gui.choice4.setText("Sneak up on them.(Insanity>3)");
			
			game.nextPosition1 = "seven";
			game.nextPosition2 = "seven";
			game.nextPosition3 = "seven";	
			game.nextPosition4 = "fight7d";		
        }
	}
	
	public void seven() {
		
		gui.Panel1Area.setText("You have arrived at the campfire and you see a person feasting on something like a maniac.\n"+"What should I do?");
		
		gui.choice1.setText("Hey you save something for me!");	
		gui.choice2.setText("Try to sneak attack him.");
		gui.choice3.setText("Watch him a little more.");
		gui.choice4.setText("Leave him, you dont want to bother him.");
		
		game.nextPosition1 = "fight8a";
		game.nextPosition2 = "fight8";
		game.nextPosition3 = "leave1";	
		game.nextPosition4 = "leave1";		
	}
	
public void fight7d() {
		
		player.insanity += 1;
	    gui.hpNumberLabel.setText(player.insanity+"          ");
	
		gui.Panel1Area.setText("You sneak up on him and try to slash his throat\n"+"He just turns but on you face half eaten and attacks\n" + "Battle with zombie hunter!\n" 
		+"Prot:What the fuck is going on? Was he a cannibal?\n"+ "You hear noises and you hide behind a tree.\n"+"Three men appear."
				+"Soldier1:What the fuck happened here?\n"+ "Soldier2:Damn it is that the Admiral?\n"+ "Soldier3:We are too late for him.That zombie ate him.");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "fightsoldiers";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";	
				
	}

public void fight8() {
	
	gui.Panel1Area.setText("He just turns but on you face half eaten and attacks\n" + "Battle with zombie hunter!\n" 
	+"Prot:What the fuck is going on? Was he a cannibal?\n"+ "You hear noises and you hide behind a tree.\n"+"Three men appear."
			+"Soldier1:What the fuck happened here?\n"+ "Soldier2:Damn it is that the Admiral?\n"+ "Soldier3:We are too late for him.That zombie ate him.");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "fightsoldiers";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";	
			
}

public void fight8a() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("He just turns but on you face half eaten and attacks\n" + "Battle with zombie hunter!\n" 
	+"Prot:What the fuck is going on? Was he a cannibal?\n"+ "You hear noises and you hide behind a tree.\n"+"Three men appear."
			+"Soldier1:What the fuck happened here?\n"+ "Soldier2:Damn it is that the Admiral?\n"+ "Soldier3:We are too late for him.That zombie ate him.");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "fightsoldiers";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";	
			
}

public void fightsoldiers() {
	
	gui.Panel1Area.setText("Prot:What should i do?");
	
	gui.choice1.setText("Talk to them.");	
	gui.choice2.setText("Calm Talk to them behind the tree.");
	gui.choice3.setText("Attack Them.");
	gui.choice4.setText("Calmly leave the area");
	
	game.nextPosition1 = "end1a";
	game.nextPosition2 = "survive1a";
	game.nextPosition3 = "end1b";	
	game.nextPosition4 = "survive1b";	
}

public void leave1() {
	
	gui.Panel1Area.setText("You stay hidden and you hear noises.\n"
	+"Three men appear.\n" +"Soldier1:What the fuck happening here?\n" 
	+"Soldier2:Damn it is that the Admiral?\n"
	+"They open fire and kill the man.\n"
	+ "Soldier3:We are too late for him.That zombie ate him.");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "afterleave1";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";	
}

public void afterleave1() {
	
	gui.Panel1Area.setText("Prot:Zombie,what the hell is going on?\n" + "What should i do?");
	
	gui.choice1.setText("Talk to them.");	
	gui.choice2.setText("Calm and talk to them behind the tree.");
	gui.choice3.setText("Attack Them.");
	gui.choice4.setText("Calmly leave the area");
	
	game.nextPosition1 = "end1a";
	game.nextPosition2 = "survive1a";
	game.nextPosition3 = "end1b";	
	game.nextPosition4 = "survive1b";	
}

public void end1a() {
	
	gui.Panel1Area.setText("Prot:I'M UNARMED!\n" +"*You try to talk to them and they open fire you are dead.*\n\n" 
	+"GAME OVER!!!");
	
	gui.choice1.setText("");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
	
}

public void end1b() {
	
	gui.Panel1Area.setText("*You try to attack them and they open fire you are dead*\n\n" 
	+"GAME OVER!!!");
	
	gui.choice1.setText("");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void survive1a() {
	
	gui.Panel1Area.setText("Prot:I'am unarmed.\nThey open fire but you are fine behind the tree.\n"
	+"Soldier3:Seize fire he is alive!\n" + "Soldier3: You hands up!\n" 
			+"*You show yourself*\n" + "Soldier3: I can't believe it's Lieutenant Sato!!Guns down men!");
	
	gui.choice1.setText("Do i know you?");	
	gui.choice2.setText("Present yourselves!");
	gui.choice3.setText("You almost killed me,fuckers!");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1a";
	game.nextPosition2 = "continue1a";
	game.nextPosition3 = "continue1a1";	
	game.nextPosition4 = "continue1a";	
}
	
public void continue1a() {
	
	gui.Panel1Area.setText("Soldier3: Sir we are sorry!\n" +"Soldier3: I'M PRIVATE SUZUKI!\n"
	+"Soldier2: PRIVATE TAKAHASHI ,SIR!\n" + "Soldier1: I used to be Private Tanaka Sir.\n" 
			+"Protagonist: Used to?\n" + "Soldier1: Everything went to hell Sir.");
	
	gui.choice1.setText("First of all why are you two shouting?");	
	gui.choice2.setText("Why aren't you shouting?");
	gui.choice3.setText("What happened?");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1ba";
	game.nextPosition2 = "continue1bb";
	game.nextPosition3 = "continue1b";	
	game.nextPosition4 = "continue1b";	
}

public void continue1a1() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("Soldier3: Sir we are sorry!\n" +"Soldier3: I'M PRIVATE SUZUKI!\n"
	+"Soldier2: PRIVATE TAKAHASHI ,SIR!\n" + "Soldier1: I used to be Private Tanaka Sir.\n" 
			+"Protagonist: Used to?\n" + "Soldier1: Everything went to hell Sir.");
	
	gui.choice1.setText("First of all why are you two shouting?");	
	gui.choice2.setText("Why aren't you shouting?");
	gui.choice3.setText("What happened?");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1ba";
	game.nextPosition2 = "continue1bb";
	game.nextPosition3 = "continue1b";	
	game.nextPosition4 = "continue1b";	
}

public void continue1ba() {
	
	player.insanity -= 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("Soldier3,2: Sorry,sir.\n");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "continue1b";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
	
}

public void continue1bb() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("Soldier1: I wont.\n");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "continue1b";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1b() {
	
	gui.Panel1Area.setText("Soldier1: Well hell broke loose the whole island is infested with zombies.\n" 
	+"Soldier3: The goverment abandoned us the Americans feinted the negotiations we are still on war.\n" 
			+"Prot: Oh,god...\n" + "Soldier3: We are the only sane soldiers left from the returing troops and we are only 10 left plus you now.");
	
	gui.choice1.setText("Is officerName alive?");	
	gui.choice2.setText("We should head back.");
	gui.choice3.setText("So what do we do now?");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1ca";
	game.nextPosition2 = "continue1ca";
	game.nextPosition3 = "continue1cb";	
	game.nextPosition4 = "continue1cb";
	
}

public void continue1ca() {
	
	gui.Panel1Area.setText("Soldier3: Yes,lets head back.\n");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "continue1c";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1cb() {
	
	gui.Panel1Area.setText("Soldier3: Let's head back now.\n");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "continue1c";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1c() {
	
	gui.Panel1Area.setText("After an hour walking you arrive at the camp.\n" 
	+"You see a bamboo wall 3 meters high and it seems sturdy enough.\n" 
			+"An officer salutes you.\n" + "GateGuard: New Arrivals,Sir!\n" 
	+"OfficerName: Who is it?As long as i live and breath Protagonist!?");
	
	gui.choice1.setText("I'm happy to see you too,OfficerName.");	
	gui.choice2.setText("I need help sir!");
	gui.choice3.setText("...(i hate that man)");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1d";
	game.nextPosition2 = "continue1d";
	game.nextPosition3 = "continue1d1";	
	game.nextPosition4 = "continue1d";
}

public void continue1d() {
	
	gui.Panel1Area.setText("OfficerName: Goddamnit help the man!\n" +"Two medics arrive and lift you to a cart and escort you to a tent.\n" 
	+"Water and some rations are given to you.\n" +"You eat and drink and then fall asleep.");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "continue1e";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1d1() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("OfficerName: Goddamnit help the man!\n" +"Two medics arrive and lift you to a cart and escort you to a tent.\n" 
	+"Water and some rations are given to you.\n" +"You eat and drink and then fall asleep.");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "continue1e";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1e() {
	
	gui.Panel1Area.setText("The next day arrives.\n" + "OfficerName: Wakey,wakey Protagonist.Did you sleep well?");
	
	gui.choice1.setText("Like a baby.");	
	gui.choice2.setText("Well enough.");
	gui.choice3.setText("No,not even close.");
	gui.choice4.setText("Like shit.");
	
	game.nextPosition1 = "continue1ea";
	game.nextPosition2 = "continue1ea";
	game.nextPosition3 = "continue1eb";	
	game.nextPosition4 = "continue1eb";
}

public void continue1ea() {
	
	gui.Panel1Area.setText("OfficerName: I'm happy to hear that.");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "continue1f";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1eb() {
	
	gui.Panel1Area.setText("OfficerName: I'm sorry you arent on the imperial palace.");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "continue1f";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1f() {
	
	gui.Panel1Area.setText("OfficerName: The situation here is dire Protagonist we are low on everything you can name.\n" 
	+"OfficerName: I need your help.\n" + "Protagonist:How can i help?\n" 
	+"OfficerName: First of all we lack supplies,secondly guards,a logistics manager and lastly a recon squad leader.");
	
	gui.choice1.setText("I'll go look for supplies.");	
	gui.choice2.setText("I'll do guard duty.");
	gui.choice3.setText("I'll do ration distribution.");
	gui.choice4.setText("I'll go scouting.");
	
	game.nextPosition1 = "continue1g1";
	game.nextPosition2 = "continue1g2";
	game.nextPosition3 = "continue1g3";
	game.nextPosition4 = "continue1g4";
	
}

public void continue1g1() {
	
	prot15 = 1;
	gui.Panel1Area.setText("OfficerName: Alright,rest for today tomorrow you go to your post.\n");
	
	gui.choice1.setText("Thanks,sir");	
	gui.choice2.setText("No i want to help now.");
	gui.choice3.setText("I can rest whenever i want!");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1ga";
	game.nextPosition2 = "continue1gb";
	game.nextPosition3 = "continue1gb1";	
	game.nextPosition4 = "continue1ga";
}

public void continue1g2() {
	
	prot15 = 2;
	gui.Panel1Area.setText("OfficerName: Alright,rest for today tomorrow you go to your post.\n");
	
	gui.choice1.setText("Thanks,sir");	
	gui.choice2.setText("No i want to help now.");
	gui.choice3.setText("I can rest whenever i want!");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1ga";
	game.nextPosition2 = "continue1gb";
	game.nextPosition3 = "continue1gb";	
	game.nextPosition4 = "continue1ga";
}

public void continue1g3() {
	
	prot15 = 3;
	gui.Panel1Area.setText("OfficerName: Alright,rest for today tomorrow you go to your post.\n");
	
	gui.choice1.setText("Thanks,sir");	
	gui.choice2.setText("No i want to help now.");
	gui.choice3.setText("I can rest whenever i want!");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1ga";
	game.nextPosition2 = "continue1gb";
	game.nextPosition3 = "continue1gb";	
	game.nextPosition4 = "continue1ga";
}

public void continue1g4() {
	
	prot15 = 4;
	gui.Panel1Area.setText("OfficerName: Alright,rest for today tomorrow you go to your post.\n");
	
	gui.choice1.setText("Thanks,sir");	
	gui.choice2.setText("No i want to help now.");
	gui.choice3.setText("I can rest whenever i want!");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "continue1ga";
	game.nextPosition2 = "continue1gb";
	game.nextPosition3 = "continue1gb";	
	game.nextPosition4 = "continue1ga";
}

public void continue1ga() {
	
	gui.Panel1Area.setText("OfficerName: Thanks for not making it harder for me man,rest easy.\n" 
	+"*You close your eyes and fall asleep*\n\n" + "*Chapter2 Ends...*");
	
	gui.choice1.setText("Continue to Chapter3.");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3a";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1gb() {
	
	gui.Panel1Area.setText("OfficerName: Do as you are told dont make it harder for me you idiot!\n" 
	+"*You close your eyes and fall asleep*\n\n" + "*Chapter2 Ends...*");
	
	gui.choice1.setText("Continue to Chapter3.");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3a";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void continue1gb1() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("OfficerName: Do as you are told dont make it harder for me you idiot!\n" 
	+"*You close your eyes and fall asleep*\n\n" + "*Chapter2 Ends...*");
	
	gui.choice1.setText("Continue to Chapter3.");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3a";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void chapter3a() {
	
	gui.Panel1Area.setText("*Chapter 3*\n" 
	+ "The following morning...\n" 
	+ "*OfficerName enters your tent*\n"
	+"Cpt.Nakamura: Get dressed your post is waiting.\n"
	+"*You dress up in a new military uniform*\n" 
	+"Sato: I'm ready for duty sir.\n" 
	+"Cpt.Nakamura: Let's go meet your team.");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3a_begin";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void chapter3a_begin() {
	
	if(prot15 == 1 || prot15 == 4) 
	{
		gui.Panel1Area.setText("*You walk to the gate and you see 2 men*\n"
		+"*They both salute you*\n" + "Sato: What should i do?");
		
		gui.choice1.setText("*salute back*");	
		gui.choice2.setText("Present yourselves");
		gui.choice3.setText("Cut the formalities, what's your names?");
		gui.choice4.setText("...");
		
		game.nextPosition1 = "chapter3Aa";
		game.nextPosition2 = "chapter3Aa";
		game.nextPosition3 = "chapter3Ab";	
		game.nextPosition4 = "chapter3Aa";
	}
	else if(prot15 == 2) 
	{
		gui.Panel1Area.setText("*You follow Nakamura to camp center*\n"
		+ "*You see 2 men with rifles*" + "*They salute you*\n" 
		+ "Sato: What should i do?");
		
		gui.choice1.setText("*salute back*");	
		gui.choice2.setText("Present yourselves");
		gui.choice3.setText("Cut the formalities, what's your names?");
		gui.choice4.setText("...");
		
		game.nextPosition1 = "chapter3Aa";
		game.nextPosition2 = "chapter3Aa";
		game.nextPosition3 = "chapter3Ab";	
		game.nextPosition4 = "chapter3Aa";
	}
	else 
	{
		gui.Panel1Area.setText("*You follow Nakamura to camp center*\n"
		+ "*You see 1 man with a catalog*" + "*He salutes you*\n" 
		+ "Sato: What should i do?");
		
		gui.choice1.setText("*salute back*");	
		gui.choice2.setText("Present yourselves");
		gui.choice3.setText("Cut the formalities, what's your name?");
		gui.choice4.setText("...");
		
		game.nextPosition1 = "chapter3Aa";
		game.nextPosition2 = "chapter3Aa";
		game.nextPosition3 = "chapter3Ab";	
		game.nextPosition4 = "chapter3Aa";
	}
}

public void chapter3Aa() {
	
	player.insanity -= 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	if(prot15 == 1)
	{
		gui.Panel1Area.setText("Akira: Cadet Officer Akira Tanaka ,Sir!\n" 
		+ "Eiko: Second lieutenant Eiko Watanabe,Sir!\n" 
		+ "Cpt.Nakamura: You are assigned to find vital supplies,don't return empty handed.\n"
		+ "Cpt.Nakamura: Sato take a submachine,you two take pistols.\n"
		+ "Cpt.Nakamura: Stay safe men!\n"
		+"*You and the men exit the camp*");
		
		gui.weaponLabelName.setText("Submachine Gun");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_continue1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
	else if(prot15 == 2)
	{
		gui.Panel1Area.setText("Ryoichi: Private Ryoichi Yamamoto,Sir!\n" 
		+ "Ena: Sergeant Ena Ito,Sir!\n" 
		+ "Nakamura: You take a machinegun Sato.\n"
		+ "Nakamura: If you see anything suspicious tell me at once!\n"
		+ "Sato,Ena & Ryoichi: Yes,Sir!"
		+ "*You take the post inside a small machinegun foxhole*\n"
		+ "Sato: Who comes with me inside?");
		
		gui.choice1.setText("Ena");	
		gui.choice2.setText("Ryoichi");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "Ena";
		game.nextPosition2 = "Ryoichi";

	}
	else if(prot15 == 4)
	{
		gui.Panel1Area.setText("Akira: Cadet Officer Akira Tanaka ,Sir!\n" 
		+ "Eiko: Second lieutenant Eiko Watanabe,Sir!\n" 
		+ "Cpt.Nakamura: You are assigned to scout the area South East of the base we suspect.\n"
		+ "Cpt.Nakamura: Sato take a rifle,you two take submachines.\n"
		+ "Cpt.Nakamura: Stay safe men!\n"
		+"*You and the men exit the camp*");

		gui.weaponLabelName.setText("Rifle");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_continue2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
	else
	{
		gui.Panel1Area.setText("Ryo: Sergeant Ryo Mori,Sir!\n"
		+ "Nakamura: We are on a critical condition.\n"
		+ "Nakamura: We need supplies,whatever you can name. Food,water,medicine.\n"
		+ "Sato: What about bullets?\n"
		+ "Nakamura: If bullets were food our stomachs would be full.\n"
		+ "Sato: ...");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_continue3";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
}

public void	chapter3Aa_continue1() {
	

	gui.Panel1Area.setText("*You head east*\n" + "*After a while you spot a 10 zombie horde*\n" 
	+ "*You hear gunshots*\n" + "*The zombies turn toward the sound*\n" 
	+ "Sato: Should we follow them?\n" + "Akira: Why,sir?\n" 
	+ "Eiko: Maybe the source of the gunshots is also a source of food?"
	+ "Sato: What should i do?");

	gui.choice1.setText("Follow");	
	gui.choice2.setText("Leave them");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_continue1_a";
	game.nextPosition2 = "chapter3Aa_continue1_b";
	
}

public void chapter3Aa_continue1_a() {
	
	player.insanity += 10;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("Eiko: Wise choice,sir.\n" + "Sato: Let's go men.\n"
	+ "*You follow the horde to a big bamboo fort*\n" 
	+ "Sato: Shit,it's surrounded.\n" + "Akira: I can count at least 90 heads plus 4 alive gunners."
	+ "*You hear children scream from the fort*\n"
	+ "Sato: What should we do?");
	
	gui.choice1.setText("Let the zombies deal with them");	
	gui.choice2.setText("Sabotage the defences");
	gui.choice3.setText("Help them by luring the horde");
	gui.choice4.setText("Go guns blazing in");
	
	game.nextPosition1 = "chapter3Aa_19a";
	game.nextPosition2 = "chapter3Aa_19b";
	game.nextPosition3 = "chapter3Aa_19c";	
	game.nextPosition4 = "chapter3Aa_19d";
}

public void chapter3Aa_19a() {
	
	player.insanity += 15;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	prot19 = 1;
	
	if(player.insanity <=25)
	{
		gui.Panel1Area.setText("Sato: Let the zombies do the hard work we take their supplies after.\n"
		+ "Akira: You are a madman.\n" + "Sato: You are defying my orders?\n" 
		+ "Akira: Yes,sir!\n" + "Sato: Return to base then.");
	}
	else if(player.insanity >25 && player.insanity <35)
	{
		gui.Panel1Area.setText("Sato: Let the zombies do the hard work we take their supplies after.\n"
		+ "Akira: You are a madman.\n" + "Sato: You are defying my orders?\n" 
		+ "Akira: Yes,sir!\n" + "*You slice his throat with a knife*\n"
		+ "Sato: Coward.\n" + "Eiko: He was,sir...");
	}
	else
	{
		gui.Panel1Area.setText("Sato: Let the zombies do the hard work we take their supplies after.\n"
				+ "Akira: You are a madman.\n" + "Sato: You are defying my orders?\n" 
				+ "Akira: Yes,sir!\n" + "*You grap Akira by the skull and pop his eyes*\n"
				+ "Eiko: Wtf...sir");
	}
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_19a_continue";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void chapter3Aa_19a_continue() {
	
		gui.Panel1Area.setText("You wait for a while they keep fighting but suddently silence.\n"
		+ "You see smoke coming from the fort as the zombies breach the gate.\n" 
		+ "You hear 5 gunshots and a man screaming the zombies got him but not his family...");

		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_19a_end";

}

public void chapter3Aa_19a_end() {
	
	if(player.insanity <= 25) 
	{
		gui.Panel1Area.setText("Nakamura isn't pleased by your reporting because Akira told the whole story first.\n"
		+ "You are court-martialed and sentenced to death by shotting squad along with Eiko.\n\n"
		+ "THE END!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else
	{
		gui.Panel1Area.setText("Nakamura isn't pleased by your report but can't do anything about it.\n"
		+ "But the guilt eats you from the inside so one night you sneak out.\n"
		+ "You return to the place where the fort stood and hang yourself from a tree.\n\n"
		+ "THE END!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
}

public void chapter3Aa_19b() {
	
	player.insanity += 25;
    gui.hpNumberLabel.setText(player.insanity+"          ");
    
    prot19 = 2;
    
	if(player.insanity <=25)
	{
		gui.Panel1Area.setText("Sato: We will sabotage the defences a bit.\n"
		+ "Akira: You are a madman.\n" + "Sato: You are defying my orders?\n" 
		+ "Akira: Yes,sir!\n" + "Sato: Return to base then.");
	}
	else if(player.insanity >25 && player.insanity <35)
	{
		gui.Panel1Area.setText("Sato: We will sabotage the defences a bit.\n"
		+ "Akira: You are a madman.\n" + "Sato: You are defying my orders?\n" 
		+ "Akira: Yes,sir!\n" + "*You slice his throat with a knife*\n"
		+ "Sato: Coward.\n" + "Eiko: He was,sir...");
	}
	else
	{
		gui.Panel1Area.setText("Sato: We will sabotage the defences a bit.\n"
		+ "Akira: You are a madman.\n" + "Sato: You are defying my orders?\n" 
		+ "Akira: Yes,sir!\n" + "*You grap Akira by the skull and pop his eyes*\n"
		+ "Eiko: Wtf...sir");
	}
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_19b_continue";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
        
}

public void chapter3Aa_19b_continue() {
	
	gui.Panel1Area.setText("Eiko throws a makeshift bomb to the walls.\n"
	+ "The zombies break in faster,after a fight they devour the family.\n" 
	+ "Only a handful of zombies are left and you take care of them.\n"
	+ "You find supplies and guns you pack them and return.\n"
	+ "You return back to base and make a report to Nakamura.");

	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_19b_end";
}

public void chapter3Aa_19b_end() {
	
	if(player.insanity <= 25) 
	{
		gui.Panel1Area.setText("Nakamura is pleased by your reporting although Akira told the whole story first.\n"
		+ "Akira is court-martialed and sentenced to death by shotting squad the reason...Desertion.\n"
		+ "You continue going to missions but the guilt is always with you.\n"
		+ "The rest of your life is uneasy.\n\n"
		+ "THE END!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else
	{
		gui.Panel1Area.setText("Nakamura is pleased but also saddened by your report.\n"
				+ "But the guilt eats you from the inside so one night you sneak out.\n"
				+ "You return to the place where the fort stood and hang yourself from a tree.\n"
				+ "You enter the fort to be devoured by its previous occupants.\n\n"
				+ "THE END!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
}

public void chapter3Aa_19c() {
	
	player.insanity -= 10;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	prot19 = 3;
	
	if(player.insanity <=10)
	{
		gui.Panel1Area.setText("Sato: Let's help them by luring the horde.\n"
		+ "Eiko: No sir we won't.\n" 
		+ "Sato: What did you say?\n"
		+ "Eiko: I only care about my fellow soldiers,sir.");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_19c_continue1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
		
		
	}
	else if(player.insanity >10 && player.insanity <=20)
	{
		gui.Panel1Area.setText("Sato: Let's help them by luring the horde.\n"
		+ "Eiko: No sir we won't.\n" 
		+ "Sato: What did you say?\n"
		+ "Eiko: I only care about my fellow soldiers,sir.");;
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_19c_continue2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
	else
	{
		gui.Panel1Area.setText("Sato: Let's help them by luring the horde.\n"
		+ "Eiko: No sir we won't.\n" 
		+ "Sato: What did you say?\n"
		+ "Eiko: I only care about my fellow soldiers,sir.");

		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_19c_continue3";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
	
}

public void chapter3Aa_19c_continue1() {
	
	gui.Panel1Area.setText("Sato: Damnit man get a hold of yourself!\n"
	+ "Eiko: Sorry,sir.\n"
	+ "You lure and kill the horde with the help of the other gunners.\n"
	+ "You talk to them and you find out they were retired soldiers.\n"
	+ "You take them back and they open fire just as the gates opened.\n"
	+ "You are the first to fall along with your team but the camp stood.\n"
	+ "THE END!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void chapter3Aa_19c_continue2() {
	
	gui.Panel1Area.setText("Sato: Get out of my sight,you disgust me Eiko!\n"
	+ "*Eiko returns to camp while you fight the horde*\n"
	+ "After a while you barely manage to kill them all.\n"
	+ "Akira lays dead nearby.\n"
	+ "You panic and return back to base.\n"
	+ "As you enter the camp a siege begins.\n"
	+ "You take your spot and rifle and the battle begins.");
	
	gui.choice1.setText("Ambush bandits");	
	gui.choice2.setText("Charge at bandits");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_19c_continue2_end1";
	game.nextPosition2 = "chapter3Aa_19c_continue2_end2";
}

public void chapter3Aa_19c_continue2_end1() {
	
	gui.Panel1Area.setText("The siege is lifted and you continue your life with the guilt of Akira's death.\n\n\n"
	+ "THE END!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void chapter3Aa_19c_continue2_end2() {
	
	gui.Panel1Area.setText("You are overrun and the bandits kill everyone of you...\n\n\n"
	+ "THE END!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void chapter3Aa_19c_continue3() {
	
	gui.Panel1Area.setText("*You shoot Eiko with his pistol in his head*\n"
	+ "Sato: *spits* Pig...\n"
	+ "The zombies turn their attention on you.\n"
	+ "It's too much for you.\n"
	+ "After a while you are surrounded.\n"
	+ "You die while fighting them.\n"
	+ "THE END!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void chapter3Aa_19d() {
	
	player.insanity += 5;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	prot19 = 4;
	
	if(player.insanity <=15)
	{
		gui.Panel1Area.setText("Sato:Let's go just kill them boys.\n"
		+ "Eiko & Akira: Are you crazy,sir?\n"
		+ "Sato: No! *throws makeshift bomb at horde*\n"
		+ "Eiko and Akira are inspired by you and join the fight.\n" 
		+ "Shortly after the whole horde is dead.\n"
		+ "As you stand amazed by your feat the gunners open fire and kill all of you.\n"
		+ "THE END!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else if(player.insanity >15 && player.insanity <=27)
	{
		gui.Panel1Area.setText("Sato:Let's go just kill them boys.\n"
		+ "Eiko & Akira: Are you crazy,sir?\n"
		+ "Sato: Yes! *throws makeshift bomb at horde*"
		+ "Eiko and Akira are terrified by you and leave the area.\n" 
		+ "After the first rounds are fired you are surrounded and you became a appetizer for the horde.\n"
		+ "The main meal is in the fort."
		+ "THE END!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else
	{
		gui.Panel1Area.setText("Sato:Let's go just kill them boys.\n"
		+ "Eiko & Akira: Are you crazy,sir?\n"
		+ "Sato: AAAAAA*fire submachinegun at both Eiko & Akira*\n"
		+ "*Eiko & Akira are dead*\n" 
		+ "After which a sniper hits you in the head.\n"
		+ "You die instantly.\n"
		+ "THE END!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	
}

public void chapter3Aa_continue1_b() {
	
	player.insanity -= 10;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("Akira: Yes,let's save our bullets.\n"
	+ "Sato: Let's go men.\n"
	+ "*You leave the horde alone and head a bit north opposite to the horde*\n"
	+ "*You find a small camp*\n"
	+ "*No one seems to be around*\n"
	+ "Sato: How to approach?");
	
	gui.choice1.setText("With caution(non lethal)");	
	gui.choice2.setText("Kill everything that might move");
	gui.choice3.setText("");
	gui.choice4.setText("");

	
	game.nextPosition1 = "withcaution";
	game.nextPosition2 = "withcaution";

}

public void withcaution() {
	
	player.insanity -= 5;
    gui.hpNumberLabel.setText(player.insanity+"          ");
    
    gui.Panel1Area.setText("Sato: Approach with caution men,only kill zombies.\n"
	+ "Eiko & Akira: Yes,sir!\n"
	+ "*You enter the camp nobody seems around*\n"
	+ "*You hear a child cream from a nearby tent*\n"
	+ "*You open the tent and see a strange machine emmiting the sound*\n"
	+ "*A huge horde is attracted from nearby while three men block your way out*\n"
	+ "*It'a a trap, you have to fight your way out*");
    
	gui.choice1.setText("Fight with anger and fear");	
	gui.choice2.setText("Fight like it is your last battle");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "losefight";
	game.nextPosition2 = "winfight";

}

public void losefight() {
	
	 gui.Panel1Area.setText("The enemy squad killed you and took your equipment.\n"
	+ "You become part of the horde.\n\n"
	+ "THE END!");
	 
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void winfight() {
	
	gui.Panel1Area.setText("You managed to kill all of them bravely.\n"
	+ "Sato: These are american uniforms!\n"
	+ "Sato:Take their stuff and quickly back to base.\n"
	+ "You return back and report to Nakamura.\n"
	+ "He is surprised by your report and consider civillian join our forces to face the common enemy.\n\n"
	+ "THE END!");
	 
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}


public void chapter3Ab() {
	
	if(prot15 == 1)
	{
		gui.Panel1Area.setText("Akira: Akira Tanaka, sir.\n" 
		+ "Eiko: I'm Eiko Watanabe, sir.\n" 
		+ "Cpt.Nakamura: You are assigned to find vital supplies,don't return empty handed.\n"
		+ "Cpt.Nakamura: Sato take a submachine,you two take pistols.\n"
		+ "Cpt.Nakamura: Stay safe men!\n"
		+"*You and the men exit the camp*");
		
		
		gui.weaponLabelName.setText("Submachine Gun");
		 
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_continue1";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
	else if(prot15 == 2)
	{
		gui.Panel1Area.setText("Akira: Akira Tanaka, sir.\n" 
		+ "Eiko: I'm Eiko Watanabe, sir.\n"  
		+ "Nakamura: You take a machinegun Sato.\n"
		+ "Nakamura: If you see anything suspicious tell me at once!\n"
		+ "Sato,Ena & Ryoichi: Yes,Sir!"
		+ "*You take the post inside a small machinegun foxhole*\n"
		+ "Sato: Who comes with me inside?");
		
		gui.weaponLabelName.setText("Machine Gun");
		
		gui.choice1.setText("Ena");	
		gui.choice2.setText("Ryoichi");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "Ena";
		game.nextPosition2 = "Ryoichi";

	}
	else if(prot15 == 4)
	{
		gui.Panel1Area.setText("Akira: Akira Tanaka, sir.\n" 
		+ "Eiko: I'm Eiko Watanabe, sir.\n" 
		+ "Cpt.Nakamura: You are assigned to scout the area South East of the base we suspect.\n"
		+ "Cpt.Nakamura: Sato take a rifle,you two take submachines.\n"
		+ "Cpt.Nakamura: Stay safe men!\n"
		+"*You and the men exit the camp*");
		
		gui.weaponLabelName.setText("Rifle");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_continue2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
	else
	{
		gui.Panel1Area.setText("Akira: Akira Tanaka, sir.\n" 
		+ "Eiko: I'm Eiko Watanabe, sir.\n" 
		+ "Nakamura: We need supplies,whatever you can name. Food,water,medicine.\n"
		+ "Sato: What about bullets?\n"
		+ "Nakamura: If bullets were food our stomachs would be full Sato.\n"
		+ "Sato:...");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "chapter3Aa_continue3";
		game.nextPosition2 = "";
		game.nextPosition3 = "";	
		game.nextPosition4 = "";
	}
}

public void	chapter3Aa_continue2() {
	

		gui.Panel1Area.setText("*You head south east*\n" + "*After a while you find a small concrete compount*\n" 
		+ "Sato: We found something boys!\n" 
		+ "Eiko: It must be the raider base of those assholes from the attack 3 days ago.\n" 
		+ "Akira: It must be them, they are so close.\n" 
		+ "Eiko: 2 men at the courtyard and 2 around the walls."
		+ "Akira: What should we do sir?");
		
		gui.choice1.setText("Try talking with them");	
		gui.choice2.setText("Snipe them out");
		gui.choice3.setText("Full on attack");
		gui.choice4.setText("Betray my men");
		
		game.nextPosition1 = "chapter3Aa_continue2a";
		game.nextPosition2 = "chapter3Aa_continue2b";
		game.nextPosition3 = "chapter3Aa_continue2c";	
		game.nextPosition4 = "chapter3Aa_continue2d";
	
}

public void chapter3Aa_continue2a() {
	
	gui.Panel1Area.setText("*You aproach the gate when you knock the door a hatch opens\n*"
	+ "Sato: Hello sir!\n" + "*machine gun opens fire\n*" +"*You are dead\n\n*"
	+ "GAME OVER!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void chapter3Aa_continue2b() {
	
	gui.Panel1Area.setText("Sato: I'll snipe them one by one you cover me.\n"
	+ "Akira & Eiko: Yes,sir!\n" 
	+ "Sato: *shoots an man on the head*Let's get it started\n"
	+ "*You spot a sniper behind a crate*\n"
	+ "*The gate opens and 3 armored men come towards you*\n"
	+ "Sato: Enough we got their numbers,retreat!!!\n"
	+ "*As you run a away a bullet kills Akira*");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_continue2b_end";
}

public void chapter3Aa_continue2b_end(){
	
	gui.Panel1Area.setText("Eiko: Phew that almost got me!!!\n"
	+ "You return to your camp but the raiders follow you.\n"
	+ "A siege begins.\n" + "You take counter-sniping role.\n"
	+ "After a long and heroic battle you are killed and your whole camp is looted and razed.\n\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void chapter3Aa_continue2c() {
	
	gui.Panel1Area.setText("Sato: We attack with everything we got!\n"
	+ "*Eiko throws a makeshift bomb at the court*\n"
	+ "*the court is on fire*\n"
	+ "You spot 2 snipers behind covers.\n"
	+ "Sato: I'm empty,retreat!\n"
	+ "*while you retreat 3 armored men come toward you*\n"
	+ "*As you run a away a bullet kills Eiko*");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_continue2c_end";
}

public void chapter3Aa_continue2c_end(){
	
	gui.Panel1Area.setText("Akira: Damnit why did we attack them!\n"
	+ "Sato: We can't risk going to camp.\n"
	+ "You strap yourself with bombs and fall on the enemy killing 9 men.\n"
	+ "Akira is killed by a sniper after killing 5 men.\n"
	+ "You crippled the raiders so much that the next day they are overrun by a horde."
	+ "The locals are safe from the raider for now at least."
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void chapter3Aa_continue2d() {
	
	gui.Panel1Area.setText("Sato: Damn all of you!\n"
	+ "*kill Akira with a knife*\n"
	+ "Eiko: What the fuck is wrong with you?\n"
	+ "kill Eiko brutally*\n"
	+ "*Sato approaches the gate with hands up holding the officer hat*\n"
	+ "Sato: I WANT TO JOIN YOU I WAS AN ARMY OFFICER!\n"
	+ "Heavy Voice: PUT YOUR GUNS ON THE GROUND!");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_continue2d_end";
}

public void chapter3Aa_continue2d_end() {
	
	gui.Panel1Area.setText("*Sato disarms himself takes a step forward and kneels*\n"
	+ "*the door opens and 1 heavy armored man comes out with 7 men*\n"
	+ "Botan: My name is Botan i lead these men come inside...?\n"
	+ "Sato: Sato,Daichi Sato.\n"
	+ "Botan:Come in Sato.\n"
	+ "You ended up joining the raiders.\n"
	+ "Their twisted ways made you to a bloodthirty man.");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_continue2d_endd";
}

public void chapter3Aa_continue2d_endd() {
	
	if(player.insanity <= 16)
	{
		gui.Panel1Area.setText("One day Botan decides to attack Nakamura's camp.\n"
		+ "You at this point have lost you mind from the countless kills you seen.\n"
		+ "You battle your ex fellow soldier and you overrun their base.\n"
		+ "Nobody is left alive!\n"
		+ "You continue to raid the nearby camps.\n"
		+ "Until one day your compount is overrun by a huge horde!\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else if(player.insanity > 16 && player.insanity <= 28) 
	{
		gui.Panel1Area.setText("One day Botan decides to attack Nakamura's camp.\n"
		+ "You at this point have lost you mind from the countless kills you seen.\n"
		+ "You run to battle with such excitiment that your ex fellow surrender after a while.\n"
		+ "Nakumura himself personally waves a white flag.\n"
		+ "You aproach him and slit his throat.\n"
		+ "You clearly have gone mad...\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else
		gui.Panel1Area.setText("One day Botan decides to attack Nakamura's camp.\n"
		+ "You at this point have lost you mind from the countless kills you seen.\n"
		+ "You run scream into battle your fellow raider following you example.\n"
		+ "After mere minutes they surrender.\n"
		+ "Nakumura himself personally waves a white flag.\n"
		+ "You hit him in the head and take him back to base.\n");
	
		gui.choice1.setText(">");
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
	
		game.nextPosition1 = "chapter3Aa_continue2d_enddd";
}

public void chapter3Aa_continue2d_enddd() {
	
	gui.Panel1Area.setText("After of days of torture he is a broken man.\n"
	+ "Nakamura joins the raiders.\n"
	+ "You become a unstoppable force with Nakamura o your side.\n"
	+ "You kill Botan and become leader of the band.\n"
	+ "The poor villages are helpless against you.\n"
	+ "You are more feared than the hordes!\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void Ena() {
	
	gui.Panel1Area.setText("Sato: Ena with me inside the foxhole,Ryoichi take sniping position near us.\n"
	+ "Royoichi: Yes,sir!\n"
	+ "*hours pass by nothing seems to happen*\n"
	+ "*You spot a small figure almost 100 meters away*\n"
	+ "Sato: Ryoichi,idenify 100 meter south!\n"
	+ "Ryoichi:It's a child sir.\n"
	+ "Sato: What should we do?");
	
	gui.choice1.setText("Report now");	
	gui.choice2.setText("Kill it");
	gui.choice3.setText("Go talk to it");
	gui.choice4.setText("Leave it be");
	
	game.nextPosition1 = "Ena_a";
	game.nextPosition2 = "Ena_b";
	game.nextPosition3 = "Ena_c";	
	game.nextPosition4 = "Ena_d";
}

public void Ena_a() {
	
	gui.Panel1Area.setText("*5 more zombies appear*\n"
	+ "*You quickly report to Nakamura and he give you another man*\n"
	+ "*You return and a horde is there coming towards the camp*\n"
	+ "*You three take positions and after a long fight the horde is destroyed*\n"
	+ "After the battle Nakamura praises you and makes you his right hand man.\n"
	+ "You survive until the Imperial army evacuates you all!\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void Ena_b() {
	
	player.insanity += 10;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("Sato: Kill it Ena!\n"
	+ "Ena:Yes,sir!\n"
	+ "*15 more zombies slowly appear*\n"
	+ "*After a while a horde is formed near your camp*\n"
	+ "Nakamura awakes and orders all to fight the horde.\n"
	+ "In the meanwhile a band of raider come from the side with a machinegun and wipe all of you!\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void Ena_c() {
		
	gui.Panel1Area.setText("You go and try to talk to the child.\n"
	+ "It quickly turns and bites you.\n"
	+ "You kill it and cover your bite.\n"
	+ "2 days later you turn and you bite 2 men before you are taken down.\n\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void Ena_d() {
	
	player.insanity -= 5;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("Ena/Royoichi: Yes,sir!\n"
	+ "The night comes no problems on your watch today.\n"
	+ "The next day comes and you take your posts again.\n"
	+ "This time you are surrounded by a horde on the one side and raiders from the other.\n"
	+ "You split your men and manage to cope with both threats but your camp was destroyed.\n"
	+ "You quickly collect whatever you can and leave this place for a better one.\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void Ryoichi() {
	
	gui.Panel1Area.setText("Sato: Ryoichi with me inside the foxhole,Ena take sniping position near us.\n"
	+ "Ena:Yes,sir!\n"
	+ "*hours pass by nothing seems to happen*\n"
	+ "*you spot a small figure almost 100 meters away*\n"
	+ "Sato: Ena,idenify 100 meter south!\n"
	+ "Ena: It's a zombie child sir!\n"
	+ "Sato: What should we do?");
	
	gui.choice1.setText("Report now");	
	gui.choice2.setText("Kill it");
	gui.choice3.setText("Leave it be");
	gui.choice4.setText("");
	
	game.nextPosition1 = "Ena_a";
	game.nextPosition2 = "Ena_b1";
	game.nextPosition3 = "Ena_d";	

}

public void Ena_b1() {
	
	player.insanity += 10;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("Sato: Kill it Ryoichi!\n"
	+ "Ena:Yes,sir!\n"
	+ "*15 more zombies slowly appear*\n"
	+ "*After a while a horde is formed near your camp*\n"
	+ "Nakamura awakes and orders all to fight the horde.\n"
	+ "In the meanwhile a band of raider come from the side with a machinegun and wipe all of you!\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void chapter3Aa_continue3() {
	
	gui.Panel1Area.setText("Nakamura: *sighs*I need you to divide rations for the men.\n"
	+ "Nakamura: I know it's hard but someone should do it,I'm going back to my tent.\n"
	+ "Ryo: So let's start.\n"
	+ "Ryo: We have 40 meals left and 8 men currently on the fort.\n"
	+ "Ryo: How should we divide them?");
	
	gui.choice1.setText("Keep them as they are");	
	gui.choice2.setText("Cut them in half");
	gui.choice3.setText("Cut them in a third");
	gui.choice4.setText("Cut them in a quarter");
	
	game.nextPosition1 = "keep";
	game.nextPosition2 = "half";
	game.nextPosition3 = "third";	
	game.nextPosition4 = "quarter";
}

public void keep() {
	
	prot18 = 1;
	gui.Panel1Area.setText("Ryo: Are you sure sir?\n"
	+ "Sato: Yes,morale will be lowered without proper rationing.\n"
	+ "*It's dinner time*\n"
	+ "*Everyone gathers in order*\n"
	+ "*Everyone seems happy for now*\n"
	+ "*The days pass and the scavaging squad isn't back*\n"
	+ "*Everyone is starving*");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "keepend";
}

public void keepend() {
	
	gui.Panel1Area.setText("Nakamura: Where is the squad damn it?\n"
	+ "Sato: Maybe they are dead.\n"
	+ "Nakamura: Hope they are not we can't spare any men.\n"
	+ "Nakamura: And thanks to you we are totally starving.\n"
	+ "Sato: I'm sorry sir...\n"
	+ "Nakamura: What were you thinking?\n");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_continue3end";
}

public void half() {
	
	prot18 = 2;
	gui.Panel1Area.setText("Ryo: Are you sure sir?\n"
	+ "Sato: Yes,morale will be affected but at least we won't starve quickly.\n"
	+ "*Everyone gathers in order*\n"
	+ "*Everyone seems ok for now*\n"
	+ "The days pass and the scavaging squad isn't back*\n"
	+ "*Everyone is starting to starve*");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "keepend";
}

public void third() {
	
	prot18 = 3;
	gui.Panel1Area.setText("Ryo: Are you sure sir?\n"
	+ "Sato: Yes,morale will be lowered but we wont starve anytime soon.\n"
	+ "*Everyone gathers in order*\n"
	+ "*Everyone seems unhappy for now*\n"
	+ "The days pass and the scavaging squad isn't back*\n"
	+ "*Nobody is totally starving*");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "thirdend";
}

public void thirdend() {
	
	gui.Panel1Area.setText("Nakamura: Where is the squad damn it?\n"
	+ "Sato: Maybe they are dead.\n"
	+ "Nakamura: Hope they are not we can't spare any men.\n"
	+ "Nakamura: At least thanks to you we are not totally starving.\n"
	+ "Sato: Thank you sir.\n");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "chapter3Aa_continue3end";
}

public void quarter() {
	
	prot18 = 4;
	gui.Panel1Area.setText("Ryo: Are you sure sir?\n"
	+ "Sato: I'm afraid we are in a dire situation,we have to.\n"
	+ "*Everyone gathers in order*\n"
	+ "*Everyone seems mad for now*\n"
	+ "The days pass and the scavaging squad isn't back*\n"
	+ "*Nobody is totally starving*");
	
	gui.choice1.setText(">");
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "thirdend";
}
	
public void chapter3Aa_continue3end() {
	
	if(prot18 == 1)
	{
		gui.Panel1Area.setText("*5 days later*\n"
		+ "*An large band of raiders attack the base*\n"
		+ "You can barely man the posts.\n"
		+ "Everyone is weak due to your actions.\n"
		+ "The raider destroy the camp and everyone inside is dead.\n"
		+ "You are impaled on a stick and left to rot.\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else if(prot18 == 2)
	{
		gui.Panel1Area.setText("*5 days later*\n"
		+ "*An large band of raiders attack the base*\n"
		+ "You can man the posts.\n"
		+ "Your men are not weak but dishearted.\n"
		+ "After a long fight a fire breaks in camp and the raider prevail.\n"
		+ "You commit suicide to avoid being tortured.\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else if(prot18 == 3)
	{
		gui.Panel1Area.setText("*5 days later*\n"
		+ "*An large band of raiders attack the base*\n"
		+ "You can man the posts quickly.\n"
		+ "Your men are not so weak or dishearted.\n"
		+ "After a long fight you prevail.\n");
		
		gui.choice1.setText(">");
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");

		game.nextPosition1 = "counterattack";
	}
	else
	{
		gui.Panel1Area.setText("*5 days later*\n"
		+ "*An large band of raiders attack the base*\n"
		+ "You can man the posts slowly.\n"
		+ "Your men are weak but not dishearted.\n"
		+ "After a long fight you prevail.\n");
		
		gui.choice1.setText(">");
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");

		game.nextPosition1 = "counterattackfail";
	}
}

public void counterattack() {
	
	gui.Panel1Area.setText("*Few days pass...*\n"
	+ "You stage a counter attack and capture the raider base.\n"
	+ "It was full of supplies worth at least a month.\n"
	+ "Your men are happy and make you the leader.\n"
	+ "Until the Imperial army evacuates you.\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void counterattackfail() {
	
	gui.Panel1Area.setText("*Few days pass...*\n"
	+ "You can't stage a counter attack and capture the raider base.\n"
	+ "After a while the scavaging squad returns with some supplies.\n"
	+ "You continue to do your work.\n"
	+ "Until the Imperial army evacuates you.\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void survive1b() {
	
	gui.Panel1Area.setText("*You quietly leave the area*\n" 
	+ "*After a while walking you realise that walking in the dark is pointless*\n" 
	+"*You see four different places to rest until dawn*\n" 
	+"Where should I rest?"
	);
	
	gui.choice1.setText("Huge bush.");	
	gui.choice2.setText("At top of a tall tree.");
	gui.choice3.setText("Small hidden man sized cave.");
	gui.choice4.setText("Inside a log.");
	
	game.nextPosition1 = "survive1ba";
	game.nextPosition2 = "survive1bb";
	game.nextPosition3 = "survive1bb";	
	game.nextPosition4 = "survive1baa";
	
	
	
}

public void survive1ba() {
	
	player.insanity += 2;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*You hear noises around you all night and you cant sleep easy*\n\n"
	+"Prot:What i'm going to do now?");
	
	gui.choice1.setText("Hunt some food.");	
	gui.choice2.setText("Find some fruits.");
	gui.choice3.setText("Find a village.");
	gui.choice4.setText("Sleep again.");
	
	game.nextPosition1 = "survive1b_a";
	game.nextPosition2 = "survive1b_b";
	game.nextPosition3 = "survive1b_c";	
	game.nextPosition4 = "survive1b_d";
}

public void survive1baa() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*You hear noises around you all night and you cant sleep easy*\n\n"
	+"Prot:What i'm going to do now?");
	
	gui.choice1.setText("Hunt some food.");	
	gui.choice2.setText("Find some fruits.");
	gui.choice3.setText("Find a village.");
	gui.choice4.setText("Sleep again.");
	
	game.nextPosition1 = "survive1b_a";
	game.nextPosition2 = "survive1b_b";
	game.nextPosition3 = "survive1b_c";	
	game.nextPosition4 = "survive1b_d";
}

public void survive1bb() {
	
	gui.Panel1Area.setText("*You sleep a little bit easer knowing that no one can reach you easily.\n*"
	+"The next day arrives.\n\n"
	+"Prot:What i'm going to do now?");
	
	gui.choice1.setText("Hunt some food.");	
	gui.choice2.setText("Find some fruits.");
	gui.choice3.setText("Find a village.");
	gui.choice4.setText("Sleep again.");
	
	game.nextPosition1 = "survive1b_a";
	game.nextPosition2 = "survive1b_b";
	game.nextPosition3 = "survive1b_c";	
	game.nextPosition4 = "survive1b_d";
}

public void survive1b_a() {

	gui.Panel1Area.setText("*Hours pass by you haven't found a prey*\n" 
	+ "*Suddently you hear a noise*\n" + "*A boar charges at you*\n" 
	+"*Battle boar*\n" + "*It's dead finally food*\n" +"*You stand up and see a horde of almost a hundred zombies*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void survive1b_b() {

	player.insanity -= 3;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*After hour of searching you found enough fruits to eat*\n" 
	+ "*Suddently you see a horde of almost a hundred zombies*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void survive1b_c() {

	gui.Panel1Area.setText("*Scouting the area make you tired and you havent found anything yet*\n" 
	+ "*Suddently you see a horde of almost a hundred zombies*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void survive1b_d() {

	player.insanity += 5;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*You are waked by loud noise*\n" 
	+ "*You stand up and see a horde of almost a hundred zombies*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void survive1b_continue() {
	
	gui.Panel1Area.setText("Prot: What should i do?");
	
	gui.choice1.setText("Hide in a bush.");	
	gui.choice2.setText("Run away from them.");
	gui.choice3.setText("Fight them.");
	gui.choice4.setText("Do nothing.");
	
	game.nextPosition1 = "survive1b_continue2";
	game.nextPosition2 = "survive1b_continue3";
	game.nextPosition3 = "end1c";	
	game.nextPosition4 = "end1d";
}

public void survive1b_continue2() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*You stay still*\n" + "Protagonist:(my god the noises they make)\n" 
	+"*After a while it passes by, going west*\n" + "*You head south*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue4";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void survive1b_continue3() {
	
	gui.Panel1Area.setText("*You run away from the hord going south*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue4";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void survive1b_continue4() {
	
	gui.Panel1Area.setText("*While walking you spot a lone person talking*\n" 
	+"*He is holding a katana and is acting like a samurai*\n" + "*He hasnt spotted to you yet*\n"
	+"Prot: What should i do?");
	
	gui.choice1.setText("Leave him be.");	
	gui.choice2.setText("Try to talk to him.");
	gui.choice3.setText("Sneak attack him.");
	gui.choice4.setText("Challange honourably.");
	
	game.nextPosition1 = "leavekatana";
	game.nextPosition2 = "end1e";
	game.nextPosition3 = "fightforkatana1";	
	game.nextPosition4 = "fightforkatana2";
}

public void leavekatana() {
	
	gui.Panel1Area.setText("*You leave him there and continue walking*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue5";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void fightforkatana1() {
	
	gui.Panel1Area.setText("*You slice his throat*\n"+ "*His lifeless corpses collapses*\n\n" 
	+"*Weapon changes to Katana*");
	
	player.currentWeapon = new Weapon_Katana();
	gui.weaponLabelName.setText(player.currentWeapon.name);
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue5";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void fightforkatana2() {
	
	player.insanity += 5;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*He bows and then charges*\n"+ "*Mad samurai battle*\n" 
	+"*You manage to kill him*\n\n"
	+"*Weapon changes to Katana*");
	
	player.currentWeapon = new Weapon_Katana();
	gui.weaponLabelName.setText(player.currentWeapon.name);
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue5";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void survive1b_continue5() {
	
	gui.Panel1Area.setText("*After a while you see a small shack village*\n"
	+ "Prot: Now what?");
	
	gui.choice1.setText("Ask the villagers for help.");	
	gui.choice2.setText("Attack the guard.");
	gui.choice3.setText("Sneak inside now.");
	gui.choice4.setText("Sneak inside during the night.");
	
	game.nextPosition1 = "approachvillager";
	game.nextPosition2 = "attackguard";
	game.nextPosition3 = "sneakvillage";	
	game.nextPosition4 = "sneakvillagenight";
}

public void approachvillager() {
	
	gui.Panel1Area.setText("*You approach a villager and he hits you with a club*\n" 
	+"*You fall unconsious*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue6";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void attackguard() {
	
	player.insanity += 5;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*Battle VillageGuard*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "battle_villageguard";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void sneakvillage() {
	
	player.insanity += 5;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*You are spotted almost immediately*\n" 
	+"*Battle VillageGuard*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "battle_villageguard";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void sneakvillagenight() {
	
	player.insanity += 2;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*You try to sneak in but you trip a bell alarm*\n" 
	+"*The whole village wakes up and rallies to you you*\n" 
	+"*You try to run but a guard catches up on you*\n"
	+"*Battle VillageGuard*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "battle_villageguard";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void battle_villageguard() {
	
	gui.Panel1Area.setText("*You cut the village guard head with your Katana*\n" 
	+"*Another guard hit you from behind*\n" + "*You fall unconsious*");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "survive1b_continue6";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void survive1b_continue6() {
	
	gui.Panel1Area.setText("*You wake up in a prison*\n" + "Protagonist: What happened?");
	
	gui.choice1.setText("Should have left this place alone.");	
	gui.choice2.setText("I have to get out.");
	gui.choice3.setText("(Let's see who runs this place) GUARDS?");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "survive1b_continue7";
	game.nextPosition2 = "survive1b_continue7";
	game.nextPosition3 = "survive1b_continue7a";	
	game.nextPosition4 = "survive1b_continue7b";
}

public void survive1b_continue7() {
	
	player.insanity -= 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*A door opens*\n" + "*A tall elderly man enters*\n"
	+"VillageElder: Who are you?");
	
	gui.choice1.setText("Lieutenant Sato.");	
	gui.choice2.setText("Sato.");
	gui.choice3.setText("Mr Death.");
	gui.choice4.setText("Why are you asking?");
	
	game.nextPosition1 = "survive1b_continue8a";
	game.nextPosition2 = "survive1b_continue8a";
	game.nextPosition3 = "survive1b_continue8b";	
	game.nextPosition4 = "survive1b_continue8b";
}

public void survive1b_continue7a() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("*A door opens*\n" + "*A tall elderly man enters*\n"
	+"VillageElder: Who are you?");
	
	gui.choice1.setText("Lieutenant Sato.");	
	gui.choice2.setText("Sato.");
	gui.choice3.setText("Mr Death.");
	gui.choice4.setText("Why are you asking?");
	
	game.nextPosition1 = "survive1b_continue8a";
	game.nextPosition2 = "survive1b_continue8a";
	game.nextPosition3 = "survive1b_continue8b";	
	game.nextPosition4 = "survive1b_continue8b";
}

public void survive1b_continue7b() {
	
	gui.Panel1Area.setText("*A door opens*\n" + "*A tall elderly man enters*\n"
	+"VillageElder: Who are you?");
	
	gui.choice1.setText("Lieutenant Sato.");	
	gui.choice2.setText("Sato.");
	gui.choice3.setText("Mr Death.");
	gui.choice4.setText("Why are you asking?");
	
	game.nextPosition1 = "survive1b_continue8a";
	game.nextPosition2 = "survive1b_continue8a";
	game.nextPosition3 = "survive1b_continue8bb";	
	game.nextPosition4 = "survive1b_continue8b";
}

public void survive1b_continue8a() {
	
	player.insanity += 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("VillagerElder: How did you find us?");
	
	gui.choice1.setText("Running from a horde.");	
	gui.choice2.setText("Heard from someone about you(Lie)");
	gui.choice3.setText("By luck.");
	gui.choice4.setText("I watched your hunters(Lie)");
	
	game.nextPosition1 = "survive1b_continue9a";
	game.nextPosition2 = "survive1b_continue9c";
	game.nextPosition3 = "survive1b_continue9a";	
	game.nextPosition4 = "survive1b_continue9b";
}

public void survive1b_continue8b() {
	
	gui.Panel1Area.setText("VillagerElder: Daring aren't we?\n" + "VillagerElder: How did you find us?");
	
	gui.choice1.setText("Running from a horde.");	
	gui.choice2.setText("Heard from someone about you(Lie)");
	gui.choice3.setText("By luck.");
	gui.choice4.setText("I watched your hunters(Lie)");
	
	game.nextPosition1 = "survive1b_continue9a";
	game.nextPosition2 = "survive1b_continue9c";
	game.nextPosition3 = "survive1b_continue9a";	
	game.nextPosition4 = "survive1b_continue9b";
}

public void survive1b_continue8bb() {
	
	player.insanity += 3;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("VillagerElder: Daring aren't we?\n" + "VillagerElder: How did you find us?");
	
	gui.choice1.setText("Running from a horde.");	
	gui.choice2.setText("Heard from someone about you(Lie)");
	gui.choice3.setText("By luck.");
	gui.choice4.setText("I watched your hunters(Lie)");
	
	game.nextPosition1 = "survive1b_continue9a";
	game.nextPosition2 = "survive1b_continue9c";
	game.nextPosition3 = "survive1b_continue9a";	
	game.nextPosition4 = "survive1b_continue9b";
}

public void survive1b_continue9b() {
	
	gui.Panel1Area.setText("VillagerElder: Liar no one has left this village to hunt\n"
	+"VillagerElder: Impossible *continues rabbling about something*\n"
	+"Protagonist:Why are you so secretive?\n" + "VillagerElder: Because we are the Red Kuyshu Army!");
	
	gui.choice1.setText("Red as Communist?");	
	gui.choice2.setText("Red as Blood?");
	gui.choice3.setText("What?");
	gui.choice4.setText("Damn You Commie Traitor");
	
	game.nextPosition1 = "survive1b_continue10a";
	game.nextPosition2 = "survive1b_continue10b";
	game.nextPosition3 = "survive1b_continue10b";	
	game.nextPosition4 = "survive1b_continue10c";
}

public void survive1b_continue9c() {
	
	gui.Panel1Area.setText("VillagerElder: Liar we have been hidden from the outside world since 1936.\n"
	+"VillagerElder: Impossible *continues rabbling about something*\n"
	+"Protagonist:Why are you so secretive?\n" + "VillagerElder: Because we are the Red Kuyshu Army!");
	
	gui.choice1.setText("Red as Communist?");	
	gui.choice2.setText("Red as Blood?");
	gui.choice3.setText("What?");
	gui.choice4.setText("Damn You Commie Traitor");
	
	game.nextPosition1 = "survive1b_continue10a";
	game.nextPosition2 = "survive1b_continue10b";
	game.nextPosition3 = "survive1b_continue10b";	
	game.nextPosition4 = "survive1b_continue10c";
}

public void survive1b_continue9a() {
	
	gui.Panel1Area.setText("VillagerElder: Hmmmmmm interesting...\n"
	+"VillagerElder: Impossible *continues rabbling about something*\n"
	+"Protagonist:Why are you so secretive?\n" + "VillagerElder: Because we are the Red Kuyshu Army!");
	
	gui.choice1.setText("Red as Communist?");	
	gui.choice2.setText("Red as Blood?");
	gui.choice3.setText("What?");
	gui.choice4.setText("Damn You Commie Traitor");
	
	game.nextPosition1 = "survive1b_continue10a";
	game.nextPosition2 = "survive1b_continue10b";
	game.nextPosition3 = "survive1b_continue10d";	
	game.nextPosition4 = "survive1b_continue10c";
}

public void survive1b_continue10a() {
	
	player.insanity -= 1;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("VillagerElder: You are right.\n" +"VillagerElder: Anyways you have two choices join or die.\n"
	+"*Hand some food and water*\n" + "VillagerElder: Eat tomorrow i want an answer.\n"
	+"*He leaves the room*\n" + "Prot:What should i do?");
	
	gui.choice1.setText("Join them.");	
	gui.choice2.setText("Join them(Betray)");
	gui.choice3.setText("Escape.");
	gui.choice4.setText("Face death.");
	
	game.nextPosition1 = "chapter2ending_a";
	game.nextPosition2 = "chapter2ending_b";
	game.nextPosition3 = "chapter2ending_c";	
	game.nextPosition4 = "chapter2ending_d";
}

public void survive1b_continue10b() {
	
	player.insanity += 2;
    gui.hpNumberLabel.setText(player.insanity+"          ");
	
	gui.Panel1Area.setText("VillagerElder: Are stupid man? Damn it.\n" +"VillagerElder: Anyways you have two choices join or die.\n"
	+"*Hand some food and water*\n" + "VillagerElder: Eat tomorrow i want an answer.\n"
	+"*He leaves the room*\n" + "Prot:What should i do?");
	
	gui.choice1.setText("Join them.");	
	gui.choice2.setText("Join them(Betray)");
	gui.choice3.setText("Escape.");
	gui.choice4.setText("Face death.");
	
	game.nextPosition1 = "chapter2ending_a";
	game.nextPosition2 = "chapter2ending_b";
	game.nextPosition3 = "chapter2ending_c";	
	game.nextPosition4 = "chapter2ending_d";
}

public void survive1b_continue10d() {
	
	gui.Panel1Area.setText("VillagerElder: Are stupid man? Damn it.\n" +"VillagerElder: Anyways you have two choices join or die.\n"
	+"*Hand some food and water*\n" + "VillagerElder: Eat tomorrow i want an answer.\n"
	+"*He leaves the room*\n" + "Prot:What should i do?");
	
	gui.choice1.setText("Join them.");	
	gui.choice2.setText("Join them(Betray)");
	gui.choice3.setText("Escape.");
	gui.choice4.setText("Face death.");
	
	game.nextPosition1 = "chapter2ending_a";
	game.nextPosition2 = "chapter2ending_b";
	game.nextPosition3 = "chapter2ending_c";	
	game.nextPosition4 = "chapter2ending_d";
}

public void survive1b_continue10c() {
	
	gui.Panel1Area.setText("VillagerElder: Shut the fuck up!\n" +"VillagerElder: Anyways you have two choices join or die.\n"
	+"*Hand some food and water*\n" + "VillagerElder: Eat tomorrow i want an answer.\n"
	+"*He leaves the room*\n" + "Prot:What should i do?");
	
	gui.choice1.setText("Join them.");	
	gui.choice2.setText("Join them(Betray)");
	gui.choice3.setText("Escape.");
	gui.choice4.setText("Face death.");
	
	game.nextPosition1 = "chapter2ending_a";
	game.nextPosition2 = "chapter2ending_b";
	game.nextPosition3 = "chapter2ending_c";	
	game.nextPosition4 = "chapter2ending_d";
}

public void chapter2ending_a() {
	
	prot20 = 1;
	gui.Panel1Area.setText("*You eat the food and drink some water*\n" + "*After a while you fall asleep*\n\n\n" 
	+"*Chapter2 Ends*");
	
	gui.choice1.setText("Continue to Chapter3.");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "Chapter3";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void chapter2ending_b() {
	
	prot20 = 2;
	gui.Panel1Area.setText("*You eat the food and drink some water*\n" + "*After a while you fall asleep*\n\n\n" 
	+"*Chapter2 Ends*");
	
	gui.choice1.setText("Continue to Chapter3.");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "Chapter3";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void chapter2ending_c() {
	
	prot20 = 3;
	gui.Panel1Area.setText("*You eat the food and drink some water*\n" + "*After a while you fall asleep*\n\n\n" 
	+"*Chapter2 Ends*");
	
	gui.choice1.setText("Continue to Chapter3.");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "Chapter3";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void chapter2ending_d() {
	
	prot20 = 4;
	gui.Panel1Area.setText("*You eat the food and drink some water*\n" + "*After a while you fall asleep*\n\n\n" 
	+"*Chapter2 Ends*");
	
	gui.choice1.setText("Continue to Chapter3.");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "Chapter3";
	game.nextPosition2 = "";
	game.nextPosition3 = "";	
	game.nextPosition4 = "";
}

public void Chapter3() {
	
	if(prot20 == 3)
	{
		gui.Panel1Area.setText("*Chapter 3*\n"
		+ "After an hour or less you wake up.\n"
		+ "You manage to get your hands free.\n"
		+ "You reach and grap your weapon.\n"
		+ "And after a few swings you break your cage.\n"
		+ "Sato:What should i do?");
		
		gui.choice1.setText("Exit through the window and sneak out");	
		gui.choice2.setText("Exit through the door and sneak out");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "window";
		game.nextPosition2 = "door";

	}
	else if(prot20 == 1)
	{
		gui.Panel1Area.setText("*Chapter 3*\n"
		+ "*dawn arrives*\n"
		+ "*the door burst and the Elder enters*\n"
		+ "VillagerElder: So...what did you decide?\n"
		+ "Sato: I will join you.\n"
		+ "VillagerElder: They always do...\n"
		+ "VillagerElder: Let's go eat something I'll brief you on the way.\n");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "alt2_19a";

	}
	else if(prot20 == 2)
	{
		gui.Panel1Area.setText("*Chapter 3*\n"
		+ "*dawn arrives*\n"
		+ "*the door burst and the Elder enters*\n"
		+ "VillagerElder: So...what did you decide?\n"
		+ "Sato: I will join you.\n"
		+ "VillagerElder: They always do...\n"
		+ "VillagerElder: Let's go eat something I'll brief you on the way.\n");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "alt2_19a";
	}
	else
	{
		gui.Panel1Area.setText("*Chapter 3*\n"
		+ "*dawn arrives*\n"
		+ "*the door burst and the Elder enters*\n"
		+ "VillagerElder: So...what did you decide?\n"
		+ "Sato: I won't join you.\n"
		+ "VillagerElder: So...better dead than red?\n"
		+ "They are dragging you to a hill handcuffed and blindfolded.\n"
		+ "They scream insults on the way there.");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "alt2_19d";
	}
}

public void alt2_19d() {
	
	if(player.insanity <= 5)
	{
		gui.Panel1Area.setText("Sato: I hope you die a quick and painless death...\n"
		+ "VillagerElder: Very well.\n"
		+ "The firing squad fires a volley.\n"
		+ "And you are dead!\n\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);	
		gui.choice2.setVisible(false);	
		gui.choice3.setVisible(false);	
		gui.choice4.setVisible(false);		
	}
	else if(player.insanity > 5 && player.insanity <= 15)
	{
		gui.Panel1Area.setText("Sato: Your goals are pointless,you are fighting for a cause which is unachievable.\n"
		+ "VillagerElder: We might as well be...\n"
		+ "The firing squad takes a step back.\n"
		+ "The Elder draws his sword and swings it.\n"
		+ "Your head falls on the ground and you are left there to feed the zombies.\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);	
		gui.choice2.setVisible(false);	
		gui.choice3.setVisible(false);	
		gui.choice4.setVisible(false);	
	}
	else
	{
		gui.Panel1Area.setText("Sato: I hope you rot,you filthy commie traitor bastards!\n"
		+ "VillagerElder:We are going to enjoy this one.\n"
		+ "The firing squad takes a step back and holster their weapons.\n"
		+ "They draw their knifes and start stabbing you.\n"
		+ "After a while while you are still alive they cut your hands.\n"
		+ "And before you draw your final breath they slit your throat.\n"
		+ "You are quartered and displayed on pikes surrounding the village.\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);	
		gui.choice2.setVisible(false);	
		gui.choice3.setVisible(false);	
		gui.choice4.setVisible(false);	
	}
}

public void window() {
	
	gui.Panel1Area.setText("You exit through the window.\n"
	+ "Guard: Well,well,well.We knew you try something funny.\n"
	+ "*Fight Rebel Guard*\n"
	+ "You kill him and run to the forest."
	+ "Eventually you run into a horde and you are eaten by it.\n"
	+ "You become a zombie.\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void door() {
	
	if(player.insanity < 5)
	{
		gui.Panel1Area.setText("You exit the door without a problem and sneak out.\n"
		+ "You just leave the village alone and just wander alone for a while.\n"
		+ "You find a ship and manage to leave this island.\n\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else if(player.insanity > 5 && player.insanity <= 15)
	{
		gui.Panel1Area.setText("You exit the door without a problem and sneak out.\n"
		+ "You are sneaking around the village.\n"
		+ "You find the Elder's Hut.\n"
		+ "You enter it and slit his throat.\n"
		+ "The you grap a torch and start some fire around the village.\n"
		+ "Until you are spotted and kill on sight.\n"
		+ "THE END!!!");
		
		gui.choice1.setVisible(false);
		gui.choice2.setVisible(false);
		gui.choice3.setVisible(false);
		gui.choice4.setVisible(false);
	}
	else
	{
		if(player.currentWeapon.name.equals("Katana"))
		{
			gui.Panel1Area.setText("You exit the door without a problem and sneak out.\n"
			+ "You sneak around entering huts and killing people.\n"
			+ "Sato: (You all die...)\n"
			+ "Everyone in the village is dead.\n"
			+ "You leave the village and wander in the jungle.\n"
			+ "You become a honourable samurai killing zombies.\n"
			+ "Until one day you fall sick and die alone.\n"
			+ "THE END!!!");
			
			gui.choice1.setVisible(false);
			gui.choice2.setVisible(false);
			gui.choice3.setVisible(false);
			gui.choice4.setVisible(false);
		}
		else
		{
			gui.Panel1Area.setText("You exit the door without a problem and sneak out.\n"
			+ "You sneak around entering huts and killing people.\n"
			+ "Sato: (You all die...)\n"
			+ "Everyone in the village is dead.\n"
			+ "You leave the village and wander in the jungle.\n"			
			+ "Until one day you fall sick and die alone.\n"
			+ "THE END!!!");
			
			gui.choice1.setVisible(false);
			gui.choice2.setVisible(false);
			gui.choice3.setVisible(false);
			gui.choice4.setVisible(false);
		}
	}
}

public void alt2_19a() {
	
	gui.Panel1Area.setText("*He opens your cage and you start walking*\n"
	+ "VillagerElder: First of all my name is Taiyo.\n"
	+ "Taiyo: Today we will attack a rival camp.\n"
	+ "Taiyo: We had some clashes but they don't know where we are based.\n"
	+ "Taiyo: But we do... And we also know their numbers...");
	
	gui.choice1.setText("What about us?");	
	gui.choice2.setText("I agree with you attacking now is wise");
	gui.choice3.setText("What about them?The must be unique if they are still alive.");
	gui.choice4.setText("...");
	
	game.nextPosition1 = "alt2_20a";
	game.nextPosition2 = "alt2_20a";
	game.nextPosition3 = "alt2_20a";	
	game.nextPosition4 = "alt2_20a";
}

public void alt2_20a() {
	
	gui.Panel1Area.setText("Taiyo: We outnumber them but their are ex-military.\n"
	+ "Sato: (Maybe it's my unit they survived the bombing?)\n"
	+ "Taiyo: We got no time to waste the sun is almost up go eat.\n"
	+ "Taiyo: EVERYONE COME HERE!\n"
	+ "Taiyo: TODAY WE ATTACK THE FASCISTS!\n"
	+ "Taiyo: LONG LIVE COMRADE STALIN!\n");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "alt2_20a_con";

}

public void alt2_20a_con() {
	
	if(prot20 == 1)
	{
	gui.Panel1Area.setText("*crowd shouting the chant back*\n"
	+ "Taiyo: LET'S GO!\n"
	+ "*you walk for about half an hour*\n"
	+ "Taiyo: We are here men...\n"
	+ "Taiyo: What do you advice man?");
	
	gui.choice1.setText("Enter the base and surprise them");	
	gui.choice2.setText("Frontal attack");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "alt2_20a_end1";
	game.nextPosition2 = "alt2_20a_end2";
	}
	else
	{
		gui.Panel1Area.setText("*crowd shouting the chant back*\n"
		+ "Taiyo: How should we approach?\n"
		+ "Sato: Let me and 3 men enter and spread chaos from the inside\n"
		+ "Sato:If you hear any shouts attack.\n"
		+ "Taiyo:Very well...Go...\n"
		+ "You enter the camp and instantly kill 2 of your men.\n"
		+ "*battle Commie Rebel*\n");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "alt2_20b_end1";

	}
}

public void alt2_20b_end1() {
	
	gui.Panel1Area.setText("Sato:Shhh commie piece of shit...\n"
	+ "You enter a tent and grap a sleeping soldier.\n"
	+ "Sato: Take me to your superior.Don't speak!\n"
	+ "He takes you there without anyone noticing.\n"
	+ "You enter the camp and see Cpt.Nakamura in distress.\n"
	+ "Cpt.Nakamura:What is going on?\n"
	+ "Sato:It's me Sato,I bring bad news.\n");
	
	gui.choice1.setText(">");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	game.nextPosition1 = "alt2_20b_end1_con";

}

public void alt2_20b_end1_con() {
	
	if(player.insanity <= 5)
	{
		gui.Panel1Area.setText("Cpt.Nakamura: SATO?I thought you were dead?\n"
		+ "Sato:We have no time now an army of rebels is nearby ready to attack.\n"
		+ "Cpt.Nakamura: What how many?\n"
		+ "Sato: Almost 30 poorly equipped and don't raise the alarm they will attack\n"
		+ "Cpt.Nakamura: Alright what should we do?\n"
		+ "Sato: With 4 men we attack them from behind the lines while you attack from the front\n");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "alt2_20b_end1_cona";
	
	}
	else if(player.insanity > 5 && player.insanity <= 15)
	{
		gui.Panel1Area.setText("Sato: With 4 men we attack them from behind the lines.\n"
		+ "Cpt.Nakamura: Nice idea Sato.Go quickly.\n"
		+ "Cpt.Nakamura: And take this*hands submachinegun*\n"
		+ "You take your position and fire.\n"
		+ "The fight is tough.Quality clashes with quantity.\n"
		+ "You spot Taiyo and charge at him.\n"
		+ "Taiyo:You did this,traitor!");
		
		
	    gui.weaponLabelName.setText("Submachine Gun");
		
		gui.choice1.setText("Battle Taiyo with submachine");	
		gui.choice2.setText("Battle Taiyo with Katana");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "win_Taiyo";
		game.nextPosition2 = "lose_Taiyo";
	}
	else
	{
		gui.Panel1Area.setText("Sato: They are poorly equiped,let's go guns blazing.\n"
		+ "Cpt.Nakamura: If you say so...?\n"
		+ "Cpt.Nakamura: And take this*hands submachinegun*\n"
		+ "You open the gates and charge at them.\n"
		+ "You throw your bombs and fire machineguns.\n"
		+ "Every rebel is dead except Taiyo.\n"
		+ "Sato:Let him live he is mine!");
		
		gui.weaponLabelName.setText("Submachine Gun");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "force_win";

	}
}

public void force_win() {
	
	gui.Panel1Area.setText("Cpt.Nakamura: Damn man what going on with you?\n"
	+ "Sato: What did you say?\n"
	+ "*Starts shooting at your squad*\n"
	+ "You enter the camp and the few men there surrender to you.\n"
	+ "After that you return to the village and enslave the villagers.\n"
	+ "You become a raider baron for the rest of your life.\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);	
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void win_Taiyo() {
	
	gui.Panel1Area.setText("You killed Taiyo.\n"
	+ "The rebels are beaten after a long battle.\n"
	+ "You are the only survivor of your squad.\n"
	+ "As you enter your camp the dead rise.\n"
	+ "And a second battle begins.\n"
	+ "But you are undermaned and exhausted.\n"
	+ "The zombies ate you all.\n"
	+ "You are part of the horde now.\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);	
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void lose_Taiyo() {
	
	gui.Panel1Area.setText("Taiyo:You die pig!\n"
	+ "Taiyo swing his sword and opens your guts.\n"
	+ "The battle continues and no side is making any advanced.\n"
	+ "In the meanwhile the dead rise and chaos sets in.\n"
	+ "Both sides are eaten by the horde.\n\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);	
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void alt2_20b_end1_cona() {
	

	gui.Panel1Area.setText("Cpt.Nakamura: Nice idea Sato,surround them like cattle.Go quickly.\n"
	+ "Cpt.Nakamura: And take this*hands submachinegun*\n"
	+ "You sneak out ,take position and open fire.\n"
	+ "A battle starts and you confront Taiyo.\n"
	+ "Taiyo: You backstabbing bastard!\n"
	+ "Sato:You die now pig!\n"
	+ "You kill Taiyo and the battle is over.\n"
	+ "All the rebels lay dead.\n"
	+ "You join the rest of your unit.\n"
	+ "After some months the Imperial army evacuates you.\n"
	+ "THE END!!!");
	
	gui.weaponLabelName.setText("Submachine Gun");
	
	gui.choice1.setVisible(false);	
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);

}

public void alt2_20a_end1() {
	
	if(player.insanity < 5)
	{
		gui.Panel1Area.setText("Taiyo: And after you enter what?\n"
		+ "Sato: We slit their throats.\n"
		+ "Taiyo: Very well...\n"
		+ "You infiltrate the camp with 3 men as the other stand by.\n"
		+ "You kill some men but someone notices you and the alarm is raised.\n"
		+ "Cpt.Nakamura: What is going on? Sato?\n"
		+ "Sato: Sorry Captain...");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "alt2_20a_end1_a";
	}
	else if(player.insanity > 5 && player.insanity <= 15)
	{
		gui.Panel1Area.setText("Taiyo: And after you enter what?\n"
		+ "Sato:We set the place on fire while you attack from the front and rear.\n"
		+ "Taiyo:Better us than them.\n"
		+ "You infiltrate the camp with 3 men as the other stand by.\n"
		+ "You set some tents on fire and the others attack as well.\n"
		+ "The soldiers panic and their superior is trying to control them.\n"
		+ "You see his face...");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "alt2_20a_end1_b";
	}
	else
	{
		gui.Panel1Area.setText("Sato: I'll enter the camp kill some people and wait for them to turn.\n"
		+ "Sato: Then we attack while panic sets in.\n"
		+ "Taiyo: Clever thinking let them fight their own while we finish them.\n"
		+ "You enter the camp and you kill then hide their bodies.\n"
		+ "After some hour you hear scream and you attack en masse.\n"
		+ "It's a massacre on both sides.\n"
		+ "A horde appears.\n"
		+ "You just collect some of their weapons and leave the camp.");
		
		gui.choice1.setText(">");	
		gui.choice2.setText("");
		gui.choice3.setText("");
		gui.choice4.setText("");
		
		game.nextPosition1 = "endz";

	}
}

public void endz() {
	
	
	gui.Panel1Area.setText("Your control over kuyshu is limited.\n"
	+ "After some months the army arrives and the battle for control begins.\n"
	+ "The battle is lost...\n"
	+ "You are killed the day the forces surround your village.\n\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void alt2_20a_end1_a() {
	
	gui.Panel1Area.setText("*Battle Cpt.Nakamura*");
	
	gui.choice1.setText("Fight with anger and fear");	
	gui.choice2.setText("Fight with courage");
	gui.choice3.setText("Fight sneaky");
	gui.choice4.setText("Fight with honour");
	
	game.nextPosition1 = "alt2_lose";
	game.nextPosition2 = "alt2_win";
	game.nextPosition3 = "alt2_lose";
	game.nextPosition4 = "alt2_lose";
}

public void alt2_win() {
	
	gui.Panel1Area.setText("You kill your old captain and the rest surrender to you.\n"
	+ "You bring them back along with their weapons and they join you.\n"
	+ "Soon after the army arrives and the battle for control begins.\n"
	+ "You manage to limit them to a beach and convice them to join you as well.\n"
	+ "You have won!\n"
	+ "Long live the reds!!!\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void alt2_lose() {
	
	gui.Panel1Area.setText("Cpt.Nakamura:What were you thinking man?\n"
	+ "Sato:I said sorry captain.\n"
	+ "Nakamura shots you and killing you in the process while crying.\n"
	+ "You manage to limit them to a beach and convice them to join you as well.\n\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void alt2_20a_end1_b() {
	
	gui.Panel1Area.setText("Sato: CPT.NAKAMURA!\n"
	+ "Cpt.Nakamura: SATO,YOU ARE DEAD MAN!\n"
	+ "*Battle Cpt.Nakamura*");
	
	gui.choice1.setText("Fight with anger and fear");	
	gui.choice2.setText("Fight with courage");
	gui.choice3.setText("Fight sneaky");
	gui.choice4.setText("Fight with honour");
	
	game.nextPosition1 = "alt2_lose1";
	game.nextPosition2 = "alt2_win1";
	game.nextPosition3 = "alt2_lose1";
	game.nextPosition4 = "alt2_lose1";
}

public void alt2_win1() {
	
	gui.Panel1Area.setText("You kill your old captain and the rest of his soldiers.\n"
	+ "You just collect their weapons and leave the camp on fire.\n"
	+ "Your control over kuyshu is unstable.\n"
	+ "After some months the army arrives and the battle for control begins.\n"
	+ "The battle is a stalemate.\n"
	+ "The rest of your days are wasted fight a war that won't end anytime soon...\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void alt2_lose1() {
	
	gui.Panel1Area.setText("Cpt.Nakamura:YOU TRAITOR!\n"
	+ "Sato:*spits on his face*\n"
	+ "Nakamura shots you and killing you in the process.\n"
	+ "Nakmura spits back.\n\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void alt2_20a_end2() {
	
	gui.Panel1Area.setText("You charge the base.\n"
	+ "You are all spotted.\n"
	+ "You start screaming insults.\n"
	+ "A machinegun starts firing half the men fall dead as the other lay wounded or flee.\n"
	+ "You are among the dead.\n\n"
	+ "THE END!!!");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}


public void end1c() {
	
	gui.Panel1Area.setText("*The horde eat you as fast as you charge at them*\n" 
	+ "*You are dead*\n\n" +"GAME OVER!!!");
			
	gui.choice1.setText("");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void end1d() {
	
	gui.Panel1Area.setText("*You froze from the size of the horde and the horde just ate you*\n" 
	+ "*You are dead*\n\n" +"GAME OVER!!!");
			
	gui.choice1.setText("");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

public void end1e() {
	
	gui.Panel1Area.setText("*You approach him and he slices your throat*\n" 
	+ "*You are dead*\n\n" +"GAME OVER!!!");
			
	gui.choice1.setText("");	
	gui.choice2.setText("");
	gui.choice3.setText("");
	gui.choice4.setText("");
	
	gui.choice1.setVisible(false);
	gui.choice2.setVisible(false);
	gui.choice3.setVisible(false);
	gui.choice4.setVisible(false);
}

	public void toTitle() {
		
		defaultSetup();
	}
}
