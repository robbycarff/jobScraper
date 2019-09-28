
/**************************************************************
Written by Robert Carff
Septemeber 26, 2019


This file drives utilizes our API interfaces


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


public class driverProgram
{
	public static void main(String[] args)
	{
		//gets out private Zillow key
		String zillow_token = zillowAPI.getZillowToken();

		// these will be controlled with command line arguments
		String State = "sc";
		String City = "charleston";
		String Child = "neighborhood";

		System.out.println("Test 1 - GetRegionChildren");
		zillowAPI.GetRegionChildren(zillow_token, State, City, Child);

		System.out.println("Test 2 - calling plotPython");
		zillowAPI.plotPython(State, City, Child);
	}

}
