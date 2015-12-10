package com.gametest.main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Images {

	private static final long serialVersionUID = 4360529904558306174L;
	
	
	public static Image player;
	
	Images(){
		try{
            File img1 = new File("images/objects/player.png");
            player = ImageIO.read(img1);
        }
        catch (IOException e){
            e.printStackTrace();
        }
	}
}
