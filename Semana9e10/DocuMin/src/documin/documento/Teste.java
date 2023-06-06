package documin.documento;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("ElBrabo");
		lista.add("Pedro");
		lista.add("Mari");
		lista.remove("Pedro");
		System.out.println(lista);
		
		
		Documento doc = new Documento("Titulo");
		
		
	}
}
