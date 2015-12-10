package com.gametest.main;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Player extends GameObject {

	public Player(int x, int y, ID id) {
		super(x, y, id);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		Graphics2D g2;
		g2 = (Graphics2D)g;
		g2.drawImage(Images.player, x, y, null);
	}

}
