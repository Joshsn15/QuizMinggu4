package quizminggu4;

public class Cylinder extends Object3D {
    String name;
    int radius;
    int height;

    public Cylinder(String name, int radius, int height){
        this.name = name;
        this.radius = radius;
        this.height = height;
    }

    @Override
    String shapeName() {
        return this.name;
    }

    @Override
    double getVolume() {
        return ( 3.14 * (radius * radius ) * height);
    }

    @Override
    double getSurfaceArea() {
        return (2 * 3.14 * radius * radius) + (2 * 3.14 * radius * height);
    }

}
