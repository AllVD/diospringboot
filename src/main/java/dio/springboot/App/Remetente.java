package dio.springboot.App;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
    //@Value("${name:NoReply-DIO}")
    private String nome;
    //@Value("${email}")
    private String email;
    //@Value("${telefones}")
    private List<Long> telefones;
    
    public String getNome() { return nome;}

    public void setNome(String nome) {this.nome = nome;}
    
    public String getEmail() { return email;}

    public void setEmail(String email) {this.email = email;}

    public List<Long> getTelefones() { return telefones;}

    public void setTelefones(List<Long> telefones) { this.telefones = telefones; }

    @Override
    public String toString(){
        return "Remetente{" +
        "nome='" + nome + '\'' +
        ", email='" + email + '\'' +
        '}';
    }
}
