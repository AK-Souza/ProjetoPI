package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Cliente extends Model{

    public String name;
    public String email;
    public String nick;
    public String end;
    public int numb;

}
