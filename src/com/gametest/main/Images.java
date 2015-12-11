package com.gametest.main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Images {

	public static Image player;
	public static Image enemy;
	public static Image wall1;
	public static Image grass1;
	public static Image water1;
	public static Image path;
	
	Images(){
		try{
            File img1 = new File("images/objects/player.png");
            player = ImageIO.read(img1);
            img1 = new File("images/objects/enemy.png");
            enemy = ImageIO.read(img1);
            img1 = new File("images/world/wall1.png");
            wall1 = ImageIO.read(img1);
            img1 = new File("images/world/grass1.png");
            grass1 = ImageIO.read(img1);
            img1 = new File("images/world/water1.png");
            water1 = ImageIO.read(img1);
            img1 = new File("images/world/path.png");
            path = ImageIO.read(img1);
        }
        catch (IOException e){
            e.printStackTrace();
        }
	}
}
