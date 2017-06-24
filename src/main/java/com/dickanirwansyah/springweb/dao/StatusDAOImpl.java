package com.dickanirwansyah.springweb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dickanirwansyah.springweb.entities.Status;

@Repository("statusDAO")
public class StatusDAOImpl implements StatusDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Status insertStatus(Status status) {
		//proses insert status
		sessionFactory.getCurrentSession().save(status);
		return status;
	}

	@Override
	public Status updateStatus(Status status) {
		//proses update status
		sessionFactory.getCurrentSession().update(status);
		return status;
	}

	@Override
	public Status deleteStatus(Status status) {
		//proses delete status
		sessionFactory.getCurrentSession().delete(status);
		return status;
	}

	@Override
	public Status findOneStatus(String idstatus) {
		// proses findone
		return (Status) sessionFactory.getCurrentSession().get(Status.class, idstatus);
	}

	@Override
	public List<Status> findAllStatus() {
		// proses findall
		Query query=sessionFactory.getCurrentSession()
				.createQuery("SELECT s FROM Status s");
		return query.list();
	}

	
}
