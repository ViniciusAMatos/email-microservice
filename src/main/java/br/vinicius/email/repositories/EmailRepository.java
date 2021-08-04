package br.vinicius.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.vinicius.email.models.EmailModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
