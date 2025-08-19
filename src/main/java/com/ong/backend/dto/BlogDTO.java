package com.ong.backend.dto;

import java.time.LocalDateTime;
import com.ong.backend.entities.Blog;

public class BlogDTO {
	private Long id;
	private Long idUsuario;
	private String tituloMateria;
	private String informacao;
	private String urlImg;
	private boolean anonima;
	private LocalDateTime dataPostagem;
	
	public BlogDTO() {
	}
	
	public BlogDTO(Long id, Long idUsuario, String tituloMateria, String informacao, String urlImg, boolean anonima, LocalDateTime dataPostagem) {
		this.id = id;
		this.idUsuario = idUsuario;
		this.tituloMateria = tituloMateria;
		this.informacao = informacao;
		this.urlImg = urlImg;
		this.anonima = anonima;
		this.dataPostagem = dataPostagem;
	}

	public BlogDTO(Blog entity) {
		this.id = entity.getId();
		this.idUsuario = entity.getIdUsuario().getId();
		this.tituloMateria = entity.getTituloMateria();
		this.informacao = entity.getInformacao();
		this.urlImg = entity.getUrlImg();
		this.anonima = entity.isAnonima();
		this.dataPostagem = entity.getDataPostagem();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTituloMateria() {
		return tituloMateria;
	}
	public void setTituloMateria(String tituloMateria) {
		this.tituloMateria = tituloMateria;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public boolean isAnonima() {
		return anonima;
	}
	public void setAnonima(boolean anonima) {
		this.anonima = anonima;
	}

	public LocalDateTime getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(LocalDateTime dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}