package ma.atelier.devoir_surveille_computer.dtos;

import jakarta.persistence.Entity;
import lombok.*;


@Builder
@Getter
@Setter

public class ComputerDTO {
    private String proc;
    private int ram;
    private int hardDrive;
    private Double price;
}
