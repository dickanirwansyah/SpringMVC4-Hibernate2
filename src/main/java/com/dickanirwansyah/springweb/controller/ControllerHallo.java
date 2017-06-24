/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dickanirwansyah.springweb.entities.Nasabah;
import com.dickanirwansyah.springweb.entities.Status;
import com.dickanirwansyah.springweb.service.StatusService;


/**
 *
 * @author dickajava
 */

@Controller
public class ControllerHallo {
    
	@Autowired
	private StatusService statusService;
	
    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String goToPageIndexStatus(Model model){
        model.addAttribute("title", "Sample Status");
        model.addAttribute("msg", "Status Sample");
        model.addAttribute("stats", statusService.findAllStatus());
        return "status/index";
    }
    
    @RequestMapping(value="/insertStatus", method=RequestMethod.GET)
    public String goToPageInsertStatus(Model model){
    	model.addAttribute("title", "Insert Status");
    	model.addAttribute("msg", "Insert Status");
    	return "status/insert";
    }
    
    @RequestMapping(value="/insertStatus", method=RequestMethod.POST)
    public String goToPostInsert(@ModelAttribute Status status){
        statusService.insertStatus(status);
        return "redirect:/";
    }
    
    @RequestMapping(value="/deleteStatus/{idstatus}", method=RequestMethod.GET)
    public String goToDeleteStatus(@PathVariable("idstatus")String idstatus){
    	Status status=statusService.findOneStatus(idstatus);
    	statusService.deleteStatus(status);
    	return "redirect:/";
    }
    
    @RequestMapping(value="/ambilStatus/{idstatus}", method=RequestMethod.GET)
    public String goToPageEdit(@PathVariable("idstatus")String idstatus, Model model){
    	model.addAttribute("title", "edit status");
    	model.addAttribute("msg", "edit status");
    	Status status=statusService.findOneStatus(idstatus);
    	model.addAttribute("get", status);
    	return "status/update";
    }
    
    @RequestMapping(value="/edit", method=RequestMethod.POST)
    public String goToProsesEdit(@ModelAttribute Status status){
    	statusService.updateStatus(status);
    	return "redirect:/";
    }
}
