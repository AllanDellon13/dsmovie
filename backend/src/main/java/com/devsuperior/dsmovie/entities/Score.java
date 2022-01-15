package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	//chave composta implementa esse emededd
	@EmbeddedId
	//chave composta (CP e CE) para referenciar Movie e User;
	private ScorePK id = new ScorePK();
	 
	private Double value;

	public Score() {
	}
	
	//para associar o Score com o Movie
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	//para associar o User com o score;
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
	

}
