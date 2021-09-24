package stylepatrick.kafka.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter(AccessLevel.PROTECTED)
public class Film {

    public Film() {
    }

    public Film(String name, Integer releasedYear) {
        this.name = name;
        this.releasedYear = releasedYear;
    }

    private String name;
    private Integer releasedYear;
}
