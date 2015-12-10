package com.gametest.main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Images {

	public static Image player;
	public static Image enemy;
	
	Images(){
		try{
            File img1 = new File("images/objects/player.png");
            player = ImageIO.read(img1);
            img1 = new File("images/objects/enemy.png");
            enemy = ImageIO.read(img1);
        }
        catch (IOException e){
            e.printStackTrace();
        }
	}
}
