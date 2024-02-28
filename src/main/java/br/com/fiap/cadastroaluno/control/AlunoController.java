package br.com.fiap.cadastroaluno.control;


import br.com.fiap.cadastroaluno.model.AlunoModel;
import br.com.fiap.cadastroaluno.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alunos")

public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;


    @GetMapping("/novo")
    public String cadastrarAluno(Model model) {

        model.addAttribute("aluno", new AlunoModel());
        return "aluno/novo-aluno";

    }

    @PostMapping("/salvar")
    public String insertAluno(AlunoModel aluno) {


        alunoRepository.save(aluno);

        System.out.println(aluno.toString());

        return "redirect:/alunos/novo";


    }


}
