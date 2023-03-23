package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author joanacarabajal
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, 
            String alergico, String atenEsp, 
            String nombreDuenio, String celDuenio) {
        
        
        //cremao al duenio y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        
     
        
        //creamos la mascota y asignmaos sus valores
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        
        controlPersis.guardar(duenio, masco);
        
        
        
        
    }

    public List<Mascota> traerMascotas() {
        
        //nos debe traer una lista de mascotas desde la bdd
        // quien se encarga de traerlos es la controladora de persistencia mas arriba,
        // ver datos llama la controladora de logica 
        //esta llama a la controladora de persistencia
        // y esta a jpa controler que corresponda para que traiga de la bdd lo que se encesita
        return controlPersis.traerMascotas();
    }

    public void borrarMascotas(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

   

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
        
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza,
            String color, String observaciones, String alergico, String atenEsp,
            String nombreDuenio, String celDuenio) {
        
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);
        
        //Modifico mascota
        controlPersis.modificarMascota(masco);
        
        //seteo nuevos valores del duenio
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDuenio);
        
        //llamar al modificar Duenio
        this.modificarDuenio(dueno);
        
        
    }

    private Duenio buscarDuenio(int id_duenio) {
        
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        
        controlPersis.modificarDuenio(dueno);
    }
        
        
    
    
    
    
}
