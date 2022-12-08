package controllers;

import models.Cliente;
import play.mvc.Controller;

public class Clientes extends Controller {

    public static void form(){
        render();
    }

    public static void salvar (Cliente cli){
        cli.save();
        form();
    }

    public static void listar (){
        listar();
    }
    
}
