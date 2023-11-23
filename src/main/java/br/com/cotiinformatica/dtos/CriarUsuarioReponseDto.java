package br.com.cotiinformatica.dtos;

import java.sql.Date;
import java.util.UUID;

import lombok.Data;
@Data
public class CriarUsuarioReponseDto {

	private UUID idUsuario;
	private String nome;
	private String email;
	private Date dataHoraCadastro;

}
