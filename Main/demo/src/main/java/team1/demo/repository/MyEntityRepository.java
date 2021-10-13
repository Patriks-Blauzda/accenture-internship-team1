package team1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team1.demo.entity.MyEntity;

public interface MyEntityRepository extends JpaRepository<MyEntity,Long> {

}
