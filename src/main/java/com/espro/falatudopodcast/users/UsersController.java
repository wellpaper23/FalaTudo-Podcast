package com.espro.falatudopodcast.users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String userPage() {
        return "esta é a pagina para gerenciar os usuarios, somente administradores devem ter acesso</h1>";
    }
    //criar usuario
    @PostMapping("/create")
    public UserModel createUser(@RequestBody UserModel user) {
        return userService.createUser(user);
    }
    //ver todos usuario
    @GetMapping("list")
    public List<UserModel> listUsers() {
        return userService.listUsers();
    }
    //ver usuario especifico
    @GetMapping("/{id}")
    public UserModel showUser(@PathVariable Long id) {
        return userService.showUserById(id);
    }
    //atualizar usuario
    @PutMapping("/updateUser/{id}")
    public UserModel updateUser(@PathVariable Long id, @RequestBody UserModel user) {
        return userService.updateUserById(id, user);

    }
    //deletar usuario
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}
