package br.com.bancointer.poc.redshift;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocRedshiftApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PocRedshiftApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(Arrays.toString(args.getSourceArgs()));
		System.out.println("Valor: "+args.getOptionValues("SQL"));
	}

}
