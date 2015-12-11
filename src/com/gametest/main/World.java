package com.gametest.main;

public class World {

	public World(Handler handler){
		for(int i = 32; i < Game.WORLDWIDTH - 32; i += 32){
			for(int j = 32; j < Game.WORLDHEIGHT; j += 32){
				handler.addWorldObject(new Grass(i, j));
			}
		}
		for(int i = 0; i < Game.WORLDWIDTH; i += 32){
			handler.addWorldObject(new Wall(i, 0));
		}
		for(int i = 0; i < Game.WORLDWIDTH; i += 32){
			handler.addWorldObject(new Wall(i, Game.WORLDHEIGHT));
		}
		for(int i = 0; i < Game.WORLDHEIGHT; i += 32){
			handler.addWorldObject(new Wall(0, i));
		}
		for(int i = 0; i < Game.WORLDHEIGHT; i += 32){
			handler.addWorldObject(new Wall(Game.WORLDWIDTH-32, i));
		}
	}
	
}
