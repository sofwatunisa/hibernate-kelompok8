# Tutorial dan Sample Application: Hibernate ORM

Proyek ini merupakan sampel aplikasi sederhana berbasis Java Spring Boot dan Hibernate ORM yang dibangun untuk memenuhi penugasan kelompok mata kuliah Rekayasa Perangkat Lunak Lanjut.

Aplikasi ini mengimplementasikan konsep dasar Object-Relational Mapping (ORM) dengan melakukan operasi CRUD (Create dan Read) data mahasiswa secara otomatis yang terhubung langsung ke database MySQL.

---

## Anggota Kelompok 8

| No | Nama | NIM 
| :-: | :--- | :--- 
| 1 | Shofwatunnisa | 12409011050121 
| 2 | Siti Dibaj Trikusuma | 12409011050117 
| 3 | Rusmin Nuryadin | 12409011050120

---

## Teknologi dan Tools

* Bahasa Pemrograman: Java 21
* Framework / Library: Spring Boot (v4.1.2), Hibernate ORM Core (v7.4.13)
* Build Tool: Maven
* Database: MySQL (via XAMPP / phpMyAdmin)
* IDE: IntelliJ IDEA Ultimate

---

## Struktur Proyek

```text
hibernate-kelompok8
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.entity
│   │   │   │   └── Mahasiswa.java             # Entity Class (JPA Mapping)
│   │   │   ├── com.example.util
│   │   │   │   └── HibernateUtil.java         # Utility SessionFactory Management
│   │   │   └── com.ormawa.hibernatekelompok8
│   │   │       └── HibernateKelompok8Application.java # Main Execution & Runner Logic
│   │   └── resources
│   │       ├── application.properties         # Spring Boot & Database Configuration
│   │       └── hibernate.cfg.xml              # Native Hibernate Configuration
└── pom.xml                                    # Dependencies (Spring Data JPA & MySQL)
