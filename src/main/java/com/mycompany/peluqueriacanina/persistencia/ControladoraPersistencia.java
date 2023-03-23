
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joanacarabajal
 */
public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        
        //creando en la BD el Duenio 
        duenioJpa.create(duenio);
        
        
        //creando en la BD la mascota
        mascoJpa.create(masco);
        
        
        
    }

    public List<Mascota> traerMascotas() {
        
        // el find busca todos los registrso en la tabla mascotas y asigna lo que le pidamos
        
        return mascoJpa.findMascotaEntities();
        
    }

    public void borrarMascota(int num_cliente) {
        
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Mascota traerMascota(int num_cliente) {
        
        return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        

    public Duenio traerDuenio(int id_duenio) {
        
        return duenioJpa.findDuenio(id_duenio);
        
    }

    public void modificarDuenio(Duenio dueno) {
        
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        
    
    
    
    
    
}
