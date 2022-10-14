package br.naldo.webflux.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/***
 * The entity class for the <i>character_entity<i/> .
 * @author reinaldo_neves@hotmail.com
 */
@Document
@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
public class CharacterEntity {

    @Id
    private String id;
    private String playerId;
    private String name;
    private int age;
    private String history;
    private LocalDateTime birthDate;
    private String Race;

}
