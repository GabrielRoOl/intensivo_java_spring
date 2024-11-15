package br.com.devsuperior.dslist.dto;

import br.com.devsuperior.dslist.entities.Game;
import br.com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {	// Customisso a minha lista de "reprodução"

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {}

	public GameMinDTO(Game entity) { // Instancia um GameMinDTO a partir de um classe Game
		super();
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescrition();
	}
	
	public GameMinDTO(GameMinProjection projection) { // Instancia um GameMinDTO a partir de um classe Game
		super();
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescrition();
	}


	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
		
}
