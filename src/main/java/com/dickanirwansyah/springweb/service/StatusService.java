package com.dickanirwansyah.springweb.service;

import java.util.List;

import com.dickanirwansyah.springweb.entities.Status;

public interface StatusService {
	
	public Status insertStatus(Status status);
	
	public Status updateStatus(Status status);
	
	public Status deleteStatus(Status status);
	
	public Status findOneStatus(String idstatus);
	
	public List<Status> findAllStatus();

}
