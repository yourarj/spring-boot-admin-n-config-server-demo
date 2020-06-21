package mr.awesome.demos.springboot.adminnconfigserver.myspringbootadminnconfigserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableAdminServer
@SpringBootApplication
public class MySpringBootAdminNConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootAdminNConfigServerApplication.class, args);
	}

}
