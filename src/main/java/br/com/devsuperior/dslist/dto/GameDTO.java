package br.com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import br.com.devsuperior.dslist.entities.Game;


public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	
	private String shortDescription;
	
	private String longDescription;

	public GameDTO() {
	}

	public GameDTO(Game game) {
		super();
		// BeanUtils.copyProperties(game, this); Função do framework que copia todos os atributos de uma classe para outra
		id = game.getId();
		title = game.getTitle();
		year = game.getYear();
		genre = game.getGenre();
		platforms = game.getPlatforms();
		score = game.getScore();
		imgUrl = game.getImgUrl();
		shortDescription = game.getShortDescrition();
		longDescription = game.getLongDescrition();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescrition() {
		return shortDescription;
	}

	public void setShortDescrition(String shortDescrition) {
		this.shortDescription = shortDescrition;
	}

	public String getLongDescrition() {
		return longDescription;
	}

	public void setLongDescrition(String longDescrition) {
		this.longDescription = longDescrition;
	}

}
