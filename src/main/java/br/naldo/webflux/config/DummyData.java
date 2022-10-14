package br.naldo.webflux.config;

import br.naldo.webflux.entity.CharacterEntity;
import br.naldo.webflux.repository.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;
import java.util.UUID;
//
//@Component
//public class DummyData  implements CommandLineRunner {
//    private final CharacterRepository repository;
//
//    DummyData(CharacterRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        repository.deleteAll()
//                .thenMany(
//                        Flux.just("Dwalin", "Balin", "Kili",
//                                        "Fili", "Dori", "Nori", "Ori", "Oin", "Gloin", "Bifur", "Bofur", "Bombur", "Thorin")
//                                .map(nome -> CharacterEntity.builder()
//                                        .id(UUID.randomUUID().toString())
//                                        .playerId(UUID.randomUUID().toString())
//                                        .age(1000)
//                                        .history("")
//                                        .birthDate(LocalDateTime.now())
//                                        .Race("Dwarf"))
//                                .flatMap(repository::save))
//                .subscribe(System.out::println);
//    }
//
//}