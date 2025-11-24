package br.edu.fatecou.carro;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import br.edu.fatecou.carro.entidades.Carro;
import br.edu.fatecou.carro.entidades.Pessoa;
import br.edu.fatecou.carro.repositorios.CarroRepositorio;
import br.edu.fatecou.carro.repositorios.PessoaRepositorio;

@SpringBootApplication
public class CarroApplication implements CommandLineRunner {

    @Autowired
    private CarroRepositorio carroRepositorio;

    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(CarroApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Carro carro = new Carro();
        carro.setAnoFabricacao(2024);
        carro.setAnoModelo(2023);
        carro.setCodigo(10980);
        carro.setMarca("Fiat");
        carro.setModelo("Argo");
        carro.setValor(90000.0);

        carroRepositorio.save(carro);
        System.out.println("Carro salvo com sucesso!");

        Pessoa pessoa = new Pessoa();
        pessoa.setCodigo(1);
        pessoa.setNome("Pedro Oliveira");
        pessoa.setCpf("123.456.789-10");
        pessoa.setAltura(1.75);
        pessoa.setPeso(74.0);

        pessoaRepositorio.save(pessoa);
        System.out.println("Pessoa salva com sucesso!");
    }
}
