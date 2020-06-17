package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleControllerConsonanti {

	@RequestMapping(value = "/conteggioConsonanti")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("risultato");
		int nConsonanti = contaConsonanti(testo);
		modelAndView.addObject("messaggio", "Ecco quante consonanti ci sono nel testo inserito: ");
		modelAndView.addObject("risultato", nConsonanti +" consonanti");
		return modelAndView;
	}

	private int contaConsonanti(String testo) {
		int nConsonanti = 0;
		char[] caratteri = testo.toCharArray();
		for (int i = 0; i < caratteri.length; i++) {
			if(caratteri[i] == 'a'||caratteri[i] == 'e'||caratteri[i] == 'i'||caratteri[i] == 'o'||caratteri[i] == 'u'||caratteri[i] == ' '||caratteri[i] == ','||caratteri[i] == '.'||caratteri[i] == ';'||caratteri[i] == ':') {
				
			}else {
				nConsonanti++;
			}
		}
		return nConsonanti;
	}
	
}
