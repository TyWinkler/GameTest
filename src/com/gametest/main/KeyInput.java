package com.gametest.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

	private Handler handler;
	public static boolean goUp, goDown, goRight, goLeft;
	
	public KeyInput(Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getID() == ID.Player){
				switch (e.getKeyCode()) {
	                case KeyEvent.VK_W:  	goUp 		= true; break;
	                case KeyEvent.VK_S: 	goDown 		= true; break;
	                case KeyEvent.VK_A:  	goLeft 		= true; break;
	                case KeyEvent.VK_D: 	goRight  	= true; break;
				}
			}
		}
	}
	
	public void keyReleased(KeyEvent e){
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getID() == ID.Player){
				switch (e.getKeyCode()) {
	                case KeyEvent.VK_W:  	goUp 		= false; break;
	                case KeyEvent.VK_S: 	goDown 		= false; break;
	                case KeyEvent.VK_A:  	goLeft 		= false; break;
	                case KeyEvent.VK_D: 	goRight  	= false; break;
				}
			}
		}
	}
}
