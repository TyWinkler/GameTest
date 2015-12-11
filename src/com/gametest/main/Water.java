package com.gametest.main;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Water extends WorldObject{

	public Water(int x, int y) {
		super(x, y);
	}

	@Override
	public void render(Graphics g) {
		int renderX = (this.x - GameObject.playerX) + 160;
		int renderY = (this.y - GameObject.playerY) + 160;
		Graphics2D g2;
		g2 = (Graphics2D)g;
		g2.drawImage(Images.water1, renderX, renderY, null);
	}

}