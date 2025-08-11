package com.espro.falatudopodcast.users;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

@RestController
@RequestMapping("/user")
public class usersController {


    @GetMapping()
    public String userPage() {
        return "esta é a pagina para gerenciar os usuarios, somente administradores devem ter acesso</h1>";
    }
    //criar usuario
    @PostMapping("/create")
    public String createUser() {
        return "usuario criado com sucesso!";
    }
    //ver todos usuario
    @GetMapping("list")
    public String listUsers() {
        return "usuarios listados com sucesso!";
    }
    //ver usuario especifico
    @GetMapping("/{id}")
    public String showUser() {
        return "usuario exibido com sucesso!";
    }
    //editar usuario
    @PutMapping("/updateUser")
    public String updateUser() {
        return "usuario atualizado com sucesso!";
    }
    //deletar usuario
    @DeleteMapping("/delete")
    public String deleteUser() {
        return  "usuario deletado com sucesso!";
    }
}
