package jan8_jsexecutor;

import io.restassured.RestAssured;

public class APIUsingRestAssured {

	public static void main(String[] args) {
		
		int code =RestAssured.get("http://google.com")
		.statusCode();
		
		System.out.println(code);

	}

}
