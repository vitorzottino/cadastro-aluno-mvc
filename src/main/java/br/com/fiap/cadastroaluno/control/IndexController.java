package br.com.fiap.cadastroaluno.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
    model.addAttribute("msg", "Criar novo aluno");
    return "/aluno/index";

    }


}
