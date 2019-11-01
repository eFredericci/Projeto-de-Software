/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro.row;

/**
 *
 * @author Eduardo
 */
public class CadUsuario {
    Long id;
    String nome;
    String Senha;
    String Enabled;
    String Prioridade;
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    public String getEnabled() {
        return Enabled;
    }
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;

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
    public String getPrioridade() { 
        return Prioridade;
    } 
    public void setPrioridade(String Prioridade) { 
        this.Prioridade = Prioridade;
    } 
    
}
