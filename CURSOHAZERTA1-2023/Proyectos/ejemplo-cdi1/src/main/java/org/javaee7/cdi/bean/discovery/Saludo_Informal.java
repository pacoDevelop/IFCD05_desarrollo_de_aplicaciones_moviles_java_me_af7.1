package org.javaee7.cdi.bean.discovery;

import javax.inject.Singleton;

@Informal // CUALIFICADOR PARA QUE CDI SEPA CUANDO QUIERO OBJETOS DE ESTA CLASE
// @Singleton - OPCION DE CREACION DEL OBJETO POR PARTE DE CDI
public class Saludo_Informal implements Greeting {

	@Override
	public String greet(String name) {
		return "Hola muchacho " + name;
	}

}
