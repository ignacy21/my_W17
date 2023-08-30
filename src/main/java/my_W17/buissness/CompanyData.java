package my_W17.buissness;

import my_W17.infrastructure.database.entities.CompanyEntity;

public class CompanyData {

    public static CompanyEntity companyEntity1() {
        return CompanyEntity.builder()
                .name("company1")
                .localization("localization1")
                .description("description1")
                .build();
    }
    public static CompanyEntity companyEntity2() {
        return CompanyEntity.builder()
                .name("company2")
                .localization("localization2")
                .description("description2")
                .build();
    }
    public static CompanyEntity companyEntity3() {
        return CompanyEntity.builder()
                .name("company3")
                .localization("localization3")
                .description("description3")
                .build();
    }
}
