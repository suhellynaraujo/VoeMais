package br.com.voemais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.voemais.entities.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

}
