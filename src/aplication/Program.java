package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

	
	Comentario c1 = new Comentario("Tenha uma boa viagem! ");
	Comentario c2 = new Comentario("Wou isso é incrivel" );
	
	Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Indo para a Nova Zelandia", "Indo visitar esse pais maravilhoso", 12);
	p1.addComentario(c1);
	p1.addComentario(c2);
	
	Comentario c3 = new Comentario("Va com Deus parceiro");
	Comentario c4 = new Comentario("Show de bola maluco! ");
	
	Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Indo para a Jamaica", "Ficar locão com a negada", 5);
	p2.addComentario(c3);
	p2.addComentario(c4);
	
	System.out.println(p1);
	System.out.println(p2);
	
	
	}
	
}
