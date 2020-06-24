package com.example.smartspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class OfficeController {
	
	
	//master/modul
	// pembuatan controller dibuat per master (per folder office misalnya
	// walaupun di dalam office ada folder karyawan 
	// 404 error file tidak ditemukan
	// 500 error service
	@RequestMapping("/utamaOffice")

	public String utamaOffice() {
		String html = "utamaOffice";
		return html;
	}

	@RequestMapping("/office/penjualanOffice")

	public String penjualanOffice() {
		String html = "/office/penjualanOffice";
		return html;
	}
	
	@RequestMapping("/office/karyawan/karyawanOffice")

	public String karyawanOffice() {
		String html = "/office/karyawan/karyawanOffice";
		return html;
	}

}
