import org.springframework.context.annotation.Bean;


@Development
public class MyConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sales System";
    }

    @Bean(name = "outraConfiguracao")
    public String outraConfiguracao(){
        return "Sales System";
    }
}