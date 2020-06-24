package com.example.smartspring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartspring.model.PasienModel;
import com.example.smartspring.service.PasienService;

@RestController
@RequestMapping("/api/pasien")
public class PasienApi {

	@Autowired
	private PasienService pasienService;

// POST || INSERT
	@PostMapping("/post") 
	@ResponseStatus(code = HttpStatus.CREATED)
	
	public Map<String, Object> postMapping(@RequestBody PasienModel pasienModel) {
	
		this.pasienService.create(pasienModel);

		Map<String, Object> map = new HashMap<String, Object>();
		// dengan hashmap kita bisa buat pesan ketika berhasil

		map.put("success", Boolean.TRUE);
		map.put("pesan", "datanya sudah masuk");
		return map;

	}

// GET || READ
	
	@GetMapping("/get")
	@ResponseStatus(code = HttpStatus.OK)
	public List<PasienModel> getMapping() {

		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();
		pasienModelList = this.pasienService.readData();
		return pasienModelList;
	}

// PUT || UPDATE
	@PutMapping("/put")
	@ResponseStatus(code = HttpStatus.OK)
	public Map<String, Object> putMapping(@RequestBody PasienModel pasienModel) {

		this.pasienService.update(pasienModel);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", Boolean.TRUE);
		map.put("pesan", "Berhasil UPDATE");
		return map;

	}

// DELETE ||

	@DeleteMapping("/delete/{kodePasien}")
	public Map<String, Object> remove(@PathVariable String kodePasien) {

		this.pasienService.remove(kodePasien);

		Map<String, Object> map = new HashMap<String, Object>();// dengan hashmap kita bisa buat pesan ketika berhasil

		map.put("success", Boolean.TRUE);
		map.put("delete", "Berhasil DELETE");
		return map;

	}

// GET || READ SELECTION  tampilkan data berdasarkan Nama dari urutan terbesar hingga terkecil(Z-A)

	@GetMapping("/getseleksi")
	@ResponseStatus(code = HttpStatus.OK)

	public List<PasienModel> getUrutMapping() {
		// instance PasienModel dengan nama pasienModelList
		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();

		pasienModelList = this.pasienService.method1();
		return pasienModelList;
	}

// GET || READ SELECTION LIKE
	@GetMapping("/getNamaMengandung")
	@ResponseStatus(code = HttpStatus.OK)

	public List<PasienModel> getNama() {

		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();

		pasienModelList = this.pasienService.cariDataMengandung();
		return pasienModelList;
	}
	
//GET Nama  depannya huruf a
	 @GetMapping("/getNamaDepanA")
	 @ResponseStatus(code = HttpStatus.OK)
	 
	 public List<PasienModel> getNamaDepan() {
		 
		 List <PasienModel> pasienModelList = new ArrayList<PasienModel>();
		 
		 
		pasienModelList = this.pasienService.namaDepannyaA();
		return pasienModelList;
		 
	 }
// GET biaya lebih 2000
	  @GetMapping("/getBiayaLebih2000")
	  @ResponseStatus( code = HttpStatus.OK)
	  
	  public List<PasienModel> getBiayaLebih2000(){
		  
		List<PasienModel> pasienModelList = new ArrayList<PasienModel>();
		
		  pasienModelList = this.pasienService.biayaLebih2000();
		  return pasienModelList;
		  
	  }
	  
// GET biaya 500-1000
	  @GetMapping("/getBiayaAntara")
	  @ResponseStatus( code = HttpStatus.OK)
	  
	  public List<PasienModel> getBiayaAntara(){
		  
		  List<PasienModel> pasienModelList =new ArrayList<PasienModel>();
		  
		   pasienModelList = this.pasienService.biayaAntara();
		   return pasienModelList;
		   
		  
	  }
}