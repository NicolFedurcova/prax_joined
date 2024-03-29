package sk.upjs.ics.op.entities;

import java.util.List;
import java.util.Objects;

public class Title {

    private String kind;
    private String name;
    private List<Label> labels;

    public Title() {
    }

    public Title(String kind, String name, List<Label> labels) {
        this.kind = kind;
        this.name = name;
        this.labels = labels;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "{" +
                "\"kind\": \"" + kind + '\"' +
                ", \"name\": \"" + name + '\"' +
                ", \"labels\": " + labels +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return Objects.equals(kind, title.kind) && Objects.equals(name, title.name) && Objects.equals(labels, title.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, name, labels);
    }
}
