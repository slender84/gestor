package services;

import entities.Cursoacademico;
import entities.Movilidad;
import entities.Universidad;
import entities.Usuario;
import exceptions.DuracionException;
import exceptions.NumeroDeMovilidadesException;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;


@Local
public interface MovilidadService {
     public List<Movilidad> listarTodasMovilidades();
    public List<Movilidad> listarMovilidadesPendientes();
    public Date fechaMin();
    public Date fechaMax();
    public void crearMovilidad(Movilidad m);
    public List<Movilidad> listarMisMovilidades(String user);
    public List<Movilidad> listarMisMovilidadesPorEstado(String user,String estado);
    public void eliminarMovilidad(Movilidad m);
    public Movilidad findMovilidad(Integer id);
    public void crearMovilidad(Date fechaInicio,Date fechaFin,Usuario user,Universidad u,Cursoacademico ca) throws DuracionException,NumeroDeMovilidadesException;
     public void cambiarMovilidad(Movilidad m,String estado);
}
