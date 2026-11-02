package com.example;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.util.HibernateUtil;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Memulai Pengujian Hibernate Kelompok 8 ===");
        try {
            UserDao userDao = new UserDao();

            if (!userDao.validate("shofwatunnisa", "123456")) {
                System.out.println("Menambahkan akun Shofwatunnisa...");
                userDao.saveUser(new User("Shofwatunnisa", "", "shofwatunnisa", "123456"));
            }

            if (!userDao.validate("sitidibaj", "123456")) {
                System.out.println("Menambahkan akun Siti Dibaj...");
                userDao.saveUser(new User("Siti Dibaj", "Trikusuma", "sitidibaj", "123456"));
            }

            if (!userDao.validate("rusmin", "123456")) {
                System.out.println("Menambahkan akun Rusmin...");
                userDao.saveUser(new User("Rusmin", "Nuryadin", "rusmin", "123456"));
            }

            boolean isValid = userDao.validate("shofwatunnisa", "123456");
            if (isValid) {
                System.out.println("\n>>> [SUCCESS] Login Berhasil untuk user 'shofwatunnisa'!");
            }

            System.out.println("Koneksi Hibernate ke database BERHASIL!");
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan saat menghubungkan ke database: " + e.getMessage());
            e.printStackTrace();
        } finally {
            HibernateUtil.shutdown();
        }
    }
}