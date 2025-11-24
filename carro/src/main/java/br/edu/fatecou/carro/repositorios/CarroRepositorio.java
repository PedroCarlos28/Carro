package br.edu.fatecou.carro.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecou.carro.entidades.Carro;

public interface CarroRepositorio extends JpaRepository<Carro, String> {
    
}
