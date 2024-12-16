package ma.atelier.devoir_surveille_computer.mappers;

import ma.atelier.devoir_surveille_computer.dao.entities.Computer;
import ma.atelier.devoir_surveille_computer.dtos.ComputerDTO;

public class ComputerMapper {
    public ComputerDTO fromComuter(Computer computer) {
        return ComputerDTO.builder()
                .ram(computer.getRam())
                .proc(computer.getProc())
                .price(computer.getPrice())
                .hardDrive(computer.getHardDrive())
                .build();
    }


    public Computer fromComuterDTO(ComputerDTO comuterDTO) {
        return Computer.builder()
                .hardDrive(comuterDTO.getHardDrive())
                .ram(comuterDTO.getRam())
                .proc(comuterDTO.getProc())
                .price(comuterDTO.getPrice())
                .build();
    }
}
