package com.gametest.main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Handler {

	ArrayList<GameObject> object = new ArrayList<GameObject>();
	ArrayList<WorldObject> world = new ArrayList<WorldObject>();
	
	public void tick(){
		for(GameObject object : object){
			object.tick();
		}
	}
	
	public void render(Graphics g){
		for(WorldObject world : world){
			if(world.getX() > GameObject.playerX - 160 && world.getX() < GameObject.playerX + 160 &&
			   world.getY() > GameObject.playerY - 160 && world.getY() < GameObject.playerY + 160){
				world.render(g);
			}
		}
		for(GameObject object : object){
			if(object.getX() > GameObject.playerX - 160 && object.getX() < GameObject.playerX + 160 &&
			   object.getY() > GameObject.playerY - 160 && object.getY() < GameObject.playerY + 160){
				object.render(g);
			}
		}
	}
	
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
	public void addWorldObject(WorldObject world){
		this.world.add(world);
	}
	
	public void removeWorldObject(WorldObject world){
		this.world.remove(world);
	}
	
}
