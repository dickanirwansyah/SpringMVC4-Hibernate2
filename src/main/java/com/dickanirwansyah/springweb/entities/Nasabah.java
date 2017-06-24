/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.springweb.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author dickajava
 */
@Entity
@Table(name = "nasabah", 
        catalog = "crud_nasabah")
public class Nasabah implements Serializable{
    
   private String idnasabah;
   private String nama;
   private Status status;
   private String notelp;
   private String alamat;
   
   public Nasabah(){
	   
   }
   
   public Nasabah(String idnasabah, String nama, Status status, String notelp, String alamat){
	   this.idnasabah=idnasabah;
	   this.nama=nama;
	   this.status=status;
	   this.notelp=notelp;
	   this.alamat=alamat;
   }
   
   @Id
   @Column(name="idnasabah", nullable=false, unique=true)
   public String getIdnasabah(){
	   return this.idnasabah;
   }
   
   public void setIdnasabah(String idnasabah){
	   this.idnasabah=idnasabah;
   }
    
   @ManyToOne
   @JoinColumn(name="idstatus", nullable=false)
   public Status getStatus(){
	   return status;
   }
   
   public void setStatus(Status status){
	   this.status=status;
   }
   
   @Column(name="nama", nullable=false)
   public String getNama(){
	   return this.nama;
   }
   
   public void setNama(String nama){
	   this.nama=nama;
   }
   
   @Column(name="notelp", nullable=false)
   public String getNotelp(){
	   return this.notelp;
   }
   
   public void setNotelp(String notelp){
	   this.notelp=notelp;
   }
   
   @Column(name="alamat", nullable=false)
   public String getAlamat(){
	   return this.alamat;
   }
   
   public void setAlamat(String alamat){
	   this.alamat=alamat;
   }
  
}
