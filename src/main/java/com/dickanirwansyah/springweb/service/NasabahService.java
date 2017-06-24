package com.dickanirwansyah.springweb.service;

import java.util.List;

import com.dickanirwansyah.springweb.entities.Nasabah;

public interface NasabahService {

	public Nasabah insertNasabah(Nasabah nasabah);
	
	public Nasabah updateNasabah(Nasabah nasabah);
	
	public Nasabah deleteNasabah(Nasabah nasabah);
	
	public Nasabah findOneNasabah(String idnasabah);
	
	public List<Nasabah> findAllNasabah();
}
