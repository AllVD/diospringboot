package dio.springboot.App;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    
    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;
    @Override
    public void run (String[] args) throws Exception {
        System.out.println("Mensagem enviada por: " 
        + nome + "\nEmail: " + email + "\nTelefone: " + telefones);
        System.out.println("Seu Cadastro Foi Aprovado");
    }
}
    
