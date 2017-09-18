package cz.steman.structural.bridge.movie;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append("<table>");
        builder.append("<th>");
        builder.append("Classification");
        builder.append("</th><th>");
        builder.append(header);
        builder.append("</th>");

        details.forEach(it -> {
            builder.append("<tr><td>");
            builder.append(it.getLabel());
            builder.append("</td><td>");
            builder.append(it.getValue());
            builder.append("</td></tr>");
        });
        builder.append("</table>");

        return builder.toString();
    }
}
