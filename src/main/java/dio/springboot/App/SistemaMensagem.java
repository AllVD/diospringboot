package dio.springboot.App;

/*
application properties antigo
spring.application.name=primeiros-passos
nome=Digital Innovation
email=noreply@dio.com.br
telefones=11956781254,1145651725
*/

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    
    @Autowired
    private Remetente remetente;
    @Override
    public void run(String[] args) throws Exception {
        System.out.println("Mensagem enviada por: " 
            + remetente.getNome() + "\nEmail: " + remetente.getEmail() + "\nTelefone: " + remetente.getTelefones());
        System.out.println("Seu Cadastro Foi Aprovado");
    }
}

    

