package cz.steman.structural.bridge.movie;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setRuntime("2:15");
        movie.setTitle("John Wick");
        movie.setYear("2014");

        //These are two sides connected via "bridge"
        Formatter formatter = new PrintFormatter();
        Printer printer = new MoviePrinter(movie);

        System.out.println(printer.print(formatter));


        System.out.println(printer.print(new HtmlFormatter()));
    }
}
