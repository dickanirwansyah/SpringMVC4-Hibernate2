package com.dickanirwansyah.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dickanirwansyah.springweb.entities.Nasabah;
import com.dickanirwansyah.springweb.entities.Status;
import com.dickanirwansyah.springweb.service.NasabahService;
import com.dickanirwansyah.springweb.service.StatusService;

@Controller
public class ControllerHallos {

	@Autowired
	private NasabahService nasabahService;
	
	@Autowired
	private StatusService statusService;
	
	@RequestMapping(value="/nasabah", method=RequestMethod.GET)
	public String goToPageNasabah(Model model){
		model.addAttribute("title", "data nasabah");
		model.addAttribute("msg", "data nasabah");
		model.addAttribute("listnasabah", nasabahService.findAllNasabah());
		return "nasabah/index";
	}
	
	@RequestMapping(value="/insertNasabah", method=RequestMethod.GET)
	public String goToPageInsert(Model model){
		model.addAttribute("title", "Insert Nasabah");
		model.addAttribute("msg", "Insert Nasabah");
		model.addAttribute("stats", statusService.findAllStatus());
		return "nasabah/insert";
	}
	
	@RequestMapping(value="/insertNasabah", method=RequestMethod.POST)
	public String goToLinkSaveNasabah(@ModelAttribute Nasabah nasabah, String idstatus){
	  Status status=statusService.findOneStatus(idstatus);
	  nasabah.setStatus(status);
	  nasabahService.insertNasabah(nasabah);
	  return "redirect:/nasabah";
	}
	
	@RequestMapping(value="/updateNasabah/{idnasabah}", method=RequestMethod.GET)
	public String goToPageUpdate(@PathVariable("idnasabah")String idnasabah, Model model){
		model.addAttribute("title", "update form nasabah");
		model.addAttribute("msg", "Form Update");
		model.addAttribute("gets", nasabahService.findOneNasabah(idnasabah));
		model.addAttribute("listStatus", statusService.findAllStatus());
		return "nasabah/update";
	}
	
	@RequestMapping(value="/updateNasabah", method=RequestMethod.POST)
	public String goToLinkUpdates
	(@ModelAttribute Nasabah nasabah, String idstatus, String idnasabah){
	   if(nasabahService.findOneNasabah(idnasabah)!=null){
		   Status status=statusService.findOneStatus(idstatus);
		   nasabah.setStatus(status);
		   nasabahService.updateNasabah(nasabah);
	   }
	   return "redirect:/nasabah";
	}
	
	@RequestMapping(value="/deleteNasabah/{idnasabah}", method=RequestMethod.GET)
	public String goToLinkDeleteNasabah(@PathVariable("idnasabah")String idnasabah, 
			@ModelAttribute Nasabah nasabah){
	  nasabah=nasabahService.findOneNasabah(idnasabah);
	  nasabahService.deleteNasabah(nasabah);
	  return "redirect:/nasabah";
	}
}
