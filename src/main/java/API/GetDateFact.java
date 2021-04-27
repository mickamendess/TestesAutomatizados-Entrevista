package API;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetDateFact {
	@Test
	public void Get() throws Throwable{
		System.out.println("Consumindo GetDateFact!");
		String url = ("https://numbersapi.p.rapidapi.com/6/21/date?json=true&fragment=true");	

		Response resposta = given().
			    header("x-rapidapi-key", "a6f66a97e6msh3f8eacf1bc9e920p1bb3d1jsn40722be47ec0").
			    header("x-rapidapi-host", "numbersapi.p.rapidapi.com").
			    get(url).
				 then ()
				 .contentType(ContentType.JSON).extract().response();
		resposta.then().log().body(true);		
		
		int codigo = resposta.getStatusCode();
		if(codigo == 200) {
			System.out.println("Sucesso!");
		}
		else {
			System.out.println("Falha!");
		}
	}
}
