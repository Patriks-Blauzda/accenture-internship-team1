package team1.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team1.demo.entity.Datubaze.Saturs;
import team1.demo.repository.SatursRepository;

import java.util.List;

@Service
public class SatursService {

    @Autowired
    private SatursRepository satursrepository;

    public List<Saturs>findAll(){
        return satursrepository.findAll();
    }

    public Saturs saveSaturs(Saturs saturs) {
        return satursrepository.save(saturs);
    }
}

