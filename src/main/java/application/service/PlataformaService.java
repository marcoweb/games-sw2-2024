package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Plataforma;
import application.record.PlataformaDTO;
import application.repository.PlataformaRepository;

@Service
public class PlataformaService {
    @Autowired
    private PlataformaRepository plataformaRepo;

    public Iterable<PlataformaDTO> getAll() {
        return plataformaRepo.findAll().stream().map(PlataformaDTO::new).toList();
    }

    public PlataformaDTO insertOne(PlataformaDTO plataforma) {
        // Plataforma novo = new Plataforma(plataforma);
        // Plataforma resultado = plataformaRepo.save(novo);
        // return new PlataformaDTO(resultado);
        return new PlataformaDTO(plataformaRepo.save(new Plataforma(plataforma)));
    }
}
