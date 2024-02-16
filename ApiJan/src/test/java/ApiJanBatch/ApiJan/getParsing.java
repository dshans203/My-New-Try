package ApiJanBatch.ApiJan;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;

public class getParsing 

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
				
				JSONArray array=new JSONArray(res.asString());
				JSONObject obj= array.getJSONObject(2);
				
				Set<String> allkeys=obj.keySet();
				for(String key:allkeys)
				{
				     System.out.println(key);
				     System.out.println(obj.get(key));
				}
				
	}

}