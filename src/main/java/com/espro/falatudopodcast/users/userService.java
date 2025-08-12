package com.espro.falatudopodcast.users;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService  {
        private final userRepository userRepository;
        public userService(userRepository userRepository) {
                this.userRepository = userRepository;
        }

        //criar usuarios
        public userModel createUser(userModel user) {
                return userRepository.save(user);
        }
        //listar usuarios
        public List<userModel> listUsers() {
            return userRepository.findAll();
        }
        //exibir usuario
        public userModel showUserById(Long id) {
                Optional<userModel> user = userRepository.findById(id);
                return user.orElse(null);
        }
        //alterar usuários
        public userModel updateUserById(Long id,userModel user) {
                if(userRepository.existsById(id)){
                        return userRepository.save(user);
                }else{
                return null;
                }
        }
        //deletar usuários
        public void deleteUserById(Long id) {
                userRepository.deleteById(id);
        }

}
