package com.gorursevim;

import javax.ws.rs.Path;

//http://localhost:8080/_001_RESTfulJersey/rest/selam
@Path(value = "/selam")

public class Merkez {
	
	/*GET    ----- Birşey istemek READ
	POST   ----- Birşey eklemek INSERT
	PUT    ----- Birşey güncellemek UPDATE
	DELETE ----- Birşeyi silmek */
	
	public String method1() {
		System.out.println("method1");
		return "SELAMLAR JERSEY";
	}

}
