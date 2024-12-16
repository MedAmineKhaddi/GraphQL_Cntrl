package ma.atelier.devoir_surveille_computer;

import ma.atelier.devoir_surveille_computer.dao.entities.Computer;
import ma.atelier.devoir_surveille_computer.dao.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevoirSurveilleComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirSurveilleComputerApplication.class, args);

    }
        @Bean
        CommandLineRunner run(ComputerRepository computerRepo) {
            return args -> {
                computerRepo.saveAll(
                        List.of(
                                Computer.builder().ram(10).hardDrive(10).price(10500.00).hardDrive(100)
                                        .build()
                        )
                );
            };
        }


}
