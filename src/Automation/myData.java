package Automation;

import java.util.Random;

public class myData {
     Random rand =new Random();
    String [] firstNames = {"baraa","maha","dan","reem","rasha","ahmad"};	
	
	String[]  lastNames = {"samer","belal","ammar","amer","mahmoud","laith"};
	
	int randomNumberForTheEmail= rand.nextInt(19876);
	String domain ="@gamail.com";
	
	int randomFirstNamIndex = rand.nextInt(firstNames.length);
	int randomlastNamIndex = rand.nextInt( lastNames.length);
	
	String TheFirstName =  firstNames[randomFirstNamIndex];
	String TheLastName = lastNames[randomlastNamIndex];
	String TheEmail = TheFirstName+TheLastName+randomNumberForTheEmail+domain;
	String TheTelphone =" 095884847";
	String TheFax ="4958";
	String Addressone = " irbid behind samehmall";
	
	int theSelectStateIndex =  rand.nextInt(1,10);
	String postalCode = "19880";
	String login = TheFirstName+TheLastName+randomNumberForTheEmail;
	String passward = "p@ssward";
	
	String ExpectedTextForSingup = "YOUR ACCOUNT HAS BEEN CREATED!";
	String ExpetedvaluetForlogout ="You have been logged off your account. It is now safe to leave the computer."; 
	
	String welcomeMessage = "Welcome back "+TheFirstName;
}

