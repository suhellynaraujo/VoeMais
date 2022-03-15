package br.com.voemais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.voemais.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
