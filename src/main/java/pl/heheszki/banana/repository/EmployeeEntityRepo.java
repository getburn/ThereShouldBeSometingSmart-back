package pl.heheszki.banana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.heheszki.banana.model.EmployeeEntity;

@Repository
public interface EmployeeEntityRepo extends JpaRepository <EmployeeEntity, Long> {

}
