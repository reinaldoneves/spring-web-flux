package br.naldo.webflux.repository;

import br.naldo.webflux.entity.CharacterEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CharacterRepository extends ReactiveMongoRepository<CharacterEntity, String> {

}
