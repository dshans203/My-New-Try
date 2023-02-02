package ApiJanBatch.ApiJan;

import io.restassured.http.ContentType;
import io.restassured.response.Response;




public class GetRequest

   {
	public static void main(String[] args) {
		
		Response r =
		 given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/API_Folks");
		
		System.out.println("Respose code is "+ r.	getStatusCode());
		
		System.out.println("Response data is "+ r.asString());
		
	}

}
