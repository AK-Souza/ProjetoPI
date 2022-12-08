package controllers;

import java.util.Collections;
import java.util.List;

import models.Livro;
import models.Status;
import play.mvc.Controller;

public class Livros extends Controller {

    public static void index (){
        render();
    }
    public static void formLivro() {
        render();
    }

    public static void listar(){
        String termo = params.get("termo");
        
        List<Livro> livro = Collections.EMPTY_LIST;
        if (termo == null || termo.isEmpty()) {
            livro = Livro.find("status = ?1", Status.ATIVO).fetch();
        }
        else {
            livro = Livro.find("lower(titulo) like ?1 OR lower(autore) like ?2 AND status = ?3",
                "%" + termo.toLowerCase() + "%",
                "%" + termo.toLowerCase() + "%",
                Status.ATIVO).fetch();
        
        }
        render(livro, termo);
        }

    public static void salvar (Livro li){
        li.status = Status.ATIVO;
        li.save();
        listar();
        formLivro();
        
    }

    public static void remover (Long id) {
        Livro l = Livro.findById(id);
        l.status = Status.INATIVO;
        l.save();
        listar();

    }

    public static void editar (Long id){
        Livro book = Livro.findById(id);
        renderTemplate("Livros/formLivro.html", book);
    }
}
