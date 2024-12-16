package ma.atelier.devoir_surveille_computer.dao.repositories;

import ma.atelier.devoir_surveille_computer.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ComputerRepository extends JpaRepository<Computer, Long> {
    public Computer findByPrice(double price);
}
