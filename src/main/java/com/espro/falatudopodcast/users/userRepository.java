package com.espro.falatudopodcast.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userModel,Long> {
}
