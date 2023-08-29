package SDEmpApp;

import SDEmpApp.buissness.CompanyService;
import SDEmpApp.infrastructure.configuraton.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        CompanyService companyService = context.getBean(CompanyService.class);
        companyService.start();
    }
}
