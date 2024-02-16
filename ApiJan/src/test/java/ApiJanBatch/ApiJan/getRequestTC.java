package ApiJanBatch.ApiJan;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;

public class getRequestTC 

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
				int l=array.length();
				for(int i=1; i<l;i++) 
				{
					JSONObject obj= array.getJSONObject(i);
					System.out.println(obj.get("id"));
					
				}
	}

}
