package SDEmpApp.buissness;

import SDEmpApp.infrastructure.database.entities.CompanyEntity;
import SDEmpApp.infrastructure.database.jparepositories.CompanyJpaRepository;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CompanyService {

    private final CompanyJpaRepository companyJpaRepository;

    @Transactional
    public void start() {
        companyJpaRepository.deleteAll();
        companyJpaRepository.flush();

        CompanyEntity companyEntity1 = companyJpaRepository.save(CompanyData.companyEntity1());
        CompanyEntity companyEntity2 = companyJpaRepository.save(CompanyData.companyEntity2());
        CompanyEntity companyEntity3 = companyJpaRepository.save(CompanyData.companyEntity3());
        System.out.println("companyEntity1: " + companyEntity1);
        System.out.println("companyEntity2: " + companyEntity2);
        System.out.println("companyEntity3: " + companyEntity3);

        Optional<CompanyEntity> byId1 = companyJpaRepository.findById(1);
        Optional<CompanyEntity> byId2 = companyJpaRepository.findById(2);
        Optional<CompanyEntity> byId3 = companyJpaRepository.findById(3);
        System.out.println("### Employee1: " + byId1);
        System.out.println("### Employee2: " + byId2);
        System.out.println("### Employee3: " + byId3);
    }
}
