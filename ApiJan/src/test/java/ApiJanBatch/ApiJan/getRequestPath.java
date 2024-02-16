package ApiJanBatch.ApiJan;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;


import io.restassured.http.ContentType;

public class getRequestPath 

{
	
	public static void main(String[] args) 
	
	{
		Response res =
			    given()		
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/API_Folks");
			 
				System.out.println(res.statusCode());
				System.out.println(res.asString());
				
				String sector=res.jsonPath().get("[9].API_Folks[0].Roll Number");
				System.out.println(sector);
				
	}

}
