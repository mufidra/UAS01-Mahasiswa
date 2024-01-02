/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_mahasiswa;

/**
 * Nama : Mufida Anggradita
 * NIM : 22166010
 * Kelas : Sistem Informasi
 * Semester 3
 * Mata Kuliah : Pemrogaman Berorientasi Objek 1
 * UAS NO 1
 */

// class Mahasiswa
class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
}

// class MahasiswaBaru
class MahasiswaBaru extends Mahasiswa {
    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}

// class MahasiswaLama 
class MahasiswaLama extends Mahasiswa {
    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}

// main metode
public class UAS1_Mahasiswa {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        System.out.println("=======  Mahasiswa =======");
        Mahasiswa mahasiswa1 = new Mahasiswa("Mufida", 20);
        mahasiswa1.displayInfo();

        // Membuat objek MahasiswaBaru
        System.out.println("=======  Mahasiswa Baru =======");
        MahasiswaBaru mahasiswaBaru1 = new MahasiswaBaru("Raya", 22, 123456);
        mahasiswaBaru1.displayInfo();

        // Membuat objek MahasiswaLama
        System.out.println("=======  Mahasiswa Lama =======");
        MahasiswaLama mahasiswaLama1 = new MahasiswaLama("Nara", 25, 2019);
        mahasiswaLama1.displayInfo();
    }
}

