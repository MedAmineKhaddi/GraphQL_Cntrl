package ma.atelier.devoir_surveille_computer.service;

import ma.atelier.devoir_surveille_computer.dtos.ComputerDTO;

import java.util.List;

public interface ComputerService {

    public ComputerDTO ComputerByPrice(Double price);

    public ComputerDTO saveComputer(ComputerDTO computer);
}