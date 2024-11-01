package dio.springboot.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope; 

import com.google.gson.Gson;

@Configuration
    public class Beans {

    	@Bean
		public Gson gson() {
		return new Gson();
		}

        @Bean
        @Scope("prototype")
		public Remetente remetente() { 
            System.out.println("Criando Um Objeto Remetente");
            Remetente remetente = new Remetente();
            remetente.setEmail("noreply@dio.com.br");
            remetente.setNome("Digital Innovation One");
            return remetente;
        }
}
