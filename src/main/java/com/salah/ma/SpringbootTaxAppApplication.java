package com.salah.ma;

import com.salah.ma.bean.Categorie;
import com.salah.ma.repository.CategorieRepository;
import com.salah.ma.service.CategorieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.salah.ma.bean"})
@EnableJpaRepositories(basePackageClasses = CategorieRepository.class)
public class SpringbootTaxAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTaxAppApplication.class, args);

		//CategorieService cs = new CategorieService();
		//Categorie c = new Categorie();
		//c.setCode("code 1");
		//c.setLabel("libele 1");
		//cs.save(c);
		//System.out.println(cs.findAll());
	}

}
