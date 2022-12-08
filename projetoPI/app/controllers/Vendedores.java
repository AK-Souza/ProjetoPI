package controllers;

import models.Vendedor;
import play.mvc.Controller;

public class Vendedores extends Controller {

        public static void formv(){
            render();
        }
    
        public static void salvar (Vendedor ven){
            ven.save();
            formv();
        }
    
        public static void listar (){
            
        }
        
}
    

