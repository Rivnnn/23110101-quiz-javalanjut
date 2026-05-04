package com.example.quiz.rival.model;

public class Mahasiswa {

    private String nim;
    private String nama_mahasiswa;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama_mahasiswa) {
        this.nim = nim;
        this.nama_mahasiswa = nama_mahasiswa;
    }

    public String getNim() {
        return nim;
    }

    public void setNim() {
        this.nim = nim;
    }

    public String getNamaMahasiswa() {
        return nama_mahasiswa;
    }

    public void setNamaMahasiswa() {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim='" + nim + '\'' + ", nama_mahasiswa='" + nama_mahasiswa + '\'' + '}';
    }
}
