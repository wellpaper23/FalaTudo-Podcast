package com.espro.falatudopodcast.users;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
        private final UserRepository userRepository;
        public UserService(UserRepository userRepository) {
                this.userRepository = userRepository;
        }

        //criar usuarios
        public UserModel createUser(UserModel user) {
                return userRepository.save(user);
        }
        //listar usuarios
        public List<UserModel> listUsers() {
            return userRepository.findAll();
        }
        //exibir usuario
        public UserModel showUserById(Long id) {
                Optional<UserModel> user = userRepository.findById(id);
                return user.orElse(null);
        }
        //alterar usuários
        public UserModel updateUserById(Long id, UserModel user) {
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
