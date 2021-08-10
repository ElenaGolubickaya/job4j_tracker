package ru.job4j.ooa;

public final class Airbus extends Aircraft {

    private static final int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCountEngine() {
        int countEngine = name.equals("A380") ? 4 : COUNT_ENGINE;
        System.out.println("Количество двигателей равно: " + countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "COUNT_ENGINE=" + COUNT_ENGINE
                + ", name='" + name + '\''
                + "} " + super.toString();
    }
}

