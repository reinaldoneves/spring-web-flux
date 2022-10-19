package br.naldo.webflux;

import br.naldo.webflux.entity.CharacterEntity;
import br.naldo.webflux.service.ICharacterService;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

import reactor.core.publisher.Mono;

@Component
public class CharacterHandler {

    @Autowired
    ICharacterService service;

    public Mono<ServerResponse> findAll(ServerRequest request){
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.getAllCharacters(), CharacterEntity.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request){
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.getCharacterById(id), CharacterEntity.class);
    }

    public Mono<ServerResponse> save(ServerRequest request){
        final Mono<CharacterEntity> playlist = request.bodyToMono(CharacterEntity.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(playlist.flatMap(service::createCharacter), CharacterEntity.class));
    }

}