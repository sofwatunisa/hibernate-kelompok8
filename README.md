# Proyek Web & Hibernate ORM - Kelompok 8

Aplikasi manajemen data pengguna berbasis **Java Web Native** yang mengimplementasikan **Hibernate ORM** untuk mengelola interaksi dengan database MySQL. Proyek ini dikembangkan sebagai bagian dari tugas mata kuliah **Rekayasa Perangkat Lunak Lanjut**.

## Anggota Kelompok

| No. | Nama Anggota |
|:---:|---|
| 1 | Shofwatunnisa |
| 2 | Siti Dibaj Trikusuma |
| 3 | Rusmin Nuryadin |

## Teknologi yang Digunakan

| Teknologi | Keterangan |
|---|---|
| Java | JDK 21 |
| Hibernate ORM | 6.4.4.Final |
| Database | MySQL |
| Database Management | XAMPP / phpMyAdmin |
| Web Server | Apache Tomcat |
| Build Tool | Maven |
| IDE | IntelliJ IDEA |
| Web Technology | Java Servlet & JSP |
| Packaging | WAR (Web Application Archive) |

## Fitur dan Implementasi

Proyek ini memiliki beberapa implementasi utama, yaitu:

- **Java Web Native:** Migrasi struktur aplikasi dari Spring Boot menjadi Java Web Native menggunakan Servlet, JSP, dan WAR.
- **Hibernate ORM:** Implementasi Hibernate sebagai Object Relational Mapping (ORM) untuk menghubungkan aplikasi Java dengan database MySQL.
- **Database Configuration:** Konfigurasi koneksi database melalui file `hibernate.cfg.xml` dengan database `kelompok8_hibernate`.
- **Entity Mapping:** Penyesuaian mapping kolom menggunakan anotasi `@Column(name = "user_name")` pada entity `User.java` agar sesuai dengan struktur tabel database.
- **Auto-Seeding Data:** Implementasi mekanisme penyisipan tiga akun pengguna default secara otomatis ketika aplikasi pertama kali dijalankan.
- **User Authentication:** Fitur autentikasi pengguna menggunakan username dan password yang telah tersimpan di database.

## Struktur Proyek

```text
hibernate-kelompok8/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/
│       │       ├── MainApp.java
│       │       └── ...
│       ├── resources/
│       │   └── hibernate.cfg.xml
│       └── webapp/
│           └── ...
├── pom.xml
└── README.md
```

## Persyaratan Sistem

Sebelum menjalankan aplikasi, pastikan beberapa perangkat lunak berikut telah tersedia:

1. JDK 21.
2. IntelliJ IDEA.
3. Apache Maven.
4. XAMPP dengan modul MySQL.
5. Apache Tomcat.
6. Browser untuk mengakses aplikasi web.

## Cara Menjalankan Aplikasi

### 1. Persiapan Database

1. Buka XAMPP Control Panel.
2. Jalankan modul **MySQL**.
3. Buka phpMyAdmin melalui `http://localhost/phpmyadmin`.
4. Buat database baru dengan nama:

   ```sql
   kelompok8_hibernate
   ```

5. Pastikan konfigurasi database pada file `hibernate.cfg.xml` telah sesuai dengan pengaturan MySQL lokal.

Hibernate akan membuat struktur tabel secara otomatis berdasarkan mapping entity yang telah dikonfigurasi.

### 2. Pengujian Koneksi Hibernate

Untuk memastikan Hibernate berhasil terhubung dengan database dan proses penyisipan data berjalan dengan baik:

1. Buka proyek melalui IntelliJ IDEA.
2. Arahkan ke file `src/main/java/com/example/MainApp.java`.
3. Jalankan method `MainApp.main()`.
4. Periksa hasil eksekusi pada console.

Apabila proses berhasil, console akan menampilkan pesan:

```text
>>> [SUCCESS] Login Berhasil
Process finished with exit code 0
```

### 3. Menjalankan Aplikasi Web Menggunakan Tomcat

1. Buka IntelliJ IDEA.
2. Pilih menu **Run > Edit Configurations**.
3. Klik tombol **Add New Configuration**.
4. Pilih **Tomcat Server > Local**.
5. Pada bagian **Deployment**, tambahkan artifact:

   ```text
   hibernate-kelompok8:war exploded
   ```

   Jika diperlukan, artifact `.war` juga dapat digunakan.

6. Atur Application Context menjadi:

   ```text
   /hibernate-kelompok8
   ```

7. Klik **Apply**, kemudian **OK**.
8. Jalankan server Tomcat dengan menekan tombol **Run**.
9. Buka browser dan akses alamat berikut:

   ```text
   http://localhost:8080/hibernate-kelompok8/
   ```

## Akun Pengguna

Aplikasi menyediakan tiga akun default yang dapat digunakan untuk pengujian fitur login.

| No. | Username | Password |
|:---:|---|---|
| 1 | `shofwatunnisa` | `123456` |
| 2 | `sitidibaj` | `123456` |
| 3 | `rusmin` | `123456` |

**Catatan:** Akun default dibuat secara otomatis melalui mekanisme auto-seeding ketika aplikasi dijalankan.

## Database Configuration

Konfigurasi koneksi database dilakukan melalui file `hibernate.cfg.xml`.

Parameter konfigurasi yang digunakan:

| Parameter | Nilai |
|---|---|
| Database | `kelompok8_hibernate` |
| DBMS | MySQL |
| Username | `root` |
| Password | Kosong (default XAMPP) |
| ORM | Hibernate 6.4.4.Final |

Sesuaikan konfigurasi tersebut apabila pengaturan MySQL pada lingkungan lokal berbeda.

## Tujuan Proyek

Proyek ini bertujuan untuk mengimplementasikan konsep Object Relational Mapping (ORM) menggunakan Hibernate pada aplikasi Java Web Native, memahami proses konfigurasi koneksi database MySQL, serta menerapkan operasi pengelolaan data pengguna dalam aplikasi berbasis Java.

---

**Mata Kuliah:** Rekayasa Perangkat Lunak Lanjut  
**Kelompok:** 8  
**Program Studi:** Teknik Informatika
