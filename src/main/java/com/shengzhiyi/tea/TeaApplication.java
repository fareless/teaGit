package com.shengzhiyi.tea;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
		import org.springframework.boot.web.servlet.ServletComponentScan;
		import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan("com.shengzhiyi")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan("com.shengzhiyi")
public class TeaApplication {

	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(TeaApplication.class);
//
//		app.addListeners(new SpringBootStartedEventListener());

//		app.addListeners((ApplicationListener<ApplicationPreparedEvent>) event -> {
//			System.out.println("application prepared event");
//		});
//
//		app.addListeners((ApplicationListener<ApplicationReadyEvent>) event -> {
//			System.out.println("application ready event");
//		});

		SpringApplication.run(TeaApplication.class,args);
	}

}
