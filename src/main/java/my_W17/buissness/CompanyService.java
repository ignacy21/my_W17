package my_W17.buissness;

import my_W17.infrastructure.database.entities.CompanyEntity;
import my_W17.infrastructure.database.jparepositories.CompanyJpaRepository;
import lombok.AllArgsConstructor;
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

        Optional<CompanyEntity> byId1 = companyJpaRepository.findById(companyEntity1.getCompanyId());
        Optional<CompanyEntity> byId2 = companyJpaRepository.findById(companyEntity2.getCompanyId());
        Optional<CompanyEntity> byId3 = companyJpaRepository.findById(companyEntity3.getCompanyId());
        System.out.println("### Employee1: " + byId1.orElseThrow());
        System.out.println("### Employee2: " + byId2.orElseThrow());
        System.out.println("### Employee3: " + byId3.orElseThrow());

    }
}
