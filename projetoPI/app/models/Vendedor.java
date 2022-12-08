package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Vendedor extends Model{
    public String nome;
    public String email;
    public String senha;
    public String loja;
    public int numero;
    public int cnpj;
}
