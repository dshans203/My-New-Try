package ApiJanBatch.ApiJan;
import org.json.JSONArray;
import org.json.JSONObject;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class APIAutomation {

	public static void main(String[] args) {
		
		JSONObject inner1=new JSONObject();
		inner1.put("Street 2", "LOndon's Street");
		inner1.put("NearestPoint","Peterson Cafeteria");
		inner1.put("CNPJ", "123654");
		inner1.put("Type", "primary");
		
		JSONObject inner2=new JSONObject();
		inner2.put("Street 2", "LOndon's Street");
		inner2.put("NearestPoint","Peterson Cafeteria");
		inner2.put("Type", "Secondary");
		
		JSONArray array=new JSONArray();
		array.put(0,inner1);
		array.put(1,inner2);
		
		JSONObject outer=new JSONObject();
		outer.put("FirstName", "LOndon's Street");
		outer.put("Lastname","Peterson Cafeteria");
		outer.put("id", "123654");
		outer.put("Address",array);
		
		Response res=
				given()
			   .contentType(ContentType.JSON)
			   .body(outer.toString())
			   .when()
		       .post("http://localhost:3000/API_Folks");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
	
}
