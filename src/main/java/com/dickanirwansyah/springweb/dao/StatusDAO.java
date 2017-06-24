package com.dickanirwansyah.springweb.dao;

import java.util.List;

import com.dickanirwansyah.springweb.entities.Status;

public interface StatusDAO {

	public Status insertStatus(Status status);
	
	public Status updateStatus(Status status);
	
	public Status deleteStatus(Status status);
	
	public Status findOneStatus(String idstatus);
	
	public List<Status> findAllStatus();
}
