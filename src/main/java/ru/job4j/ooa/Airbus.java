package ru.job4j.ooa;

public final class Airbus extends Aircraft {

    private final int COUNT_ENGINE;
    private String name;

    public Airbus(String name, int COUNT_ENGINE) {
        this.name = name;
        this.COUNT_ENGINE = COUNT_ENGINE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "COUNT_ENGINE=" + COUNT_ENGINE
                + ", name='" + name + '\''
                + "} " + super.toString();
    }
}
