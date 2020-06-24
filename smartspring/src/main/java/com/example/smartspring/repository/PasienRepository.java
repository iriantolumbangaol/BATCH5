package com.example.smartspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.smartspring.model.PasienModel;

//JpaRepository<nama tabel DB = wajib di import, type variable primarykey tabel tersebut>
public interface PasienRepository extends JpaRepository<PasienModel, String> {
	
	//QUERY URUT DESC
	@Query("select p from PasienModel p order by p.namaPasien desc")
	List<PasienModel> dataUrutNama();
	
	
	
	//QUERY NAMA MENGANDUNG HURUF A
	@Query("select p from PasienModel p where p.namaPasien LIKE '%a%' ")
	List<PasienModel> cariDataYangMengandung();
	
	//QUERY NAMA DEPANYA A
	@Query("select p from PasienModel p where p.namaPasien LIKE 'a%' ")
	List<PasienModel> namaDepannyaA();
	
	//QUERY BIAYA >2000
	@Query("select p from PasienModel p where p.biaya >2000 ")
	List<PasienModel> biayaLebih2000();
	
	//QUERY BIAYA 500-1000
	@Query ("select p from PasienModel p where p.biaya>100 AND p.biaya <1000 ")
	List<PasienModel> biayaAntara();
}
