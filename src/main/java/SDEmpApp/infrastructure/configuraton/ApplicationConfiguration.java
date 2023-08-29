package SDEmpApp.infrastructure.configuraton;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "SDEmpApp")
@Import(PersistenceJPAConfiguration.class)
public class ApplicationConfiguration {

}
