package com.example.quiz.rival.controller;

import com.example.quiz.rival.model.Mahasiswa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.rival.service.MahasiswaService;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("mahasiswa")
public class MahasiswaController {

    private final MahasiswaService mahasiswaService;

    public MahasiswaController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @GetMapping("/{nim}")
    public Mahasiswa getMethodName(@PathVariable String nim) {
        return mahasiswaService.cariNim(nim);
    }

    @GetMapping
    public Collection<Mahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

    @PostMapping()
    public void postMethodName(@RequestBody Mahasiswa mahasiswa) {
        mahasiswaService.tambahMahasiswa(mahasiswa);
    }

    @PutMapping("/{nim}")
    public void putMethodName(@PathVariable String nim, @RequestBody Mahasiswa mahasiswa) {
        mahasiswaService.updateMahasiswa(mahasiswa);
    }

    @DeleteMapping("/{nim}")
    public void deleteMethodName(@PathVariable String nim) {
        mahasiswaService.deleteMahasiswa(nim);
    }
}
