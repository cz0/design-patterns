package cz.steman.structural.bridge.movie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }

    @Override
    protected List<Detail> getDetails() {
        return Stream
                .of(new Detail("Title", movie.getTitle()),
                        new Detail("Year", movie.getYear()),
                        new Detail("Runtime", movie.getRuntime()))
                .collect(Collectors.toList());
    }
}
