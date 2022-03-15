package br.com.voemais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.voemais.entities.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>{

}
