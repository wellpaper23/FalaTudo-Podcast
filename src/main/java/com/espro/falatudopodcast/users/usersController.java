package com.espro.falatudopodcast.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class usersController {


    @GetMapping()
    public String user() {
        return "esta é a pagina para gerenciar os usuarios, somente administradores devem ter acesso";
    }

}
