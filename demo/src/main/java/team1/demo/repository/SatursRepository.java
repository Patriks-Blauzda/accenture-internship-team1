package team1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import team1.demo.entity.Datubaze.Saturs;

@Repository
public interface SatursRepository extends JpaRepository<Saturs, Long> {

}