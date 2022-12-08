package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Livro extends Model {

    public String titulo;
    public String desc;
    public String autore;
    public int estoque;

    public void Cliente (){
        status = Status.INATIVO;
    }

    @Enumerated(EnumType.STRING)
    public Status status;
}
