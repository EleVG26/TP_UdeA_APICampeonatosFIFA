package apicampeonatosfifa.apicampeonatosfifa.core.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Grupo;

@Repository
public interface IGrupoRepositorio extends JpaRepository<Grupo, Integer>{

}
