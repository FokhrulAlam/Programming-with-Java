package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		//Set properties of the frame
		JFrame obj = new JFrame();		//Instantiate JFrame
		GamePlay gamePlay = new GamePlay();		//create object of GamePlay
		obj.setBounds(10, 10, 700, 600);	//boundary of frame
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);		//user can not resize the frame
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);	//Add gameplay panel to the frame
		
	}

}
