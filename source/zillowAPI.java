
/**************************************************************
Written by Robert Carff
Septemeber 26, 2019
Goal:
	use the Zillow and Glassdoor API to compare average 
	salaries to average housing prices

 MAKSE SURE TO GET YOUR ZILLOW KEY

THIS PROJECT IS IN DEVELOPMENT AND THE CODE NEEDS TO BE BROKEN
DOWN INTO METHODS THAT CAN BE CALLED

- for example, generating the file path is used in both:
		getRegionChildren and plotPython
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

/*MAIN CLASS */
public class zillowAPI{
	/***********************************************************
	* GetRegionChildren resides at: 
	* http://www.zillow.com/webservice/GetRegionChildren.htm
	* 
	* THIS METHOD REQUESTS NEIGHBORHOOD AND WRITES TO FILE
	***********************************************************/
	public static void GetRegionChildren( String zillow_token, String State, String City, String Child){
		//creating a connection
		try {
			//requested for getting children
			String testURL = "http://www.zillow.com/webservice/GetRegionChildren.htm?zws-id=";
			//this test URL is the full request for regionChildren 
			//need to learn how to use tables to put together HTTP request arguments 
			String get = testURL.concat(zillow_token).concat("&state=").concat(State).concat("&city=").concat(City).concat("&childtype=").concat(Child);
			URL url = new URL(get);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			int status = con.getResponseCode();
			System.out.println(status);

			//reading in the children
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuffer content = new StringBuffer();
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				inputLine.concat("\n");
			    content.append(inputLine + "\n");
			}
			in.close();
			System.out.println(content);

			//this is a shitty way to pipe to a new file but it works fast
			String fileName = "";
			PrintStream fileNameGenerated = new PrintStream(new File("../data/".concat(State).concat("_").concat(City).concat("_").concat(Child).concat(".txt")));
			PrintStream console = System.out;
			//changing the .out to my file and then back to console
			System.setOut(fileNameGenerated);
			System.out.println(content);
			System.setOut(console);

			//closing the connection once the Child has been requested
			con.disconnect();
			System.out.println("Connection closed");
			}
		catch (Exception e){
			System.out.println("ur java shits broken");
		}
	}
	/**************************************
	* This method should read in the saved
	* XML file and execute it with our python
	* program 
	* 
	* goal is to use python to make a map 
	* with long/lat
	*
	* Might pipe and execute some python
	*
	* Jython library should be used here
	*
	***************************************/
	public static void plotPython(String State, String City, String Child){
		try{
			/*
			PythonInterpreter interpreter = new PythonInterpreter();
			//this is where we link the file with the methods inside
			interpreter.exec("import sys\nsys.path.append('pathToModules if they are not there by default')\nimport yourModule");

			// execute a function that takes a string and returns a string
			PyObject someFunc = interpreter.get("plot_zillow");
			//generate the file name
			String fileName = "";
			fileName.concat(State).concat("_").concat(City).concat("_").concat(Child).concat(".txt");
			//pass in the file name
			PyObject result = someFunc.__call__(new PyString(fileName));
			//print the result
			String realResult = (String) result.__tojava__(String.class);
			System.out.println(realResult);
			*/
		}
		catch (Exception e){
			System.out.println("ur python shits broken");
		}
		
	}

	public static String getZillowToken(){
			//GRABBING MY ZILLOW API KEY FROM LOCAL FILE
		String zillow_token = "";
		try {
			Scanner keys = new Scanner(new File("zillowKey.txt"));

			while(keys.hasNext()){
				//this is the instances API_TOKEN
		        zillow_token = keys.nextLine();
		        System.out.println("Zillow Key: " + zillow_token);
	    	}	
		}
		catch (FileNotFoundException ex){
			System.out.println("ur file shits broken");
		}
		return zillow_token;
	}

	/**************************************
	* Driver function - will be used to 
	* take in command line args
	*
	***************************************/
	public static void main(String[] args){
	
	}

}



