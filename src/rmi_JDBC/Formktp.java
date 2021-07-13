/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_JDBC;

import Mainpage.Homepage;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author edwin
 */
public class Formktp extends javax.swing.JFrame {

    /**
     * Creates new form client
     */
    public Formktp() {
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

        btngroupjk = new javax.swing.ButtonGroup();
        btngroupdar = new javax.swing.ButtonGroup();
        btngroupwarneg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labeltitle = new javax.swing.JLabel();
        labelnik = new javax.swing.JLabel();
        labelnama = new javax.swing.JLabel();
        txtnik = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        labeltmplh = new javax.swing.JLabel();
        labeltnglh = new javax.swing.JLabel();
        txttmplh = new javax.swing.JTextField();
        txttngllh = new javax.swing.JTextField();
        labeljk = new javax.swing.JLabel();
        rdlaki = new javax.swing.JRadioButton();
        rdperem = new javax.swing.JRadioButton();
        labelgoldar = new javax.swing.JLabel();
        rdo = new javax.swing.JRadioButton();
        rdab = new javax.swing.JRadioButton();
        rda = new javax.swing.JRadioButton();
        rdb = new javax.swing.JRadioButton();
        labelal = new javax.swing.JLabel();
        txtal = new javax.swing.JTextField();
        labelrt = new javax.swing.JLabel();
        labelrw = new javax.swing.JLabel();
        txtrt = new javax.swing.JTextField();
        txtrw = new javax.swing.JTextField();
        labelkec = new javax.swing.JLabel();
        txtkec = new javax.swing.JTextField();
        labelkelde = new javax.swing.JLabel();
        txtkelde = new javax.swing.JTextField();
        labelag = new javax.swing.JLabel();
        txtag = new javax.swing.JTextField();
        labelsk = new javax.swing.JLabel();
        txtsk = new javax.swing.JTextField();
        labelpek = new javax.swing.JLabel();
        txtpek = new javax.swing.JTextField();
        labelkwn = new javax.swing.JLabel();
        rdwni = new javax.swing.JRadioButton();
        rdwna = new javax.swing.JRadioButton();
        btnins = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnupd = new javax.swing.JButton();
        btnsea = new javax.swing.JButton();
        lbltgl = new javax.swing.JLabel();
        btclose = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labeltitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltitle.setText("Data Kependudukan KTP Kota Salatiga");

        labelnik.setText("NIK :");

        labelnama.setText("Nama :");

        labeltmplh.setText("Kota kelahiran:");

        labeltnglh.setText("Tanggal lahir:");

        labeljk.setText("Jenis Kelamin:");

        btngroupjk.add(rdlaki);
        rdlaki.setText("L");
        rdlaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlakiActionPerformed(evt);
            }
        });

        btngroupjk.add(rdperem);
        rdperem.setText("P");
        rdperem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdperemActionPerformed(evt);
            }
        });

        labelgoldar.setText("Gol. Darah:");

        btngroupdar.add(rdo);
        rdo.setText("O");

        btngroupdar.add(rdab);
        rdab.setText("AB");

        btngroupdar.add(rda);
        rda.setText("A");

        btngroupdar.add(rdb);
        rdb.setText("B");

        labelal.setText("Alamat:");

        labelrt.setText("RT");

        labelrw.setText("RW");

        labelkec.setText("Kecamatan :");

        labelkelde.setText("Kel/Desa :");

        labelag.setText("Agama :");

        labelsk.setText("Status Kawin :");

        labelpek.setText("Pekerjaan :");

        labelkwn.setText("Kewarganegaraan :");

        btngroupwarneg.add(rdwni);
        rdwni.setText("WNI");

        btngroupwarneg.add(rdwna);
        rdwna.setText("WNA");

        btnins.setText("Insert");
        btnins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsActionPerformed(evt);
            }
        });

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnupd.setText("Update");
        btnupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdActionPerformed(evt);
            }
        });

        btnsea.setText("Search");
        btnsea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseaActionPerformed(evt);
            }
        });

        lbltgl.setText("Format tanggal : yyyy-mm-dd (angka)");

        btclose.setText("Close");
        btclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcloseActionPerformed(evt);
            }
        });

        btnhome.setText("Home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labeljk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdlaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdperem))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelgoldar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdb))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelkec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtkec, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelkelde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtkelde, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtag, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelsk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelpek)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpek, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelkwn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdwni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdwna))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labeltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btclose))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labeltnglh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txttngllh))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labeltmplh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttmplh, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelnama)
                                            .addComponent(labelnik))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnik, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(txtnama))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnhome))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(labelrt)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtrt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelrw)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtrw, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(lbltgl)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnins)
                        .addGap(30, 30, 30)
                        .addComponent(btndel)
                        .addGap(28, 28, 28)
                        .addComponent(btnupd)
                        .addGap(34, 34, 34)
                        .addComponent(btnsea)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btclose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnik)
                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelnama)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltmplh)
                    .addComponent(txttmplh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeltnglh)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttngllh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltgl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeljk)
                    .addComponent(rdlaki)
                    .addComponent(rdperem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelgoldar)
                    .addComponent(rdo)
                    .addComponent(rdab)
                    .addComponent(rda)
                    .addComponent(rdb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelal)
                    .addComponent(txtal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelrt)
                    .addComponent(labelrw)
                    .addComponent(txtrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelkelde)
                    .addComponent(txtkelde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtkec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelkec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelag)
                    .addComponent(txtag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelsk)
                    .addComponent(txtsk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelpek)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelkwn)
                        .addComponent(rdwni)
                        .addComponent(rdwna)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnins)
                    .addComponent(btndel)
                    .addComponent(btnupd)
                    .addComponent(btnsea))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdlakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlakiActionPerformed

    private void rdperemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdperemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdperemActionPerformed

    private void btnupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdActionPerformed
        // TODO add your handling code here:

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
//            Statement st = (Statement) con.createStatement();
            String nik = txtnik.getText();
            String nama = txtnama.getText();
            String tmla = txttmplh.getText();
            String tgla = txttngllh.getText();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedate = format.parse(tgla);
            java.sql.Date sqltgl = new java.sql.Date(parsedate.getTime());
            String jenkel = "";
            if (rdlaki.isSelected()) {
                jenkel = rdlaki.getText();
            } else {
                jenkel = rdperem.getText();
            }
            String goldar = "";
            if (rdo.isSelected()) {
                goldar = rdo.getText();
            } else if (rdab.isSelected()) {
                goldar = rdab.getText();
            } else if (rda.isSelected()) {
                goldar = rda.getText();
            } else {
                goldar = rdb.getText();
            }
            String alm = txtal.getText();
            String rt = txtrt.getText();
            String rw = txtrw.getText();
            String kedes = txtkelde.getText();
            String kec = txtkec.getText();
            String ag = txtag.getText();
            String sk = txtsk.getText();
            String pek = txtpek.getText();
            String wn = "";
            if (rdwna.isSelected()) {
                wn = rdwna.getText();
            } else {
                wn = rdwni.getText();
            }
            Interfacermi dbin = (Interfacermi) Naming.lookup("rmi://localhost:1089/db");
            String res = dbin.Update(nik, nama, tmla, sqltgl, jenkel, goldar, alm, rt, rw, kedes, kec, ag, sk, pek, wn);
            JOptionPane.showMessageDialog(null, res, "sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnupdActionPerformed

    private void btnseaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseaActionPerformed
        // TODO add your handling code here:
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
//            Statement st = (Statement) con.createStatement();

            String nik = txtnik.getText();

            Interfacermi dbin = (Interfacermi) Naming.lookup("rmi://localhost:1089/db");
            ArrayList res = dbin.Search(nik);
            JOptionPane.showMessageDialog(null, res, "sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnseaActionPerformed

    private void btninsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsActionPerformed
        // TODO add your handling code here:
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
//            Statement st = (Statement) con.createStatement();

            String nik = txtnik.getText();
            String nama = txtnama.getText();
            String tmla = txttmplh.getText();
            String tgla = txttngllh.getText();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedate = format.parse(tgla);
            java.sql.Date sqltgl = new java.sql.Date(parsedate.getTime());
            String jenkel = "";
            if (rdlaki.isSelected()) {
                jenkel = rdlaki.getText();
            } else {
                jenkel = rdperem.getText();
            }
            String goldar = "";
            if (rdo.isSelected()) {
                goldar = rdo.getText();
            } else if (rdab.isSelected()) {
                goldar = rdab.getText();
            } else if (rda.isSelected()) {
                goldar = rda.getText();
            } else {
                goldar = rdb.getText();
            }
            String alm = txtal.getText();
            String rt = txtrt.getText();
            String rw = txtrw.getText();
            String kedes = txtkelde.getText();
            String kec = txtkec.getText();
            String ag = txtag.getText();
            String sk = txtsk.getText();
            String pek = txtpek.getText();
            String wn = "";
            if (rdwna.isSelected()) {
                wn = rdwna.getText();
            } else {
                wn = rdwni.getText();
            }
            Interfacermi dbin = (Interfacermi) Naming.lookup("rmi://localhost:1089/db");
            String res = dbin.Insert(nik, nama, tmla, sqltgl, jenkel, goldar, alm, rt, rw, kedes, kec, ag, sk, pek, wn);
            JOptionPane.showMessageDialog(null, res, "sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btninsActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
//            Statement st = (Statement) con.createStatement();

            String nik = txtnik.getText();
            Interfacermi dbin = (Interfacermi) Naming.lookup("rmi://localhost:1089/db");
            String res = dbin.Delete(nik);
            JOptionPane.showMessageDialog(null, res, "sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btndelActionPerformed

    private void btcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btcloseActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
        new Homepage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnhomeActionPerformed

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
            java.util.logging.Logger.getLogger(Formktp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formktp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formktp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formktp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formktp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btclose;
    private javax.swing.JButton btndel;
    private javax.swing.ButtonGroup btngroupdar;
    private javax.swing.ButtonGroup btngroupjk;
    private javax.swing.ButtonGroup btngroupwarneg;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnins;
    private javax.swing.JButton btnsea;
    private javax.swing.JButton btnupd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelag;
    private javax.swing.JLabel labelal;
    private javax.swing.JLabel labelgoldar;
    private javax.swing.JLabel labeljk;
    private javax.swing.JLabel labelkec;
    private javax.swing.JLabel labelkelde;
    private javax.swing.JLabel labelkwn;
    private javax.swing.JLabel labelnama;
    private javax.swing.JLabel labelnik;
    private javax.swing.JLabel labelpek;
    private javax.swing.JLabel labelrt;
    private javax.swing.JLabel labelrw;
    private javax.swing.JLabel labelsk;
    private javax.swing.JLabel labeltitle;
    private javax.swing.JLabel labeltmplh;
    private javax.swing.JLabel labeltnglh;
    private javax.swing.JLabel lbltgl;
    private javax.swing.JRadioButton rda;
    private javax.swing.JRadioButton rdab;
    private javax.swing.JRadioButton rdb;
    private javax.swing.JRadioButton rdlaki;
    private javax.swing.JRadioButton rdo;
    private javax.swing.JRadioButton rdperem;
    private javax.swing.JRadioButton rdwna;
    private javax.swing.JRadioButton rdwni;
    private javax.swing.JTextField txtag;
    private javax.swing.JTextField txtal;
    private javax.swing.JTextField txtkec;
    private javax.swing.JTextField txtkelde;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtpek;
    private javax.swing.JTextField txtrt;
    private javax.swing.JTextField txtrw;
    private javax.swing.JTextField txtsk;
    private javax.swing.JTextField txttmplh;
    private javax.swing.JTextField txttngllh;
    // End of variables declaration//GEN-END:variables
}
