package com.ong.backend.dto;

import java.time.LocalDate;
import com.ong.backend.entities.Evento;

public class EventoDTO {
	
	private Long id;
	private String nome;
	private String descricao;
	private String urlImg;
	private LocalDate data;
	private String local;
	
	public EventoDTO() {
	}

	public EventoDTO(Long id, String nome, String descricao, String urlImg, LocalDate data, String local) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.urlImg = urlImg;
		this.data = data;
		this.local = local;
	}
	
	public EventoDTO(Evento entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.descricao = entity.getDescricao();
		this.urlImg = entity.getUrlImg();
		this.data = entity.getData();
		this.local = entity.getLocal();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
}