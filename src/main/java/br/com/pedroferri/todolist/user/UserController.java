package br.com.pedroferri.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificadores
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    /*
     * String (texto)
     * Integer (numeros inteiros)
     * Double (Numero com cas decimal )
     * Float (Casa decimaaal com numero menor que o double)
     * char (aceita apenas um caracter)
     * date (retorn data)
     * void (sem retorno)
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
    }

}
