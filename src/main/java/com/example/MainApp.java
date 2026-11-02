package com.example;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.util.HibernateUtil;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Memulai Pengujian Hibernate Kelompok 8 ===");
        try {
            UserDao userDao = new UserDao();

            // Validasi akun default (admin / 12345)
            boolean isValid = userDao.validate("admin", "12345");
            if (!isValid) {
                System.out.println("User admin belum ada di database, menambahkan user default...");
                userDao.saveUser(new User("admin", "12345"));
                System.out.println("User default (admin / 12345) berhasil ditambahkan.");
            } else {
                System.out.println("User default (admin / 12345) sudah ada di database dan valid!");
            }

            System.out.println("Koneksi Hibernate ke database 'kelompok8' BERHASIL!");
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan saat menghubungkan ke database kelompok8: " + e.getMessage());
            e.printStackTrace();
        } finally {
            HibernateUtil.shutdown();
        }
    }
}
