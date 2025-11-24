package br.edu.fatecou.carro.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecou.carro.entidades.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, String> {
    
}
