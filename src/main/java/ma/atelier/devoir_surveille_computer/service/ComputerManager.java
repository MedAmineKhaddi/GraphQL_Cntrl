package ma.atelier.devoir_surveille_computer.service;

import ma.atelier.devoir_surveille_computer.dao.repositories.ComputerRepository;
import ma.atelier.devoir_surveille_computer.dtos.ComputerDTO;
import ma.atelier.devoir_surveille_computer.mappers.ComputerMapper;
import org.springframework.stereotype.Service;

@Service
public class ComputerManager implements ComputerService{
    private ComputerRepository computerRepo;
    final private ComputerMapper mapper = new ComputerMapper();
    @Override
    public ComputerDTO ComputerByPrice(Double price) {
        return mapper.fromComuter(
                computerRepo.findByPrice(price)
        );
    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO computer) {
        computerRepo.save(mapper.fromComuterDTO(computer));
        return computer;
    }
}
