package br.naldo.webflux.service;

import br.naldo.webflux.entity.CharacterEntity;
import br.naldo.webflux.repository.CharacterRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@NoArgsConstructor
@Service
public class CharacterServiceImpl implements ICharacterService {

    private CharacterRepository repo;

    @Autowired
    public CharacterServiceImpl(CharacterRepository repository) {
        this.repo = repository;
    }

    @Override
    public Mono<CharacterEntity> getCharacterById(String id) {
        throw new UnsupportedOperationException(
                String.format("You've reached getCharacterById(%s) @ CharacterServiceImpl.java Jack, but it is not supported yet.", id));
    }

    @Override
    public boolean isAlive(String id) {
        throw new UnsupportedOperationException(
                String.format("You've reached isAlive(%s) @ CharacterServiceImpl.java Jack, but it is not supported yet.", id));
    }

    @Override
    public Flux<CharacterEntity> getAllCharacters() {
        throw new UnsupportedOperationException(
               "You've reached getAllCharacters() @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }

    @Override
    public Flux<CharacterEntity> getCharactersByPlayerId(String playerId) {
        throw new UnsupportedOperationException(
                String.format("You've reached getCharactersByPlayerId(%s) @ CharacterServiceImpl.java Jack, but it is not supported yet.", playerId));
    }

    @Override
    public Mono<CharacterEntity> createCharacter(CharacterEntity characterEntity) {
        throw new UnsupportedOperationException(
                String.format("You've reached createCharacter(%s) @ CharacterServiceImpl.java Jack, but it is not supported yet.", characterEntity.toString()));
    }

    @Override
    public Mono<CharacterEntity> updateCharacter(CharacterEntity characterEntity) {
        throw new UnsupportedOperationException(
                String.format("You've reached updateCharacter(%s) @ CharacterServiceImpl.java Jack, but it is not supported yet.", characterEntity.toString()));
    }

//    @Override
//    public void killCharacter(String id) {
//        throw new UnsupportedOperationException(
//                String.format("You've reached killCharacter(%s) @ CharacterServiceImpl.java Jack, but it is not supported yet.", id));
//    }

    @Override
    public boolean isAwake(String id) {
        throw new UnsupportedOperationException(
                String.format("You've reached isAwake(%s) @ CharacterServiceImpl.java Jack, but it is not supported yet.", id));
    }
}
