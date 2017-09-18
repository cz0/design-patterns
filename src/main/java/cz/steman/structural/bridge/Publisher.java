package cz.steman.structural.bridge;

import java.util.List;

public abstract class Publisher {

    public String publish(Redactor redactor) {
        return redactor.redact(getAttributes());
    }

    protected abstract List<Attribute> getAttributes();

}
