package stylepatrick.kafka.resource;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stylepatrick.kafka.model.Car;
import stylepatrick.kafka.model.Film;

@RestController
@AllArgsConstructor
@RequestMapping("api/kafka")
public class WebResource {

    private final KafkaTemplate<String, Car> kafkaTemplateCar;
    private final KafkaTemplate<String, Film> kafkaTemplateFilm;

    @GetMapping("car/{name}/{brand}")
    private ResponseEntity<Object> publishCar(
            @PathVariable("name") String name,
            @PathVariable("brand") String brand
    ) {
        kafkaTemplateCar.send("car-topic", new Car(name, brand));
        return ResponseEntity.noContent().build();
    }

    @GetMapping("film/{name}/{releasedYear}")
    private ResponseEntity<Object> publishFilm(
            @PathVariable("name") String name,
            @PathVariable("releasedYear") Integer releasedYear
    ) {
        kafkaTemplateFilm.send("film-topic", new Film(name, releasedYear));
        return ResponseEntity.noContent().build();
    }
}
