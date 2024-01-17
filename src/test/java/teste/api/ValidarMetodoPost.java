package teste.api;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;

import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ValidarMetodoPost {

	String url = "https://reqres.in/api/users";
	JSONObject jsonBody = new JSONObject();

	@Test
	public void validarRequisicaoCompleta() {
		String name = "Bruno";
		String job = "QA";
		jsonBody.put("name", name);
		jsonBody.put("job", job);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.body("name", equalTo(name))
			.body("job", equalTo(job))
			.body("createdAt", notNullValue())
			.body("id", notNullValue());
	}

	@Test
	public void validarRequisicaoSemNenhumCampo() {
		given()
			.header("Content-Type", "application/json")
			.body("{}")
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.body("name", nullValue())
			.body("job", nullValue())
			.body("createdAt", notNullValue())
			.body("id", notNullValue());
	}

	@Test
	public void validarRequisicaoComCampoNameVazio() {
		String name = "";
		String job = "QA";
		jsonBody.put("name", name);
		jsonBody.put("job", job);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.body("name", equalTo(name))
			.body("job", equalTo(job))
			.body("createdAt", notNullValue())
			.body("id", notNullValue());
	}

	@Test
	public void validarCampoNameComNumeros() {
		Integer name = 123;
		String job = "QA";
		jsonBody.put("name", name);
		jsonBody.put("job", job);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.body("name", equalTo(name))
			.body("job", equalTo(job))
			.body("createdAt", notNullValue())
			.body("id", notNullValue());
	}

	@Test
	public void validarRequisicaoSemCampoName() {
		String job = "QA";
		jsonBody.put("job", job);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.body("name", nullValue())
			.body("job", equalTo(job))
			.body("createdAt", notNullValue())
			.body("id", notNullValue());
	}
	
	@Test
	public void validarRequisicaoComCampoJobVazio() {
		String name = "Bruno";
		String job = "";
		jsonBody.put("name", name);
		jsonBody.put("job", job);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.body("name", equalTo(name))
			.body("job", equalTo(job))
			.body("createdAt", notNullValue())
			.body("id", notNullValue());
	}
	
	@Test
	public void validarCampoJobComNumeros() {
		String name = "Bruno";
		Integer job = 123;
		jsonBody.put("name", name);
		jsonBody.put("job", job);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.body("name", equalTo(name))
			.body("job", equalTo(job))
			.body("createdAt", notNullValue())
			.body("id", notNullValue());
	}
	
	@Test
	public void validarRequisicaoSemCampoJob() {
		String name = "Bruno";
		jsonBody.put("name", name);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.body("name", equalTo(name))
			.body("job", nullValue())
			.body("createdAt", notNullValue())
			.body("id", notNullValue());
	}
	
	@Test
	public void validarRequisicaoComEstruturaErrada() {
		Object teste = new Object();
		jsonBody.put("name", teste);
		jsonBody.put("job", "QA");
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(400)
			.statusLine(containsString("Bad Request"));
	}
	
	@Test
	public void validarStatusCodeDaRequisicao() {
		String name = "Bruno";
		String job = "QA";
		jsonBody.put("name", name);
		jsonBody.put("job", job);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.statusLine(containsString("Created"));
	}
	
	@Test
	public void validarContratoDaRequisicao() {
		String name = "Bruno";
		String job = "QA";
		jsonBody.put("name", name);
		jsonBody.put("job", job);
		
		given()
			.header("Content-Type", "application/json")
			.body(jsonBody.toJSONString())
		
		.when()
			.post(url)
	
		.then()
			.statusCode(201)
			.header("Content-Type", containsString("application/json"))
			.body("name", isA(String.class))
			.body("job", isA(String.class))
			.body("id", isA(String.class))
			.body("createdAt", isA(String.class));
	}
	
}