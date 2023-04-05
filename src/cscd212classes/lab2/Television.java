package cscd212classes.lab2;

import java.util.Objects;

public class Television {
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int  screenSize;
    private final boolean smart;

    public Television(String make, String model, boolean smart, int screenSize, int resolution) {
       if (make == null || model == null || screenSize < 32 || resolution < 720){
           //public IllegalArgumentException();
       }

        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
    }

}
