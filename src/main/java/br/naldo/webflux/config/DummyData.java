package br.naldo.webflux.config;

import java.util.UUID;

import br.naldo.webflux.entity.CharacterEntity;
import br.naldo.webflux.repository.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import java.time.LocalDateTime;

@Component
public class DummyData  implements CommandLineRunner {
    private final CharacterRepository repo;

    DummyData(CharacterRepository repository) {
        this.repo = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll()
                .thenMany(
                        Flux.just("Dwalin", "Balin", "Kili",
                                        "Fili", "Dori", "Nori", "Ori", "Oin", "Gloin", "Bifur", "Bofur", "Bombur", "Thorin")
                                .map(nome -> CharacterEntity.builder()
                                          .id(UUID.randomUUID().toString())
                                          .playerId(UUID.randomUUID().toString())
                                          .age(1000)
                                          .history("Just another short, ugly and angry Dwarf")
                                          .birthDate(LocalDateTime.now())
                                          .Race("Dwarf").build())
                                .flatMap(repo::save))
                .subscribe(System.out::println);
    }

}