package com.example.smartspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartspring.model.PasienModel;
import com.example.smartspring.repository.PasienRepository;

@Service
@Transactional
public class PasienService {

	@Autowired // digunakan untuk mengambil fungsi2 di yang ada di class lain
	private PasienRepository pasienRepository; // membuatkan variabel baru dari class PasienRepository

	// CREATE
	public void create(PasienModel pasienModel) {
		this.pasienRepository.save(pasienModel);

	}

	// READ
	public List<PasienModel> readData() {

		return this.pasienRepository.findAll();
	}

	// UPDATE
	public void update(PasienModel pasienModel) {
		this.pasienRepository.save(pasienModel);

	}

	// DELETE
	public void remove(String kodePasien) {
		this.pasienRepository.deleteById(kodePasien);
	}

	// SELEKSI DATA ORDER BY
	public List<PasienModel> method1() {
		return this.pasienRepository.dataUrutNama();
	}

	// SELEKSI DATA LIKE
	public List<PasienModel> cariDataMengandung() {
		return this.pasienRepository.cariDataYangMengandung();
	}
	
	// SELEKSI NAMA DEPAN A
	public List<PasienModel> namaDepannyaA() {
		return this.pasienRepository.namaDepannyaA();
		
	}
	
	//SELEKSI BIAYA >2000
	public List<PasienModel> biayaLebih2000(){
		return this.pasienRepository.biayaLebih2000();
	}
	
	// SELEKSI BIAYA 500-1000
	 public List<PasienModel> biayaAntara(){
		 return this.pasienRepository.biayaAntara();
	 }
}
