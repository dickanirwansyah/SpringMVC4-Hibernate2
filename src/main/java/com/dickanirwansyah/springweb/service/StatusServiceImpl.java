package com.dickanirwansyah.springweb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dickanirwansyah.springweb.dao.StatusDAO;
import com.dickanirwansyah.springweb.entities.Status;


@Service
@Transactional
public class StatusServiceImpl implements StatusService{

	@Autowired
	private StatusDAO statusDAO;
	
	@Override
	public Status insertStatus(Status status) {
		//status insert
		return statusDAO.insertStatus(status);
	}

	@Override
	public Status updateStatus(Status status) {
		// status update
		return statusDAO.updateStatus(status);
	}

	@Override
	public Status deleteStatus(Status status) {
		// status delete
		return statusDAO.deleteStatus(status);
	}

	@Override
	public Status findOneStatus(String idstatus) {
		// status findone
		return statusDAO.findOneStatus(idstatus);
	}

	@Override
	public List<Status> findAllStatus() {
		// status findall
		return statusDAO.findAllStatus();
	}

}
