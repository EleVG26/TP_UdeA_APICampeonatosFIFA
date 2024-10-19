package apicampeonatosfifa.apicampeonatosfifa.core.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Campeonato;

@Repository
public interface ICampeonatoRepositorio extends JpaRepository<Campeonato, Integer>{

}
