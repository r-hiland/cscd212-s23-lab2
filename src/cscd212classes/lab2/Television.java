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
        if (make == null || model == null || screenSize < 32 || resolution < 720) {
            throw new IllegalArgumentException("Invalid parameter in constructor");
        }
        this.fourK = resolution == 2160;
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
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getResolution() {
        return this.resolution;
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    @Override
    public String toString() {
        String smarttv, res;
        if (this.fourK) {
            res = "4K resolution";
        } else {
            res = this.resolution + " resolution";
        }
        if (this.smart) {
            smarttv = "smart tv";
        } else {
            smarttv = "tv";
        }


        return this.make + "-" + this.model + ", " + this.screenSize + " inch " + smarttv + " with " + res;
    }

    @Override //Intellij generated
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Television that)) {
            return false;
        }
        return this.fourK == that.fourK && this.resolution == that.resolution && this.screenSize == that.screenSize && this.smart == that.smart && Objects.equals(this.make, that.make) && Objects.equals(this.model, that.model);
    }

    @Override //Intellij generated.
    public int hashCode() {

        return Objects.hashCode(this.make) + Objects.hashCode(this.model) + Objects.hashCode(this.resolution) + Objects.hashCode(this.smart) + Objects.hashCode(this.fourK);
    }

    @Override
    public int compareTo(final Television another) {
        if (another == null) {
            throw new IllegalArgumentException("null parameter in the compareTo method");
        }

        int makeCompare = this.make.compareTo(another.make);
        if (makeCompare == 0) {
            int modelCompare = this.model.compareTo(another.model);
            if (modelCompare == 0) {

                return this.screenSize - another.screenSize;
            }
            return modelCompare;
        }
        return makeCompare;
    }
}