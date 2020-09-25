package com.mpya;

import org.springframework.data.jpa.repository.JpaRepository;

interface  UserRepo extends JpaRepository<User, Long> {

}
