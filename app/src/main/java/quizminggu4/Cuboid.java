package quizminggu4;

public class Cuboid extends Object3D {
     String name;
     int width;
     int height;
     int length;
    public Cuboid(String name, int width, int height , int length){
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
    }
    @Override
    String shapeName(){
        return this.name;
    }

    @Override double getVolume(){
        return length*width*height;
    }

    @Override double getSurfaceArea(){
        return 2 *(length*width + length*height + width*height );
    }
    
}
