package apicampeonatosfifa.apicampeonatosfifa.core.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Fase;

@Repository
public interface IFaseRepositorio extends JpaRepository<Fase, Integer>{

}
