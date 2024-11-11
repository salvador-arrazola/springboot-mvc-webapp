package com.sarrazola.learning.springboot.mvc.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping({"", "/", "/home"})
  public String home() {
    // return "redirect:/details";
    return "redirect:/list";
    // return "forward:/details";
    // return "forward:/list";
  }

  // Redirect vs Forward:
  // - Redirect: reinicia el request y cambia la ruta URL, todos lo datos de ese request se pierden
  //   y no llegan al target de redirect.
  // - Forward: No se crea un nuevo request, el request se maneja internamente y otro handler pasa
  //   los datos del request al target, los datos del request inicial se mantienen y llegan hasta el
  //   target del forward.
  
}
