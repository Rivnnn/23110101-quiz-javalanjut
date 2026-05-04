package com.example.quiz.rival.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.quiz.rival.model.Mahasiswa;

@Service
public class MahasiswaService {

    private final Map<String, Mahasiswa> mahasiswaMap = new HashMap<>();

    public MahasiswaService() {
        Mahasiswa mahasiswa1 = new Mahasiswa("23110101", "Rival Khafi Fergian");
        mahasiswaMap.put(mahasiswa1.getNim(), mahasiswa1);
        Mahasiswa mahasiswa2 = new Mahasiswa("23110102", "Rival Khafi");
        mahasiswaMap.put(mahasiswa2.getNim(), mahasiswa2);
    }

    public Mahasiswa cariNim(String nim) {
        return mahasiswaMap.get(nim);
    }

    public Collection<Mahasiswa> getAllMahasiswa() {
        return mahasiswaMap.values();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaMap.put(mahasiswa.getNim(), mahasiswa);
    }

    public void updateMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaMap.put(mahasiswa.getNim(), mahasiswa);
    }

    public void deleteMahasiswa(String nim) {
        mahasiswaMap.remove(nim);
    }

}
