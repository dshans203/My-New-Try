package ApiJanBatch.ApiJan;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.FileNotFoundException;

public class PostApiFile {
	
	public static void main(String[] args) throws FileNotFoundException {
	
	File f= new File("../ApiJan/src/test/java/JSON_File.json");
	FileReader fr= new FileReader(f);
	JSONTokener jr= new JSONTokener(fr);
	JSONObject j= new JSONObject(jr);
	
	String bodydata= j.toString();
	
	System.out.println("Enter id value");
	
	Scanner s=new Scanner(System.in);
	
	Integer id=s.nextInt(); 
	
	bodydata=bodydata.replaceAll(Pattern.quote("{{id}}"), id.toString());
	
	Response res=
			given()
		   .contentType(ContentType.JSON)
		   .body(bodydata.toString())
		   .when()
	       .post("http://localhost:3000/API_Folks");
	System.out.println(res.statusCode());
	System.out.println(res.asString());
	
	
	}
}