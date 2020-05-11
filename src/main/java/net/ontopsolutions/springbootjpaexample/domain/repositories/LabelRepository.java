package net.ontopsolutions.springbootjpaexample.domain.repositories;

import net.ontopsolutions.springbootjpaexample.domain.entities.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label,Long> {

}
