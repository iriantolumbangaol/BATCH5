package com.example.smartspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BerandaController {
	
	@RequestMapping("/beranda")
	public String beranda() {
		String html ="/beranda";
		return html;
	}
	

}

//1. Buat halaman/HTML bernama utamaOffice ==> tampilkan di browser
// 	a.buat form sederhana saja , ada 2 texfield dan 1 button
/*
 * 2. Buat halaman /HTML bernama penjualanOffice di dalam folder office :
 *  a. buat tabel sederhana saja dengan kolom No, Barang, Harga , Jumlah Penjualan
 *  
 * 3. 2. Buat halaman /HTML bernama karyawanOffice di dalam folder karyawan yang ada di dalam folder office. office/karyawan/.. :
 *  a. Buat tabel sederhana daftar nama karyawan ( No, Nama ,Jabatan)
*/
