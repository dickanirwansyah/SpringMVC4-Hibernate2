/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.springweb.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dickajava
 */
@Entity
@Table(name = "status", 
        catalog = "crud_nasabah")
public class Status implements Serializable{
    
    @Id 
    @Column(name = "idstatus", nullable = false, unique = true)
    private String idstatus;
    
    @Column(name = "nama", nullable = false)
    private String nama;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
    private Set<Nasabah> nasabahs=new HashSet<Nasabah>(0);
    
    public Status(){
        
    }
    
    public Status(String idstatus, String nama){
        this.idstatus=idstatus;
        this.nama=nama;
    }
    
    public Status(String idstatus, String nama, Set<Nasabah> nasabahs){
        this.idstatus=idstatus;
        this.nama=nama;
        this.nasabahs=nasabahs;
    }
    
    
    public String getIdstatus(){
        return this.idstatus=idstatus;
    }
    
    public void setIdstatus(String idstatus){
        this.idstatus=idstatus;
    }
    
    public String getNama(){
        return this.nama=nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public Set<Nasabah> getNasabah(){
        return this.nasabahs=nasabahs;
    }
    
    public void setNasabah(Set<Nasabah>nasabahs){
        this.nasabahs=nasabahs;
    }

    
    
}
