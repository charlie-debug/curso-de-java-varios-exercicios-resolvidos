package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
	Map<String,String> cookies = new TreeMap<>();
	cookies.put("usuario", "maria");
	cookies.put("email", "maria@gmail.com");
	cookies.put("telefone", "(35)9 87030294");
	
	//cookies.remove("email");
	cookies.put("telefone", "(35)987030255");
	System.out.println("esta chave telefone existe:"+cookies.containsKey("telefone"));
	System.out.println("existe esta chave email:"+cookies.containsKey("email"));
	System.out.println("é possivel pegar a chave email:"+cookies.get("email"));
	System.out.println("tamanho do map: "+cookies.size());
	
	System.out.println("Todos os cookies:");
	for(String chave : cookies.keySet()) {
		System.out.println(chave+": "+cookies.get(chave));
		
	}
		
	}
}
