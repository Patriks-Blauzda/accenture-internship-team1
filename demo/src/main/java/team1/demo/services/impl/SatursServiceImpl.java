package team1.demo.services.impl;

import org.springframework.stereotype.Service;
import team1.demo.entity.Datubaze.Saturs;
import team1.demo.repository.SatursRepository;
import team1.demo.services.SatursService;

import java.util.List;

@Service
public class SatursServiceImpl extends SatursService {

    private SatursRepository satursRepository;

    public SatursServiceImpl(SatursRepository satursRepository) {
        super();
        this.satursRepository = satursRepository;
    }

    @Override
    public List<Saturs>findAll(){
        return satursRepository.findAll();
    }
    @Override
    public Saturs saveSaturs(Saturs saturs){
        return satursRepository.save(saturs);
    }
}
