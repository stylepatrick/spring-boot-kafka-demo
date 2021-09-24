package stylepatrick.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import stylepatrick.kafka.model.Car;
import stylepatrick.kafka.model.Film;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "car-topic", groupId = "group_car", containerFactory = "kafkaListenerContainerFactoryCar")
    public void listenerCar(Car car) {
        System.out.println("Received Car Message in group_car: " + car.getName() + " " + car.getBrand());
    }

    @KafkaListener(topics = "film-topic", groupId = "group_film", containerFactory = "kafkaListenerContainerFactoryFilm")
    public void listenerFilm(Film film) {
        System.out.println("Received Film Message in group_film: " + film.getName() + " " + film.getReleasedYear());
    }
}
