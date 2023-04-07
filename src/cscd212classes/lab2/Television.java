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
        if (resolution == 2160) {
            this.fourK = true;
        } else {
            this.fourK = false;
        }
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;

    }

    public Television(final String model, final boolean smart, final int screenSize, final int resolution, final String make) {
        this(make, model, smart, screenSize, resolution);

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
    @Override
    public String toString() {
        String smarttv, res;
        if(this.fourK){res = "4K resolution";}else{res = resolution + " resolution";}
        if(this.smart){smarttv = "smart tv";}else{smarttv = "tv";}


        String output = make + "-" + model + ", " + screenSize + " inch " + smarttv + " with " + res;
        return output;
    }

    @Override //Intellij generated
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Television that)) return false;
        return fourK == that.fourK && resolution == that.resolution && screenSize == that.screenSize && smart == that.smart && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override //Intellij generated.
    public int hashCode() {

        return Objects.hashCode(make) + Objects.hashCode(model) + Objects.hashCode(resolution) + Objects.hashCode(smart) + Objects.hashCode(fourK);
    }

    @Override
    public int compareTo(Television another) {
        if(another == null){throw new IllegalArgumentException("compareTo is null");}
        int makeCompare = make.compareTo(another.make);
        if (makeCompare == 0) {
            int modelCompare = model.compareTo(another.model);
            if (modelCompare == 0) {
                return Integer.compare(screenSize, another.screenSize);
            }
            return modelCompare;
        }
        return makeCompare;
    }
}