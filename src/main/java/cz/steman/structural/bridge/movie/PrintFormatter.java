package cz.steman.structural.bridge.movie;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append(header);
        builder.append("\n");

        details.forEach(it -> {
            builder.append(it.getLabel());
            builder.append(":");
            builder.append(it.getValue());
            builder.append("\n");
        });

        return builder.toString();
    }
}
