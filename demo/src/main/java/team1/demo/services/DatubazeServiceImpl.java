package team1.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team1.demo.entity.Datubaze.Datubaze;
import team1.demo.repository.Datubazerepository;

import javax.transaction.Transactional;

@Transactional
@Service("DatubazeService")
public class DatubazeServiceImpl implements DatubazeService {
    @Autowired
    private Datubazerepository Datubazerepository;

    @Override
    public Iterable<Datubaze> findAll() {
        return Datubazerepository.findAll();
    }


}
