package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Postagem;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comentario c1 = new Comentario("tenha uma boa viajem");
		Comentario c2 = new Comentario("uau! que incrível!");
		Postagem p1 = new Postagem(sdf.parse("21/12/2024 18:55:20"), "viajando para nova zelândia",
				"indo visitar esse país maravilhoso", 12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("boa noite! ");
		Comentario c4 = new Comentario("minha forca esteja com você");
		Postagem p2 = new Postagem(sdf.parse("21/12/2024 18:55:20"), "boa noite pessoal",
				"te vejo amanhã", 5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
