package apicampeonatosfifa.apicampeonatosfifa.core.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Ciudad;
@Repository
public interface ICiudadRepositorio extends JpaRepository<Ciudad, Integer> {

}
