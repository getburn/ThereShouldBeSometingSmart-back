package pl.heheszki.banana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.heheszki.banana.model.DepartmentEntity;

public interface DepartmentEntityRepo extends JpaRepository <DepartmentEntity, Long> {


}
