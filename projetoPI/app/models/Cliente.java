package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Cliente extends Model {
   
    public String nome;
    public String email;
    public String senha;
    public String endereco;
    public int numero;

}


