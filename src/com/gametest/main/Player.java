package com.gametest.main;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Player extends GameObject {

	public Player(int x, int y, ID id) {
		super(x, y, id);
		playerX = x;
		playerY = y;
	}

	@Override
	public void tick() {
		if(KeyInput.goUp){
			this.y -= 4;
		}
		if(KeyInput.goDown){
			this.y += 4;
		}
		if(KeyInput.goLeft){
			this.x -= 4;
		}
		if(KeyInput.goRight){
			this.x += 4;
		}
		x = Game.clamp(x, 0, Game.WORLDWIDTH);
		y = Game.clamp(y, 0, Game.WORLDHEIGHT);
		playerX = x;
		playerY = y;
	}

	@Override
	public void render(Graphics g) {
		Graphics2D g2;
		g2 = (Graphics2D)g;
		g2.drawImage(Images.player, 160, 160, null);
	}

}
