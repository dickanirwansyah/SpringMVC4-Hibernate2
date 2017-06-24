package com.dickanirwansyah.springweb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dickanirwansyah.springweb.dao.NasabahDAO;
import com.dickanirwansyah.springweb.entities.Nasabah;

@Service
@Transactional
public class NasabahServiceImpl implements NasabahService{
	
	@Autowired
	public NasabahDAO nasabahDAO;

	@Override
	public Nasabah insertNasabah(Nasabah nasabah) {
		nasabahDAO.insertNasabah(nasabah);
		return nasabah;
	}

	@Override
	public Nasabah updateNasabah(Nasabah nasabah) {
		nasabahDAO.updateNasabah(nasabah);
		return nasabah;
	}

	@Override
	public Nasabah deleteNasabah(Nasabah nasabah) {
		nasabahDAO.deleteNasabah(nasabah);
		return nasabah;
	}

	@Override
	public Nasabah findOneNasabah(String idnasabah) {
		return nasabahDAO.findOneNasabah(idnasabah);
	}

	@Override
	public List<Nasabah> findAllNasabah() {
		return nasabahDAO.findAllNasabah();
	}

}
