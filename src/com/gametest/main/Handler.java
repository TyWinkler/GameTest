package com.gametest.main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Handler {

	ArrayList<GameObject> object = new ArrayList<GameObject>();
	
	public void tick(){
		for(GameObject object : object){
			object.tick();
		}
	}
	
	public void render(Graphics g){
		for(GameObject object : object){
			object.render(g);
		}
	}
	
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
	
}
