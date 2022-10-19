package br.naldo.webflux.service;

import br.naldo.webflux.entity.CharacterEntity;
import java.util.List;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICharacterService {

    /**
     * Returns the character based on the given id
     **/
    Mono<CharacterEntity> getCharacterById(String id);

    /**
     * return true if the character is alive or false otherwise.
     **/
    boolean isAlive(String id);

    /***
     * Retrieve the {@link List<CharacterEntity>} of all characters
     */
    Flux<CharacterEntity> getAllCharacters();

    /***
     * Retrieve the {@link List<CharacterEntity>} of all characters of a given player
     * @param playerId the id of the player
     * A NPC must belong to the player GM, and GM must have an id like any player
     */
    Flux<CharacterEntity> getCharactersByPlayerId(String playerId);

    /***
     * The born of the character
     * @param characterEntity
     */
    Mono<CharacterEntity> createCharacter(CharacterEntity characterEntity);

    /***
     * Update the character
     * @param characterEntity
     */
    Mono<CharacterEntity> updateCharacter(CharacterEntity characterEntity);

    /***
     * @deprecated
     * Kill the character setting the isAlive to false
     * @param id
     */
//    @Deprecated(forRemoval = true)
//    void killCharacter(String id);

    /***
     * Returns true if the character is awake
     */
    boolean isAwake(String id);

}

