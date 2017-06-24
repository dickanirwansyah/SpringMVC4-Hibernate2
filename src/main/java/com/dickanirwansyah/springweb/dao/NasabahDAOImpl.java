package com.dickanirwansyah.springweb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dickanirwansyah.springweb.entities.Nasabah;

@Repository("nasabahDAO")
public class NasabahDAOImpl implements NasabahDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Nasabah insertNasabah(Nasabah nasabah) {
		// proses insert nasabah
		sessionFactory.getCurrentSession().save(nasabah);
		return nasabah;
	}

	@Override
	public Nasabah updateNasabah(Nasabah nasabah) {
		// proses update nasabah
		sessionFactory.getCurrentSession().update(nasabah);
		return nasabah;
	}

	@Override
	public Nasabah deleteNasabah(Nasabah nasabah) {
		// proses delete nasabah
		sessionFactory.getCurrentSession().delete(nasabah);
		return nasabah;
	}

	@Override
	public Nasabah findOneNasabah(String idnasabah) {
		// proses get nasabah berdasarkan kode
		return (Nasabah) sessionFactory.getCurrentSession()
				.get(Nasabah.class, idnasabah);
	}

	@Override
	public List<Nasabah> findAllNasabah() {
		// proses list nasabah
		Query query=sessionFactory.getCurrentSession()
				.createQuery("SELECT n FROM Nasabah n");
		return query.list();
	}

}
