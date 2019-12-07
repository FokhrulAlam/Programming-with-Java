package brickBreaker;

import java.awt.ActiveEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class GamePlay extends JPanel implements KeyListener,ActionListener{

	//Set properties
	private boolean play = false;	//whether the player performs any action or not
	private int score = 0;
	
	private int totalBricks = 21;
	
	private Timer timer;		//Reference of Timer class
	private int delay = 8;		//speed of the ball
	
	private int playerX = 310;	//Initial position of the player
	
	private int ballPosX = 120;
	private int ballPosY = 350;
	private int ballXdir = -1;		//direction of ball
	private int ballYdir = -2;
	
	private MapGenerator map;
	//Create constructor
	public GamePlay() {
		map = new MapGenerator(3,7);	//Number of rows and columns for bricks
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);	//object of Timer class
		timer.start();
	}
	
	public void paint(Graphics g) {
		//background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);		//fills this rectangle with black color
		
		//drawing map
		map.draw((Graphics2D)g);
		
		//borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		
		// scores
		g.setColor(Color.white);
		g.setFont(new Font("serif", Font.BOLD, 25));
		g.drawString(""+score, 590, 30);
		
		//the paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);
		
		//the ball
		g.setColor(Color.yellow);
		g.fillRect(ballPosX, ballPosY, 20, 20);
		
		//When the game will stop automatically
		if(totalBricks <= 0) {
			play = false;
			ballXdir = 0;
			ballYdir = 0;
			g.setColor(Color.RED);
			g.setFont(new Font("serif", Font.BOLD, 30));
			g.drawString("You Won!", 260, 300);
			
			g.setFont(new Font("serif", Font.BOLD, 20));
			g.drawString("Press Enter to Restart", 230, 350);
		}
		
		if(ballPosY > 570) {
			play = false;
			ballXdir = 0;
			ballYdir = 0;
			g.setColor(Color.RED);
			g.setFont(new Font("serif", Font.BOLD, 30));
			g.drawString("Game Over, Scores: "+ score, 190, 300);
			
			g.setFont(new Font("serif", Font.BOLD, 20));
			g.drawString("Press Enter to Restart", 230, 350);
		}
		
		g.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		//If player hits left arrow key or right arrow key
		if(play) {
			//if ball touches the paddle, promts the ball to go up
			if(new Rectangle(ballPosX, ballPosY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
				ballYdir = -ballYdir;
			}
			
			A: for (int i = 0; i<map.map.length; i++) {
				for (int j = 0; j<map.map[0].length; j++) {
					if (map.map[i][j] > 0) {
						int brickX = j* map.brickWidth + 80;
						int brickY = i* map.brickHeight + 50;
						int brickWidth = map.brickWidth;
						int brickHeight = map.brickHeight;
						
						Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
						Rectangle ballRect = new Rectangle(ballPosX, ballPosY, 20, 20);
						Rectangle brickRect = rect;
						
						if (ballRect.intersects(brickRect)) {
							map.setBrickValue(0, i, j);
							totalBricks--;
							score += 5;
							if (ballPosX + 19 <= brickRect.x | ballPosX + 1 >= brickRect.x + brickRect.width) {
								ballXdir = -ballXdir;
							}
							else {
								ballYdir = -ballYdir;
							}
							
							break A;	//A break level is created above
						}
					}
				}
			}
			//change the position of ball
				ballPosX += ballXdir;
				ballPosY += ballYdir;
				//Left border
				if (ballPosX < 0) {
					ballXdir = -ballXdir;
				}
				//top border
				if (ballPosY < 0) {
					ballYdir = -ballYdir;
				}
				//right border
				if (ballPosX > 670) {
					ballXdir = -ballXdir;
				}
			}
		repaint();		//calls the paint method each time an action is performed
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//if key code matches the code of Right Arrow Key of keyboard
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			//We don't want the player to go outside the border
			if (playerX >= 600) {
				playerX = 600;
			}
			//if pressing the right arrow key does not move the player outside border
			else {
				moveRight();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			//We don't want the player to go outside the border
			//If playerX is about to be less than equal to 10, it will be 10
			if (playerX <= 10) {		//For the left side.
				playerX = 10;
			}
			//if pressing the left arrow key does not move the player outside border
			//playerX will decrease
			else {
				moveLeft();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(!play) {
				play = true;
				ballPosX = 120;
				ballPosY = 350;
				ballXdir = -1;
				ballYdir = -2;
				playerX = 310;
				score = 0;
				totalBricks = 21;
				map = new MapGenerator(3, 7);
				
				repaint();
			}
		}
		
	}
	
	//Create moveRight method
	public void moveRight() {
		play = true;	//Lets the player play
		playerX += 20;	//Position increases by 20 to the right side
	}
	//Create the moveLeft method
	public void moveLeft() {
		play = true;
		playerX -= 20;	//Position decreases by 20 to the left
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
