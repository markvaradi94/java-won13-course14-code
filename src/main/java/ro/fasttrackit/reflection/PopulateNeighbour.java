package ro.fasttrackit.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PopulateNeighbour {
    int noOfNeighbours() default 0;
}
