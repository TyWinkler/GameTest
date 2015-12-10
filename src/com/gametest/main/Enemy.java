package com.gametest.main;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Enemy extends GameObject {

	public Enemy(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		int renderX = (this.x - GameObject.playerX) + 160;
		int renderY = (this.y - GameObject.playerY) + 160;
		Graphics2D g2;
		g2 = (Graphics2D)g;
		g2.drawImage(Images.enemy, renderX, renderY, null);
	}

}