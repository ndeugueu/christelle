package com.christielle.kamaha;

import static org.junit.Assert.assertThat;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.junit.Rule;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.junit.MockServerRule;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.verify.VerificationTimes;

public class HomeControllerTest {
	






	@Rule
	public MockServerRule mockServerRule = new MockServerRule(this,9000);

	private MockServerClient mockServerClient;

	@org.junit.Test
	public void testAdd(){
		//add the behavior of calc service to add two numbers

		// setting behaviour for test case
		mockServerClient.when(HttpRequest.request("/foo")).respond(HttpResponse.response().withStatusCode(200));

		//test the add functionality

		// create a GET request using JAX-RS rest client API
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:9000").path("/foo").request().get();

		// assert response

		// verify server has received exactly one request
		mockServerClient.verify(HttpRequest.request("/foo"), VerificationTimes.once());





	}










}
