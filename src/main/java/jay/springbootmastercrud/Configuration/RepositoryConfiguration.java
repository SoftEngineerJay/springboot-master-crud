package jay.springbootmastercrud.Configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"io.github.softengineerjay.springbootcrud.domain"})
@EnableJpaRepositories(basePackages = {"io.github.softengineerjay.springbootcrud.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
