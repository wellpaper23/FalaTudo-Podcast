package com.espro.falatudopodcast.users;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.List;

@RestController
@RequestMapping("/user")
public class usersController {
    private final userService userService;

    public usersController(userService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String userPage() {
        return "esta é a pagina para gerenciar os usuarios, somente administradores devem ter acesso</h1>";
    }
    //criar usuario
    @PostMapping("/create")
    public userModel createUser(@RequestBody userModel user) {
        return userService.createUser(user);
    }
    //ver todos usuario
    @GetMapping("list")
    public List<userModel> listUsers() {
        return userService.listUsers();
    }
    //ver usuario especifico
    @GetMapping("/{id}")
    public userModel showUser(@PathVariable Long id) {
        return userService.showUserById(id);
    }
    //atualizar usuario
    @PutMapping("/updateUser/{id}")
    public userModel updateUser(@PathVariable Long id, @RequestBody userModel user) {
        return userService.updateUserById(id, user);

    }
    //deletar usuario
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}
