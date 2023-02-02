package ApiJanBatch.ApiJan;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class get 

	   {
		public static void main(String[] args) {
			
			Response res =
		    given()		
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/API_Folks?q=Deepanshu&id=1213");
			
			System.out.println("Respose code is "+ res.getStatusCode());
			
			System.out.println("Response data is "+ res.asString());
			
		}

	}

