package main;

import javafx.application.Application;
import gui.*;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) {
	    launch(args);
	 }
	
	 public void start(Stage primaryStage) {
		 new FahrradGeschaeftControl(primaryStage);
	 }
	  
	 
}
