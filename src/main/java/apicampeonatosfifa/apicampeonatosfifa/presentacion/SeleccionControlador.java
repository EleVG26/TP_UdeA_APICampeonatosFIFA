package apicampeonatosfifa.apicampeonatosfifa.presentacion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ISeleccionServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Seleccion;

@RestController
@RequestMapping("/api/selecciones")
public class SeleccionControlador {

    private ISeleccionServicio servicio;

    public SeleccionControlador(ISeleccionServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/listar")
    public List<Seleccion> listar() {
        return servicio.listar();
        
    }

}
