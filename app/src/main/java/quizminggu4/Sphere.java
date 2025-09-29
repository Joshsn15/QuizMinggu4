package quizminggu4;

public class Sphere extends Object3D {
    String name;
    int radius;
    public Sphere(String name, int radius){
        this.name = name;
        this.radius = radius;
    }
    @Override
    String shapeName(){
        return this.name;
    }

    @Override double getVolume(){
        return   ((4/3)*3.14*(radius*radius*radius));
    }

    @Override double getSurfaceArea(){
        return (4)*3.14*(radius*radius);
    }
    
}
