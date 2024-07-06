package com.fhanafi.form;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mhsInterface extends javax.swing.JFrame {

    /**
     * Creates new form mhsInterface
     */
    public mhsInterface() {
        initComponents();
        loadDataToTable();
    }

    public static String nama;
    public static String nim;
    public static String alamat;
    public static String phone;
    public static String jurusan;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1_nim = new javax.swing.JLabel();
        jTextField1_nim = new javax.swing.JTextField();
        jLabel2_jurusan = new javax.swing.JLabel();
        jComboBox1_jurusan = new javax.swing.JComboBox<>();
        jLabel3_alamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_alamat = new javax.swing.JTextArea();
        jLabel4_phone = new javax.swing.JLabel();
        jTextField2_phone = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel5_nama = new javax.swing.JLabel();
        jTextField3_nama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_nim.setText("NIM");

        jLabel2_jurusan.setText("Jurusan");

        jComboBox1_jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik informatika", "Manajemen", "Sistem informasi" }));

        jLabel3_alamat.setText("Alamat");

        jTextArea_alamat.setColumns(20);
        jTextArea_alamat.setRows(5);
        jScrollPane1.setViewportView(jTextArea_alamat);

        jLabel4_phone.setText("Phone");

        Save.setText("Save");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });

        jLabel5_nama.setText("Nama");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Nim", "Nama", "Jurusan", "Alamat", "Phone"
                }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2_jurusan)
                                                                .addComponent(jLabel1_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTextField2_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jTextField1_nim, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBox1_jurusan, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE))
                                                                .addGap(52, 52, 52)
                                                                .addComponent(jLabel5_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextField3_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1_nim)
                                        .addComponent(jTextField1_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5_nama)
                                        .addComponent(jTextField3_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2_jurusan)
                                        .addComponent(jComboBox1_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3_alamat)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4_phone)
                                        .addComponent(jTextField2_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Save)
                                        .addComponent(Delete)
                                        .addComponent(Reset))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        nama = jTextField3_nama.getText();
        nim = jTextField1_nim.getText();
        alamat = jTextArea_alamat.getText();
        phone = jTextField2_phone.getText();
        jurusan = (String) jComboBox1_jurusan.getSelectedItem();
        //Memasukkan data ke dalam tabel mhs1 di database mahasiswa
        Koneksi.insertData(nim, nama, jurusan, alamat, phone);

        // Menambahkan data ke tabel
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{nim, nama, jurusan, alamat, phone});
    }

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {
        // Mendapatkan NIM dari text field
        String nim = jTextField1_nim.getText();

        // Menghapus data dari tabel mhs1 di database mahasiswa
        Koneksi.deleteData(nim);

        // Mendapatkan indeks baris yang dipilih
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Menghapus baris yang dipilih
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.");
        }

    }

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        // Mengosongkan semua text field dan text area
        jTextField1_nim.setText("");
        jTextField2_phone.setText("");
        jTextField3_nama.setText("");
        jTextArea_alamat.setText("");

        // Mengembalikan combo box ke item pertama
        jComboBox1_jurusan.setSelectedIndex(0);
    }
    private void loadDataToTable() {
        ArrayList<String[]> dataList = Koneksi.getAllData();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (String[] data : dataList) {
            model.addRow(data);
        }
    }

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
            java.util.logging.Logger.getLogger(mhsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mhsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mhsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mhsInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mhsInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Delete;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> jComboBox1_jurusan;
    private javax.swing.JLabel jLabel1_nim;
    private javax.swing.JLabel jLabel2_jurusan;
    private javax.swing.JLabel jLabel3_alamat;
    private javax.swing.JLabel jLabel4_phone;
    private javax.swing.JLabel jLabel5_nama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_alamat;
    private javax.swing.JTextField jTextField1_nim;
    private javax.swing.JTextField jTextField2_phone;
    private javax.swing.JTextField jTextField3_nama;
    // End of variables declaration
}
