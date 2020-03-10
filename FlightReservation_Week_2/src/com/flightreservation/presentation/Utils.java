package com.flightreservation.presentation;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Utils {
	
	public static void centerScreen(Component c) {
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		Dimension framesize = c.getSize();
		
		if(framesize.height > windowSize.height) {
			framesize.height=windowSize.height;
		}
		if(framesize.width > windowSize.width) {
			framesize.width = windowSize.width;
		}
		
		c.setLocation((windowSize.width-framesize.width)/2, (windowSize.height-framesize.height)/2);
	}
	
	
	public void displayErrorMessage(Exception e){

		DialogBox dialogBox = new DialogBox("Error",
		                                             e.getMessage() != null ?
		                                             e.getMessage() : "Error occurred");
		  Utils.centerScreen(dialogBox);
		    e.printStackTrace();
		    dialogBox.setModal(true);
		    dialogBox.show();

		}


}
