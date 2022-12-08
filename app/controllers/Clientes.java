

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Clientes extends Controller{
  
    public static void cadastro(Cliente cliente) {
        cliente.save();
    }

}
