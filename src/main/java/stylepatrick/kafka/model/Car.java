package stylepatrick.kafka.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter(AccessLevel.PROTECTED)
public class Car {

    public Car() {
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    private String name;
    private String brand;
}
