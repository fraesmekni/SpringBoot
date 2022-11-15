package tn.esprit.spring.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Equipe;
import tn.esprit.spring.repositories.EquipeRepository;

@Service
@Slf4j
public class EquipeServiceImp implements IEquipeService{

    @Autowired
    EquipeRepository equipeRepository;

    public Long ajouterEquipe(Equipe e) {
        equipeRepository.save(e);
        log.info("Ajouter Equipe");
        return e.getIdEquipe();
    }

    @Override
    public Iterable<Equipe> retrieveAllEquipe() {return equipeRepository.findAll();}

    @Override
    public void deleteEquipe(Long id) {
        equipeRepository.deleteById(id);}

    @Override
    public Equipe updateEquipe(Equipe e) {return equipeRepository.save(e);}

    @Override
    public Equipe retrieveEquipe(Long idEquipe) {
        return equipeRepository.findById(idEquipe).get();
    }


}
