package be.vdab.repositories;

import java.util.List;
import java.util.Optional;

import be.vdab.entities.Filiaal;

// enkele imports ...

public interface FiliaalRepository {

void create(Filiaal filiaal);

Optional<Filiaal> read(long id);

void update(Filiaal filiaal);

void delete(long id);

List<Filiaal> findAll();

long findAantalFilialen();

// het aantal werknemers van een filiaal:

long findAantalWerknemers(long id);

}