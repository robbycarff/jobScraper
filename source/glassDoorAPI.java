/**************************************************************
Written by Robert Carff
Septemeber 26, 2019


This is the Glassdoor API java file


***************************************************************/
/*IMPORTS */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream; 
import java.net.HttpURLConnection;
import java.net.MalformedURLException; 
import java.net.URL;
import java.io.File;
import java.util.Scanner;
import java.io.*;

public class glassDoorAPI
{
	private String getGlassDoorToken(){
		//GRABBING MY ZILLOW API KEY FROM LOCAL FILE
		String glassDoor_token = "";
		try {
			Scanner keys = new Scanner(new File("glassDoorKey.txt"));

			while(keys.hasNext()){
				//this is the instances API_TOKEN
		        glassDoor_token = keys.nextLine();
		        //System.out.println("glassDoor Key: " + glassDoor_token);
	    	}	
		}
		catch (FileNotFoundException ex){
			System.out.println("ur file shits broken");
		}
		return glassDoor_token;
	}
	
	public static void main(String[] args){

	}
}