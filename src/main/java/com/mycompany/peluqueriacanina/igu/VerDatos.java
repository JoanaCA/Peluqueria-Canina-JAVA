
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
     
    
    Controladora control = null; // aca tenog el objeto control para tener acceso a mi controladora
    //tratar de que si es una variable gloabl, inicializar con null, consejo
    public VerDatos() {
        
        control = new Controladora(); //y aca cuando se abra ver datos, se va a crar la instancia de controladora
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Ver Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas");

        btnEliminar.setIcon(new javax.swing.ImageIcon("/Users/joanacarabajal/Desktop/boton-eliminar-2.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("/Users/joanacarabajal/Desktop/editar.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        // controlo que la tabla no este vacia
        if(tablaMascotas.getRowCount() > 0 ){
            //controlo que se haya selecionado a una mascota
           if(tablaMascotas.getSelectedRow()!=-1){
               //obtengo la iad de la mascota a eliminar 
              int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt (tablaMascotas.getSelectedRow(), 0 )));
               //leer de atras para adelante de la tabla mascotas traeme el valor que esta en la columan 0 de la fila seleccioanda 
               //despues convierte a string, luego a int para guardarlo en num cliente
               
               //llamo al metodo borrar
               control.borrarMascotas(num_cliente);
               
               //aviso al usuaairo que borrro bien 
               mostrarMensajes("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
               cargarTabla();
               
               
           }
           else {
               mostrarMensajes("No seleccionó ninguna mascota", "Error", "Error al eliminar");
           }
           
            
        }
        else {
               mostrarMensajes("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
           }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        
        if (tablaMascotas.getRowCount() > 0) {

            if (tablaMascotas.getSelectedRow() != -1) {
                
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt (tablaMascotas.getSelectedRow(), 0 )));
                
                ModificarDatos pantallaModif =  new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose();

                

            } else {
                mostrarMensajes("No seleccionó ninguna mascota", "Error", "Error al eliminar");
            }

        } else {
            mostrarMensajes("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
        
        

    }//GEN-LAST:event_btnEditarActionPerformed

   public void mostrarMensajes(String mensaje, String tipo, String titulo) {
       
       JOptionPane optionPane = new JOptionPane(mensaje);
       if(tipo.equals("Info")){
               optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
       }
       else if (tipo.equals("Error")){
               optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
       }
       JDialog dialog = optionPane.createDialog(titulo);
       dialog.setAlwaysOnTop(true);
       dialog.setVisible(true);
       
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
         
        //definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){ // clase especial nos permite establecer un modelo para nuestra tabla o sea agregarle cosas, setear etc.
        
            @Override
            public boolean isCellEditable(int row, int column){ 
                // el metodo in cell .. ya existe! o sea hay que sobre escribirlo
                // aca le decimos que del default table etc que se esta creando que todas las celdas no sean editables!
                return false;
            }
        
        } ;
        
        // estabelcer nombres de columnas
        
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At.Esp.", "Dueño", "Cel"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        
        // estoy desde"ver datos", la igu llama a la logica "controladora" y 
        //la L se encarga de llamar a la persistencia, esta establece conexion con jpa y bdd.
        // entonces hay que llmar a la controladora de logica pero primeor tiene  que estar instanciada.
        
     
        // carga de los datos desde la base de datos
        
        List <Mascota> listaMascotas = control.traerMascotas();
        
        // recorrer la lista y mostrar cada elemento en la tabla
        // preguntar si es null o no
        
        if (listaMascotas!= null){
            
            for (Mascota masco : listaMascotas ) { //por cada mascota de la lista de mascotas
                
                // de tipo Object xq cada mascota tiene muchos tipos de datos! nos permite guardar todos los tipos dentro de la clase.
                
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(),masco.getRaza(),
                masco.getAlergico(), masco.getAtencion_especial(), 
                masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};
                
                modeloTabla.addRow(objeto);
                
                //terminado el metodo cargar tabla
                //crea el modelo de la tabla, o sea no editable
                //estblece nombre de las columnas en un array
                //estos datos del array se establecen en la tabla 
                //traemos la lista de mascotas de la logica y esta se va a encargar de cargar en  la bdd
                //lo que traigamos se va a guardar en una lista, se recorre esa lista para saber que no sea nulo
                //se crea un array con cada uno de los datos que tienen que coincidir 
                //y se agregan a un objeto, array de tipo object 
                //y este se agrega como fila la tabla 
                
                
            }
            
        }
        
            
      tablaMascotas.setModel(modeloTabla);
        
        
    }
}
//