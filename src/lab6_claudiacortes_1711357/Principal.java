/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_claudiacortes_1711357;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Claudia Cortes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearUniverso = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_nombreUniverso = new javax.swing.JTextField();
        jc_Seres = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jd_crearSer = new javax.swing.JDialog();
        tf_raza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        js_ki = new javax.swing.JSpinner();
        js_maxanos = new javax.swing.JSpinner();
        tf_planeta = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jd_modificar = new javax.swing.JDialog();
        tf_raza1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        js_ki1 = new javax.swing.JSpinner();
        js_maxanos1 = new javax.swing.JSpinner();
        tf_planeta1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jc_Seres1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jd_eliminar = new javax.swing.JDialog();
        jc_Seres2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_universo = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jLabel1.setText("Nombre");

        jc_Seres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel2.setText("Seres vivos");

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearUniversoLayout = new javax.swing.GroupLayout(jd_crearUniverso.getContentPane());
        jd_crearUniverso.getContentPane().setLayout(jd_crearUniversoLayout);
        jd_crearUniversoLayout.setHorizontalGroup(
            jd_crearUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearUniversoLayout.createSequentialGroup()
                .addGroup(jd_crearUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearUniversoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearUniversoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jd_crearUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jc_Seres, 0, 204, Short.MAX_VALUE)
                    .addComponent(tf_nombreUniverso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_crearUniversoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jd_crearUniversoLayout.setVerticalGroup(
            jd_crearUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearUniversoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_crearUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombreUniverso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_Seres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(70, 70, 70)
                .addGroup(jd_crearUniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jLabel3.setText("Nombre Raza");

        jLabel4.setText("Numero de Ki");

        jLabel5.setText("Maximo de Años");

        jLabel7.setText("Nombre del Planeta");

        js_ki.setModel(new javax.swing.SpinnerNumberModel());

        js_maxanos.setModel(new javax.swing.SpinnerNumberModel());

        jButton3.setText("Guardar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearSerLayout = new javax.swing.GroupLayout(jd_crearSer.getContentPane());
        jd_crearSer.getContentPane().setLayout(jd_crearSerLayout);
        jd_crearSerLayout.setHorizontalGroup(
            jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearSerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearSerLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(js_maxanos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearSerLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_planeta))
                    .addGroup(jd_crearSerLayout.createSequentialGroup()
                        .addGroup(jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_raza)
                            .addComponent(js_ki, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(jd_crearSerLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_crearSerLayout.setVerticalGroup(
            jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearSerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(js_ki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(js_maxanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearSerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLabel8.setText("Nombre Raza");

        jLabel9.setText("Numero de Ki");

        jLabel10.setText("Maximo de Años");

        jLabel11.setText("Nombre del Planeta");

        js_ki1.setModel(new javax.swing.SpinnerNumberModel());

        js_maxanos1.setModel(new javax.swing.SpinnerNumberModel());

        jButton4.setText("Modificar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jc_Seres1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jc_Seres1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc_Seres1ItemStateChanged(evt);
            }
        });

        jLabel12.setText("Ser a Modificar ");

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_planeta1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_modificarLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(js_maxanos1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_modificarLayout.createSequentialGroup()
                                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(34, 34, 34)
                                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_raza1)
                                    .addComponent(js_ki1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_modificarLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(48, 48, 48)
                                .addComponent(jc_Seres1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_modificarLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_Seres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(39, 39, 39)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_raza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(js_ki1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(js_maxanos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jc_Seres2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jc_Seres2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc_Seres2ItemStateChanged(evt);
            }
        });

        jLabel13.setText("Ser a Modificar ");

        jButton5.setText("Eliminar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarLayout = new javax.swing.GroupLayout(jd_eliminar.getContentPane());
        jd_eliminar.getContentPane().setLayout(jd_eliminarLayout);
        jd_eliminarLayout.setHorizontalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButton5)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_eliminarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13)
                    .addGap(48, 48, 48)
                    .addComponent(jc_Seres2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jd_eliminarLayout.setVerticalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_eliminarLayout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(48, 48, 48))
            .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_eliminarLayout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jc_Seres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_universo.setColumns(20);
        tf_universo.setRows(5);
        jScrollPane1.setViewportView(tf_universo);

        jLabel6.setText("Datos del Universo");

        jMenu1.setText("Crear");

        jMenuItem1.setText("Universo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Seres Vivos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cargar el Archivo de Texto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Administrar");

        jMenuItem4.setText("Modificar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Eliminar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel6)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        Universo U = new Universo();
        String Nombre = tf_nombreUniverso.getText();
        if (SeresPlaneta.size() < 1 || tf_nombreUniverso.getText() == "") {
            JOptionPane.showMessageDialog(jd_crearUniverso, "TODOS LOS CAMPOS SON OBLIGATORIOS");
        } else {
            try {
                U.setNombre(Nombre);
                U.setSeres_Vivos(SeresPlaneta);
                JFileChooser jfc = new JFileChooser();
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
                jfc.addChoosableFileFilter(filtro);
                jfc.setSelectedFile(new File(Nombre + ".txt"));
                int seleccion = jfc.showSaveDialog(this);
                // jfc.setSelectedFile(new File(UnivresoActual.getNombre() + ".txt"));
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    SeresPlaneta = new ArrayList();
                    System.out.println(jfc.getSelectedFile().getPath());
                    U.creararchivo(jfc.getSelectedFile().getPath());
                    U.escribirArchivo();
                    UnivresoActual = U;
                    JOptionPane.showMessageDialog(jd_crearSer, "Se ha Guardado el archivo adecuadamente");
                }

                // System.out.println(jfc.getSelectedFile().getPath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(jd_crearUniverso, "No se ha Guardado el archivo");
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        SeresPlaneta.add(((Seres) jc_Seres.getSelectedItem()));
        JOptionPane.showMessageDialog(jd_crearSer, "Ser vivo Agregado");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (tf_planeta.getText() == "" || tf_raza.getText() == "" || (int) js_maxanos.getValue() == 0 || (int) js_ki.getValue() == 0) {
            JOptionPane.showMessageDialog(jd_crearSer, "TODOS LOS CAMPOS SON OBLIGATORIOS");
        } else {
            String Nombre_Raza = tf_raza.getText();
            int Ki = (int) js_ki.getValue();
            int Max_anos = (int) js_maxanos.getValue();
            String Planeta = tf_planeta.getText();
            DefaultComboBoxModel Modelo = (DefaultComboBoxModel) jc_Seres.getModel();
            Modelo.addElement(new Seres(Nombre_Raza, Ki, Max_anos, Planeta));

            jc_Seres.setModel(Modelo);

            JOptionPane.showMessageDialog(jd_crearSer, "Se ha Creado El ser Correctamente");

        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_crearUniverso.show();
        jd_crearUniverso.pack();
        //jd_crearUniverso.setModal(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jd_crearSer.show();
        jd_crearSer.pack();
        //  jd_crearSer.setModal(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Universo u = new Universo();
        tf_universo.setText(u.Abrir());
        u.cargarArchivo();
        System.out.println("LOS SERES VIVOS DE EL" + u.getSeres_Vivos());
        UnivresoActual = u;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (tf_planeta1.getText() == "" || tf_raza1.getText() == "" || (int) js_maxanos1.getValue() == 0 || (int) js_ki1.getValue() == 0) {
            JOptionPane.showMessageDialog(jd_modificar, "TODOS LOS CAMPOS SON OBLIGATORIOS");
        } else {

            try {
                String Nombre_Raza = tf_raza1.getText();
                int Ki = (int) js_ki1.getValue();
                int Max_anos = (int) js_maxanos1.getValue();
                String Planeta = tf_planeta1.getText();
                Ser.setNombre_Raza(Nombre_Raza);
                Ser.setMax_anos(Max_anos);
                Ser.setKi(Ki);
                Ser.setPlaneta(Planeta);
                UnivresoActual.getSeres_Vivos().get(Pos).setNombre_Raza(Nombre_Raza);
                UnivresoActual.getSeres_Vivos().get(Pos).setMax_anos(Max_anos);
                UnivresoActual.getSeres_Vivos().get(Pos).setKi(Ki);
                UnivresoActual.getSeres_Vivos().get(Pos).setPlaneta(Planeta);
                UnivresoActual.escribirArchivo();
                JOptionPane.showMessageDialog(jd_modificar, "Se ha Modificado el ser correctamente");
            } catch (IOException e) {

            }

        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jd_modificar.show();
        jd_modificar.pack();
        DefaultComboBoxModel Modelo = new DefaultComboBoxModel() ;
        for (int i = 0; i < UnivresoActual.getSeres_Vivos().size(); i++) {
            Modelo.addElement(UnivresoActual.getSeres_Vivos().get(i));
        }
        jc_Seres1.setModel(Modelo);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jd_eliminar.show();
        jd_eliminar.pack();
        DefaultComboBoxModel Modelo =new DefaultComboBoxModel() ;
        for (int i = 0; i < UnivresoActual.getSeres_Vivos().size(); i++) {
            Modelo.addElement(UnivresoActual.getSeres_Vivos().get(i));
        }
        jc_Seres2.setModel(Modelo);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jc_Seres1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_Seres1ItemStateChanged
        Ser = ((Seres) jc_Seres1.getSelectedItem());
        Pos = jc_Seres1.getSelectedIndex();
        System.out.println("NUM"+Pos);
        try {
            tf_raza1.setText(UnivresoActual.getSeres_Vivos().get(Pos).getNombre_Raza());
            js_ki1.setValue(UnivresoActual.getSeres_Vivos().get(Pos).getMax_anos());
            js_maxanos1.setValue(UnivresoActual.getSeres_Vivos().get(Pos).getKi());
            tf_planeta1.setText(UnivresoActual.getSeres_Vivos().get(Pos).getPlaneta());
            UnivresoActual.escribirArchivo();

        } catch (IOException e) {

        }
    }//GEN-LAST:event_jc_Seres1ItemStateChanged

    private void jc_Seres2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_Seres2ItemStateChanged
  Pos = jc_Seres2.getSelectedIndex()-1 ;
        System.out.println("NUM"+Pos);

    }//GEN-LAST:event_jc_Seres2ItemStateChanged

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
            UnivresoActual.getSeres_Vivos().remove(Pos);
            jc_Seres2.remove(Pos);
            jc_Seres1.remove(Pos);
            UnivresoActual.escribirArchivo();
            JOptionPane.showMessageDialog(jd_eliminar, "El elemento se ha eliminado adecuadamente");
        } catch (IOException e) {

        }
    }//GEN-LAST:event_jButton5MouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jc_Seres;
    private javax.swing.JComboBox<String> jc_Seres1;
    private javax.swing.JComboBox<String> jc_Seres2;
    private javax.swing.JDialog jd_crearSer;
    private javax.swing.JDialog jd_crearUniverso;
    private javax.swing.JDialog jd_eliminar;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JSpinner js_ki;
    private javax.swing.JSpinner js_ki1;
    private javax.swing.JSpinner js_maxanos;
    private javax.swing.JSpinner js_maxanos1;
    private javax.swing.JTextField tf_nombreUniverso;
    private javax.swing.JTextField tf_planeta;
    private javax.swing.JTextField tf_planeta1;
    private javax.swing.JTextField tf_raza;
    private javax.swing.JTextField tf_raza1;
    private javax.swing.JTextArea tf_universo;
    // End of variables declaration//GEN-END:variables
   private ArrayList<Seres> SeresPlaneta = new ArrayList();
    private Universo UnivresoActual;
    private Seres Ser;
    private int Pos;
}
