package ro.fasttrackit.annotations;

import lombok.*;
import ro.fasttrackit.reflection.PopulateNeighbour;

import java.util.ArrayList;
import java.util.List;

@Data
public class Country {

    @MyFirstAnnotation(flag = true)
    private final String name;
    private final String capital;
    private final long population;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @MyFirstAnnotation
    private String hiddenField;

    @PopulateNeighbour(noOfNeighbours = 3)
    private List<String> neighbours = new ArrayList<>();

    @MyFirstAnnotation
    public void doSomething() {
        System.out.println("hi");
    }
}
