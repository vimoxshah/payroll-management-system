package main;

import java.awt.Color;

import com.thehowtotutorial.splashscreen.JSplash;

public class SplashPms {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		JSplash  splash  = new JSplash(SplashPms.class.getResource("pms.jpg"), true, true, false, "v 1.0",null,Color.RED,Color.BLACK);
		
		splash.splashOn();
		
		splash.setProgress(20,"Initializing...");
		try {
			Thread.sleep(2500);
		 

		splash.setProgress(40,"Loading...");
		Thread.sleep(1500);
		

		splash.setProgress(60,"Config...");
		Thread.sleep(750);

		splash.setProgress(80,"Starting Application...");
		Thread.sleep(1000);
		
		splash.splashOff();
	}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	new Home().setTitle("Home");
	//	new Home().setVisible(true);
		
		Login l = new Login();
		
		
	

		
		
		
	}

}
