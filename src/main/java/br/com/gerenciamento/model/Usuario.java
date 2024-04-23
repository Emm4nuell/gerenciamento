package br.com.gerenciamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private Long id_usuario;
    private String nome;
    private int matricula;
    private Long cpf;
    private String email;
    private Date data_nascimento;
    private LocalDateTime data_cadastro;
    private boolean status;
    private String foto_perfil;
    private String setor;
    private String nivel_acesso;
    private String senha;
}
