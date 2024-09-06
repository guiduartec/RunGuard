package school.sptech;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConfiguracaoBanco {

    private JdbcTemplate assistente;

    public ConfiguracaoBanco() {

        // Configurações para o Banco de dados, talvez tenha que mudar algo para funcionar no seu.
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:localhost/Runguard");
        dataSource.setUsername("root");
        dataSource.setPassword("SPTech");
        this.assistente = new JdbcTemplate(dataSource);


    }

    public JdbcTemplate getAssistente() {
        return assistente;
    }

}
