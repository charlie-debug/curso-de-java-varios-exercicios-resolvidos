package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Postagem;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comentario c1 = new Comentario("Tenha uma boa viajem!");
		Comentario c2 = new Comentario("Uau, isso é incrível!");
		Postagem p1 = new Postagem(sdf.parse("21/06/2018 13:05:44"),
				"Viajando para nova zelândia!", 
				"Indo visitar este país maravilhoso!", 12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println();
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que a força esteja com você!");
		Postagem p2 = new Postagem(sdf.parse("28/07/2018 23:14:19"),
				"Boa noite pessoal!", 
				"Vejo vocês amanhã!", 5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		System.out.println(p1);
		System.out.println(p2);

	}

}
