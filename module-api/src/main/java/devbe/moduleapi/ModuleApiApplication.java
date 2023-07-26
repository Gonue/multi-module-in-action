package devbe.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (
		scanBasePackages = {"devbe.moduleapi", "devbe.modulecommon"}
)
@EntityScan("devbe.modulecommon.domain")
@EnableJpaRepositories(basePackages = "devbe.modulecommon.repository")
public class ModuleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiApplication.class, args);
	}

}
