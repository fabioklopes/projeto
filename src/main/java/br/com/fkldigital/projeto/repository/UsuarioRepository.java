package br.com.fkldigital.projeto.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import br.com.fkldigital.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepositoryImplementation<UsuarioEntity, Long> {

}
