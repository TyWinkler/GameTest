package com.gametest.main;

import java.awt.Graphics;

public abstract class WorldObject {

	protected int x, y;
	
	public WorldObject(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public abstract void render(Graphics g);
	
	public boolean canWalkThrough(){
		return false;
	}
	
	/*public boolean isVisible(){
		return false;
	}*/
	
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
