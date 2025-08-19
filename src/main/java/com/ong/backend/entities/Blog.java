package com.ong.backend.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_blog")
public class Blog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tituloMateria;
	private String informacao;
	private String urlImg;
	private boolean anonima;
	private LocalDateTime dataPostagem;
	
	@OneToMany(mappedBy = "idBlog", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Comentario> comentarios;
	
	@ManyToOne
    @JoinColumn(name = "id_usuario")
	private Usuario idUsuario;
	
	public Blog() {
	}

	public Blog(Long id, String tituloMateria, String informacao, String urlImg, boolean anonima, LocalDateTime dataPostagem, Usuario idUsuario) {
		this.id = id;
		this.tituloMateria = tituloMateria;
		this.informacao = informacao;
		this.urlImg = urlImg;
		this.anonima = anonima;
		this.dataPostagem = dataPostagem;
		this.idUsuario = idUsuario;
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

	public void setInformacao(String noticia) {
		this.informacao = noticia;
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

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
}