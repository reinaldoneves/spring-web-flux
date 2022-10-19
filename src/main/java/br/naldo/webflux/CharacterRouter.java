package br.naldo.webflux;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class CharacterRouter {

    @Bean
    public RouterFunction<ServerResponse> route(CharacterHandler handler){
        return RouterFunctions
                .route(GET("/character").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/character/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
                .andRoute(POST("/character").and(accept(MediaType.APPLICATION_JSON)), handler::save);
    }

}
