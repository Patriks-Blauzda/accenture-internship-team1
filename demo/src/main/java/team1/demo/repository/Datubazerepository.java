package team1.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team1.demo.entity.Datubaze.Datubaze;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface Datubazerepository extends JpaRepository<Datubaze, Integer> {

}