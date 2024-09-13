package com.dtos.request.response;

public class CreateBookDto {
    
    private Long id_usuario;
    private String telefone;
    private String email;
    private String senha;
    private String nome;
    private int idade;
    private String nacionalidade;



    public CreateBookDto(Long id_usuario ,String telefone, String email, String senha, String nome, int idade, String nacionalidade){




        this.id_usuario=id_usuario;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;





    }



    public Long getId_usuario() {
        return id_usuario;
    }



    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }



    public String getTelefone() {
        return telefone;
    }



    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getSenha() {
        return senha;
    }



    public void setSenha(String senha) {
        this.senha = senha;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getIdade() {
        return idade;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }



    public String getNacionalidade() {
        return nacionalidade;
    }



    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }







}
