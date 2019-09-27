
/**************************************************************
Written by Robert Carff
Septemeber 26, 2019
Goal:
	use the Zillow and Glassdoor API to compare average 
	salaries to average housing prices

ZILLOW KEY - property details API, Valuation API
	X1-ZWz17nad7qjhfv_ac8os
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
/*MAIN CLASS */
public class zillowAPI{
	/**************************************
	* GetRegionChildren resides at: 
	* http://www.zillow.com/webservice/GetRegionChildren.htm
	*
	* Parameters
	* ZWID required
	*
	***************************************/
	public static void GetRegionChildren( String API_TOKEN, String State, String City, String Child){
		//creating a connection
		try {
			//requested for getting children
			String testURL = "http://www.zillow.com/webservice/GetRegionChildren.htm?zws-id=";
			String get = testURL.concat(API_TOKEN).concat("&state=").concat(State).concat("&city=").concat(City).concat("&childtype=").concat(Child);
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
			PrintStream file = new PrintStream(new File(fileName.concat(State).concat("_").concat(City).concat("_").concat(Child).concat(".txt")));
			PrintStream console = System.out;
			//changing the .out to my file and then back to console
			System.setOut(file);
			System.out.println(content);
			System.setOut(console);

			//closing the connection once the Child has been requested
			con.disconnect();
			System.out.println("Connection closed");
			}
		catch (Exception e){
			System.out.println("ur shits broken");
		}
	}
	/**************************************
	* This method should read in the saved
	* XML file and execute it with an R script
	* R will then read the XML and open a plot 
	* of the data
	*
	* Might pipe and execute some python
	*
	***************************************/
	public static void plotR(){

		//Runtime.getRuntime().exec("Plot"); 
	}

	public static void main(String[] args){
		//this is the instances API_TOKEN
		String zws_id = "X1-ZWz17nad7qjhfv_ac8os";
		// these will be controlled with command line arguments
		String State = "wa";
		String City = "seattle";
		String Child = "neighborhood";
		System.out.println("Test 1 - GetRegionChildren");
		GetRegionChildren(zws_id, State, City, Child);
	}

}



