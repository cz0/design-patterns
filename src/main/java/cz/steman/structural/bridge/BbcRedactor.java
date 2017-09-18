package cz.steman.structural.bridge;

import java.util.List;

public class BbcRedactor implements Redactor {

    @Override
    public String redact(List<Attribute> attributes) {

        StringBuilder builder = new StringBuilder();

        builder.append("BBC news");
        builder.append("\n");

        attributes.forEach(it -> {
            builder.append(it.getName());
            builder.append(":");
            builder.append(it.getValue());
            builder.append("\n");
        });

        return builder.toString();
    }
}
