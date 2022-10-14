package br.naldo.webflux.controller;

import br.naldo.webflux.entity.CharacterEntity;
import br.naldo.webflux.service.CharacterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v3/character")
public class CharacterController {
    private final CharacterServiceImpl service;

    @Autowired
    public CharacterController(CharacterServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/all")
    public Flux<CharacterEntity> getAllCharacters() {
        return service.getAllCharacters();
    }

    @GetMapping("/find/{id}")
    public Mono<CharacterEntity> getCharacterById(@PathVariable("id") String id){
        return service.getCharacterById(id);
    }

    @PostMapping("/add")
    public Mono<CharacterEntity> addCharacter(@RequestBody CharacterEntity character){
        return service.createCharacter(character);
    }

    @PutMapping("/update")
    public Mono<CharacterEntity> updateCharacter(@RequestBody CharacterEntity character){
        return service.updateCharacter(character);
    }

    @DeleteMapping("/kill/{id}")
    public void killCharacter(@PathVariable("id") String id){
        service.killCharacter(id);
    }

}

