package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleControllerVocali {

	@RequestMapping(value = "/conteggioVocali")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("risultato");
		int nVocali = contaVocali(testo);
		modelAndView.addObject("messaggio", "Ecco quante vocali ci sono nel testo inserito: ");
		modelAndView.addObject("risultato", nVocali +" Vocali");
		return modelAndView;
	}

	private int contaVocali(String testo) {
		int nVocali = 0;
		char[] caratteri = testo.toCharArray();
		for (int i = 0; i < caratteri.length; i++) {
			if(caratteri[i] == 'a'||caratteri[i] == 'e'||caratteri[i] == 'i'||caratteri[i] == 'o'||caratteri[i] == 'u') {
				nVocali++;
			}
		}
		return nVocali;
	}
	
}
