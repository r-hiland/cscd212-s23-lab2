package cscd212classes.lab2;

import java.util.Objects;


public class Television implements Comparable<Television> {
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(final String make, final String model, final boolean smart, final int screenSize, final int resolution) {
        if (make.isEmpty() || model.isEmpty() || make == null || model == null || screenSize < 32 || resolution < 720) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        ;
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int hashCode() {
        return resolution;
    }

    public String toString() {
        return model;
    }

    public int compareTo(Television another){
        return 0;
    }
}