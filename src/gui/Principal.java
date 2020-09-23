/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.Equipo;
import clases.Jugador;
import javax.swing.JOptionPane;
import lista.ListaDoble;
import lista.ListaDobleEquipo;

/**
 *
 * @author LENOVO
 */
public class Principal extends javax.swing.JFrame {

    ListaDoble<Jugador> listaJugador = new ListaDoble<>();
    ListaDobleEquipo listaEquipos = new ListaDobleEquipo();
    ListaDobleEquipo listaPosicion;
    String matriz[][];

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEquipos = new javax.swing.JButton();
        btnPosiciones = new javax.swing.JButton();
        btnResultadoFixture = new javax.swing.JButton();
        btnFixture = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNameJugador = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtOld = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaJugadores = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        txtRegister = new javax.swing.JButton();
        txtNameEquipo = new javax.swing.JTextField();
        txtDT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEquipos.setText("LISTA DE EQUIPOS");
        btnEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquiposActionPerformed(evt);
            }
        });

        btnPosiciones.setText("TABLA DE POSICIONES");
        btnPosiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicionesActionPerformed(evt);
            }
        });

        btnResultadoFixture.setText("RESULTADO DE PARTIDOS");
        btnResultadoFixture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoFixtureActionPerformed(evt);
            }
        });

        btnFixture.setText("VER FIXTURE");
        btnFixture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixtureActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EQUIPO"));

        jLabel1.setText("Nombre de Equipo");

        jLabel2.setText("Director Tecnico");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "JUGADORES"));

        jLabel3.setText("Nombre");

        jLabel4.setText("Numero");

        jLabel5.setText("Edad");

        jLabel6.setText("Posición");

        txaJugadores.setColumns(20);
        txaJugadores.setRows(5);
        jScrollPane1.setViewportView(txaJugadores);

        btnAdd.setText("AGREGAR JUGADOR");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtRegister.setText("REGISTRAR EQUIPO");
        txtRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(txtNameJugador, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOld))))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRegister)
                        .addGap(196, 196, 196))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNameJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegister)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNameEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtNameEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFixture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResultadoFixture, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnPosiciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnFixture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEquipos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResultadoFixture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPosiciones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        txaJugadores.setText("");
        String nombre = txtNameJugador.getText();
        String numeroC = txtNumber.getText();
        int edad = Integer.parseInt(txtOld.getText());
        String posicion = txtPosition.getText();
        Jugador jugador = new Jugador(nombre, numeroC, edad, posicion);
        listaJugador.ingresarInicio(jugador);
        for (int i = 0; i < listaJugador.tamaño(); i++) {
            txaJugadores.setText(listaJugador.imprimirDeInicio());
        }

        txtNameJugador.setText("");
        txtNumber.setText("");
        txtPosition.setText("");
        txtOld.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisterActionPerformed
        String nombreEquipo = txtNameEquipo.getText();
        String dt = txtDT.getText();
        Equipo equipo = new Equipo(nombreEquipo, dt, 0, listaJugador);
        listaEquipos.ingresarInicio(equipo);
        txtDT.setText("");
        txtNameEquipo.setText("");
        txaJugadores.setText("");

        listaJugador.eliminarTodo();
    }//GEN-LAST:event_txtRegisterActionPerformed

    private void btnEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquiposActionPerformed
        //matriz que alamcenara el nombre y apellido del ArrayList Atendiendo
        String matriz[][] = new String[listaEquipos.tamaño()][2];
        //bucle que recorre todo el arrayList y se le pasa a la matriz
        for (int i = 0; i < listaEquipos.tamaño(); i++) {
            matriz[i][0] = listaEquipos.devuelveElementoPorIndice(i).getNombreEquipo();
            matriz[i][1] = listaEquipos.devuelveElementoPorIndice(i).getDt();
            //se imprime en la tabla de atencion
            tblResultado.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "Nombre", "DT"
                    }
            ));
        }
    }//GEN-LAST:event_btnEquiposActionPerformed

    private void btnPosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicionesActionPerformed
        //matriz que alamcenara el nombre y apellido del ArrayList Atendiendo
        String matriz[][] = new String[listaPosicion.tamaño()][2];
        //listaPosicion.ordenarPorPuntos();
        //bucle que recorre todo el arrayList y se le pasa a la matriz
        for (int i = 0; i < listaPosicion.tamaño(); i++) {
            matriz[i][0] = listaPosicion.devuelveElementoPorIndice(i).getNombreEquipo();
            matriz[i][1] = String.valueOf(listaPosicion.devuelveElementoPorIndice(i).getPuntos());
            //se imprime en la tabla de atencion
            tblResultado.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "Nombre", "Puntos"
                    }
            ));
        }
    }//GEN-LAST:event_btnPosicionesActionPerformed

    
    private void btnFixtureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixtureActionPerformed

        if (listaEquipos.tamaño() % 2 == 0) {
            matriz = new String[listaEquipos.tamaño()][3];
            for (int i = 0; i < listaEquipos.tamaño(); i = i + 2) {
                matriz[i][0] = listaEquipos.devuelveElementoPorIndice(i).getNombreEquipo();
                matriz[i][1] = "vs";
                matriz[i][2] = listaEquipos.devuelveElementoPorIndice(i + 1).getNombreEquipo();
                //se imprime en la tabla de atencion
                tblResultado.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "Nombre", " ", "DT"
                        }
                ));
            }
        } else {
            matriz = new String[listaEquipos.tamaño() - 1][3];
            for (int i = 0; i < listaEquipos.tamaño() - 1; i = i + 2) {
                matriz[i][0] = listaEquipos.devuelveElementoPorIndice(i).getNombreEquipo();
                matriz[i][1] = "vs";
                matriz[i][2] = listaEquipos.devuelveElementoPorIndice(i + 1).getNombreEquipo();
                //se imprime en la tabla de atencion
                tblResultado.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "Nombre", " ", "DT"
                        }
                ));
            }
            JOptionPane.showMessageDialog(null, listaEquipos.devuelveElementoPorIndice(listaEquipos.tamaño() - 1).getNombreEquipo()
                    + " descansa");
        }
    }//GEN-LAST:event_btnFixtureActionPerformed

    private void btnResultadoFixtureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoFixtureActionPerformed
        listaPosicion = listaEquipos;
        String equipo1, equipo2;

        for (int i = 0; i < matriz.length; i = i + 2) {
            equipo1 = matriz[i][0];
            equipo2 = matriz[i][2];
            listaPosicion.asignarPuntaje(equipo1, equipo2);
        }
        if (listaPosicion.tamaño() % 2 == 0) {
            for (int i = 0; i < listaPosicion.tamaño()-1; i = i + 2) {
                matriz[i][0] = listaPosicion.devuelveElementoPorIndice(i).getNombreEquipo();
                matriz[i][1] = listaPosicion.devuelveElementoPorIndice(i).getPuntos() + "-"
                        + listaPosicion.devuelveElementoPorIndice(i + 1).getPuntos();
                matriz[i][2] = listaPosicion.devuelveElementoPorIndice(i + 1).getNombreEquipo();
                //se imprime en la tabla de atencion
                tblResultado.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "Nombre", " ", "DT"
                        }
                ));
            }
        }else{
            for (int i = 0; i < listaPosicion.tamaño()-2; i = i + 2) {
                matriz[i][0] = listaPosicion.devuelveElementoPorIndice(i).getNombreEquipo();
                matriz[i][1] = listaPosicion.devuelveElementoPorIndice(i).getPuntos() + "-"
                        + listaPosicion.devuelveElementoPorIndice(i + 1).getPuntos();
                matriz[i][2] = listaPosicion.devuelveElementoPorIndice(i + 1).getNombreEquipo();
                //se imprime en la tabla de atencion
                tblResultado.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "Nombre", " ", "DT"
                        }
                ));
            }
    }


    }//GEN-LAST:event_btnResultadoFixtureActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEquipos;
    private javax.swing.JButton btnFixture;
    private javax.swing.JButton btnPosiciones;
    private javax.swing.JButton btnResultadoFixture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextArea txaJugadores;
    private javax.swing.JTextField txtDT;
    private javax.swing.JTextField txtNameEquipo;
    private javax.swing.JTextField txtNameJugador;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtOld;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JButton txtRegister;
    // End of variables declaration//GEN-END:variables
}
