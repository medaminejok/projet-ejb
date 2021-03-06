/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import dao.IVehicule;
import entities.Vehicule;
import java.text.MessageFormat;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author EL MAHDI
 */
public class Vehicules extends javax.swing.JInternalFrame {

    
    private IVehicule remote;
    private DefaultTableModel model;
    private int id = -1;
    public static IVehicule lookUp() throws NamingException {
		Hashtable<Object, Object> config = new Hashtable<Object, Object>();
		config.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		config.put(Context.PROVIDER_URL, "http-remoting://localhost:8099");
		final Context context = new InitialContext(config);
		return (IVehicule) context.lookup("ejb:/LocalisationEJB-SERVER/VEH!dao.IVehicule");
	}

    /**
     * Creates new form Machines
     */
    public Vehicules() {
         try {
            initComponents();
            model = (DefaultTableModel) listeM.getModel();
            remote = lookUp();
            Load();
        } catch (NamingException ex) {
            Logger.getLogger(Vehicules.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Load() {
        for(Vehicule v:remote.findAll()) {
            model.addRow(new Object[]{
                v.getId(),
                v.getMatricule(),
                v.getMarque(),
                v.getType()

            });
        };

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeM = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        matricule = new javax.swing.JTextField();
        marque = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        sup = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        nouvaeu = new javax.swing.JLabel();
        modif = new javax.swing.JLabel();
        ADD = new javax.swing.JLabel();
        Modify = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion Machines");
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDoubleBuffered(true);

        jPanel4.setForeground(new java.awt.Color(0, 11, 28));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste Des Vehicules", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        listeM.setAutoCreateRowSorter(true);
        listeM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matricule", "Marque", "Type"
            }
        ));
        listeM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listeM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations Vehicule", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("Matricule:");

        jLabel3.setText("Marque:");

        jLabel4.setText("Type:");

        matricule.setBackground(new java.awt.Color(204, 255, 255));

        marque.setBackground(new java.awt.Color(204, 255, 255));
        marque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marqueActionPerformed(evt);
            }
        });

        type.setBackground(new java.awt.Color(204, 255, 255));

        sup.setToolTipText("supprimer le client");
        sup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supMouseClicked(evt);
            }
        });

        ajouter.setToolTipText("Ajouter le client");
        ajouter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMouseClicked(evt);
            }
        });

        nouvaeu.setToolTipText("Nouveau client");
        nouvaeu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nouvaeu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nouvaeuMouseClicked(evt);
            }
        });

        modif.setToolTipText("Modifier le client");
        modif.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        modif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifMouseClicked(evt);
            }
        });

        ADD.setText("Ajouter");
        ADD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
        });

        Modify.setText("Modifier");
        Modify.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifyMouseClicked(evt);
            }
        });

        delete.setText("Supprimer");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nouvaeu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(matricule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addComponent(marque, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Modify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(ajouter)
                .addGap(18, 18, 18)
                .addComponent(sup)
                .addGap(18, 18, 18)
                .addComponent(modif)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {marque, matricule, type});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ADD))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Modify))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sup, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ajouter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modif, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(88, 88, 88)
                .addComponent(nouvaeu)
                .addGap(35, 35, 35))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gestion des Vehicule");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listeMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeMMouseClicked
        // TODO add your handling code here:

        id = Integer.parseInt(model.getValueAt(listeM.getSelectedRow(), 0).toString());
        marque.setText(model.getValueAt(listeM.getSelectedRow(), 1).toString());
        matricule.setText(model.getValueAt(listeM.getSelectedRow(), 2).toString());
        type.setText(model.getValueAt(listeM.getSelectedRow(), 3).toString());

    }//GEN-LAST:event_listeMMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        model.setRowCount(0);
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer?");
        if (reponse == 0) {
            if (remote.supprimer(remote.findById(id))) {
                JOptionPane.showMessageDialog(this, "Bien Supprim??");
                Load();
            } else {
                JOptionPane.showMessageDialog(this, "Erreur de suppression");
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void ModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyMouseClicked
        // TODO add your handling code here:
        model.setRowCount(0);
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment modifier?");
        if (reponse == 0) {
            String mar = marque.getText();
            String tp = type.getText();
            String mat = matricule.getText();

            if (remote.modifier(new Vehicule(mat,mar,tp))) {
                JOptionPane.showMessageDialog(this, "Bien Modifi??");
                Load();
            } else {
                JOptionPane.showMessageDialog(this, "Erreur de Modification");
            }
        }
    }//GEN-LAST:event_ModifyMouseClicked

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        // TODO add your handling code here:
        model.setRowCount(0);
        String mar = marque.getText();
        String tp = type.getText();
        String mat = matricule.getText();
        if (remote.ajouter(new Vehicule(mat, mar,tp))) {
            JOptionPane.showMessageDialog(this, "Bien Ajoute");
            Load();
        } else {
            JOptionPane.showMessageDialog(this, "Erreur D'Ajout");
        }
    }//GEN-LAST:event_ADDMouseClicked

    private void modifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifMouseClicked

    }//GEN-LAST:event_modifMouseClicked

    private void nouvaeuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouvaeuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nouvaeuMouseClicked

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterMouseClicked

    private void supMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supMouseClicked

    private void marqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADD;
    private javax.swing.JLabel Modify;
    private javax.swing.JLabel ajouter;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listeM;
    private javax.swing.JTextField marque;
    private javax.swing.JTextField matricule;
    private javax.swing.JLabel modif;
    private javax.swing.JLabel nouvaeu;
    private javax.swing.JLabel sup;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
