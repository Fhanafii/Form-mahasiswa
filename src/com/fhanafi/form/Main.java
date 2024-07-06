package com.fhanafi.form;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {
        // Memanggil metode getConnection dari kelas Koneksi
        Connection conn = Koneksi.getConnection();

        // Memeriksa apakah koneksi berhasil
        if (conn != null) {
            System.out.println("Koneksi ke database berhasil!");
        } else {
            System.out.println("Koneksi ke database gagal.");
        }

        // Lakukan operasi database lainnya di sini
        mhsInterface mi = new mhsInterface();
        mi.setVisible(true);
        mi.pack();
        mi.setLocationRelativeTo(null);
        mi.setDefaultCloseOperation(mhsInterface.EXIT_ON_CLOSE);

        // Menambahkan WindowListener untuk mendeteksi penutupan jendela
        mi.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Tutup koneksi jika sudah selesai
                try {
                    if (conn != null && !conn.isClosed()) {
                        conn.close();
                        System.out.println("Koneksi ke database ditutup.");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
