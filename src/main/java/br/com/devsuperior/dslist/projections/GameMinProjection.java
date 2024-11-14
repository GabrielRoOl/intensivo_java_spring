package br.com.devsuperior.dslist.projections;

// Consulta SQL costumizada
public interface GameMinProjection {

	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescrition();
	Integer getPosition();
}
