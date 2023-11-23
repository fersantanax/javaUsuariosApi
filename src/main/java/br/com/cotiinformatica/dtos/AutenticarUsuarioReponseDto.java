package br.com.cotiinformatica.dtos;

import java.sql.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class AutenticarUsuarioReponseDto {

	private UUID isUsuario;
	private String nome;
	private String email;
	private Date dataHoraAcesso;
	private String token;
	private Data dataHoraExpiracao;

}
