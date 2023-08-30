package my_W17.infrastructure.configuraton;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "my_W17")
@Import(PersistenceJPAConfiguration.class)
public class ApplicationConfiguration {

}
