
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
import java.net.HttpURLConnection;
import java.net.MalformedURLException; 
import java.net.URL;

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

			//closing the connection once the Child has been requested
			con.disconnect();
			System.out.println("Connection closed");
			}
		catch (Exception e){
			System.out.println("ur shits broken");
		}
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



