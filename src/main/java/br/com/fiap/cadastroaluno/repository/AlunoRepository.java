package br.com.fiap.cadastroaluno.repository;

import br.com.fiap.cadastroaluno.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("alunoRepository")
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {



}
