package ro.fasttrackit.reflection;

import ro.fasttrackit.annotations.Country;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ReflectionExercise {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Country romania = new Country("Romania", "Bucurest", 15L);

        Field hiddenField = Country.class.getDeclaredField("hiddenField");
        hiddenField.setAccessible(true);
        hiddenField.set(romania, "Hello from reflection");
        System.out.println(romania);

        Annotation[] annotations = hiddenField.getAnnotations();
        System.out.println(Arrays.toString(annotations));
        System.out.println("==========================================");

        Field neighbours = Country.class.getDeclaredField("neighbours");
        neighbours.setAccessible(true);
        PopulateNeighbour populateNeighbour = neighbours.getAnnotation(PopulateNeighbour.class);
        List<String> countryNeighbours = (List<String>) neighbours.get(romania);

        for (int i = 0; i < populateNeighbour.noOfNeighbours(); i++) {
            countryNeighbours.add("Country %s".formatted(i));
        }

        System.out.println(romania);
    }
}
