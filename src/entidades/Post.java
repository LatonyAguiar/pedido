package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private Date momento;
	private String title;
	private String conteudo;
	private int like;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	
	public Post() {
	}

	public Post(Date momento, String title, String conteudo, int like) {
		this.momento = momento;
		this.title = title;
		this.conteudo = conteudo;
		this.like = like;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public List<Comentario> getComentario() {
		return comentarios;
	}

	public void addComentario (Comentario comentario) {
		comentarios.add(comentario);
	}

	public void removeComentario (Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append(title + "\n");

		sb.append(like);

		sb.append(" Likes - ");

		sb.append(sdf.format(momento) + "\n");

		sb.append(conteudo + "\n");

		sb.append("Comments:\n");

		for (Comentario c : comentarios) {

			sb.append(c.getTexto() + "\n");

		}

		return sb.toString();
	}
}
