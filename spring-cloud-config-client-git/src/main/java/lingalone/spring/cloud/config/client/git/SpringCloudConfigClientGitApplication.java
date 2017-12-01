package lingalone.spring.cloud.config.client.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringCloudConfigClientGitApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder(SpringCloudConfigClientGitApplication.class).web(true).run(args);
	}
}
