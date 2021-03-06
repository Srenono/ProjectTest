package com.Akalcedon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AkalcedonController {
	
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/accueil") 
	public String accueil() {
		return "accueil";
	}
	
	@GetMapping("/rechercheEtudiant") 
	public String rechercheEtudiant() {
		return "rechercheEtudiant";
	}
	
	
	@GetMapping("/AjoutEtudiant") 
	public String AjoutEtudiant() {
		return "AjoutEtudiant";
	}

	
	@GetMapping("/statistique") 
	public String statistique() {
		return "statistique";
	}
	
	
	/*
	 * @GetMapping("/evenement") public String evenement() { return "evenement"; }
	 */
	@GetMapping("/profilEtudiant") 
	public String profilEtudiant() {
		return "profilEtudiant";
	}
	
	
	@GetMapping("/postNotes") 
	public String postNotes() {
		return "postNotes";
	}
	
	@GetMapping("/all-professors") 
	public String listProfesseur() {
		return "all-professors";
	}
	
	@GetMapping("/add-professor") 
	public String addProfesseur() {
		return "add-professor";
	}
	
	@GetMapping("/editNotes") 
	public String editNotes() {
		return "editNotes";
	}
	
	@GetMapping("/mailbox") 
	public String mailbox() {
		return "mailbox";
	}
	
	@GetMapping("/editMail") 
	public String editMail() {
		return "editMail";
	}
	
	@GetMapping("/viewMail")
	public String viewMail() {
		return "viewMail";
	}
}
 