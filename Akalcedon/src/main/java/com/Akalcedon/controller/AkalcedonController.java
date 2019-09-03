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
	
	
	@GetMapping("/evenement") 
	public String evenement() {
		return "evenement";
	}
	
	@GetMapping("/profilEtudiant") 
	public String profilEtudiant() {
		return "profilEtudiant";
	}
	
	
	@GetMapping("/postNotes") 
	public String postNotes() {
		return "postNotes";
	}
	
}
 