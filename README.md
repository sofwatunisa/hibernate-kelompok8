Proyek Web & Hibernate ORM - Kelompok 8

Proyek ini adalah aplikasi berbasis Java Web Native (Servlet/WAR) yang mengimplementasikan Hibernate ORM untuk manajemen database MySQL. Proyek ini merupakan bagian dari tugas mata kuliah Rekayasa Perangkat Lunak Lanjut.

Anggota Kelompok

Shofwatunnisa

Siti Dibaj Trikusuma

Rusmin Nuryadin

Teknologi yang Digunakan

Bahasa: Java (JDK 21)

Framework ORM: Hibernate Core 6.4.4.Final

Database: MySQL (XAMPP)

Web Server: Apache Tomcat

Build Tool: Maven

IDE: IntelliJ IDEA

Fitur & Pembaruan Terakhir

Migrasi Struktur: Mengubah struktur awal dari Spring Boot menjadi Java Web Native (WAR/JSP/Servlet).

Konfigurasi Hibernate: Pembaruan file hibernate.cfg.xml untuk koneksi ke database kelompok8_hibernate menggunakan kredensial root.

Mapping Entity: Penyesuaian anotasi @Column(name = "user_name") pada model User.java agar selaras dengan skema database lama (mencegah field default value error).

Auto-Seeding Data: Penambahan logika di MainApp.java untuk otomatis menyisipkan 3 akun default anggota kelompok saat aplikasi pertama kali dijalankan.

Cara Menjalankan Aplikasi

1. Persiapan Database

Pastikan modul MySQL pada XAMPP sudah berjalan (Start).

Buat database baru bernama kelompok8_hibernate di phpMyAdmin (jika belum ada).

Struktur tabel users akan digenerate otomatis oleh Hibernate.

2. Pengujian Koneksi (Console)

Untuk memastikan Hibernate terkoneksi dan data default masuk ke database:

Buka file src/main/java/com/example/MainApp.java di IntelliJ.

Klik tombol Run 'MainApp.main()'.

Pastikan di konsol muncul pesan >>> [SUCCESS] Login Berhasil dan Process finished with exit code 0.

3. Menjalankan Web (Tomcat)

Buka menu Run > Edit Configurations di IntelliJ.

Tambahkan Tomcat Server > Local.

Di tab Deployment, tambahkan Artifact hibernate-kelompok8:war exploded (atau .war).

Atur Application context menjadi /hibernate-kelompok8.

Klik Apply lalu jalankan (Play) server Tomcat.

Browser akan terbuka otomatis di http://localhost:8080/hibernate-kelompok8/.

Kredensial Login

Gunakan salah satu akun berikut untuk masuk ke dalam aplikasi web:

Username: shofwatunnisa | Password: 123456

Username: sitidibaj | Password: 123456

Username: rusmin | Password: 123456