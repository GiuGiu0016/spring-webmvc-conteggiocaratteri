package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleControllerParole {
	
	@RequestMapping(value = "/conteggioParole")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("risultato");
		String[] conteggioParole = testo.split(" ");
		modelAndView.addObject("messaggio", "Ecco quante parole ci sono nel testo inserito: ");
		modelAndView.addObject("risultato", conteggioParole.length+" Parole");
		modelAndView.addObject("specifica", conteggioParole);
		return modelAndView;
	}

}
