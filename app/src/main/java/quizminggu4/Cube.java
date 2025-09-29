package quizminggu4;

public class Cube extends Object3D {
    String name;
    int side;
    public Cube(String name, int side){
        this.name = name;
        this.side = side;
    }
     @Override
    String shapeName(){
        return this.name;
    }

    @Override double getVolume(){
        return side*side*side;
    }

    @Override double getSurfaceArea(){
        return 6 *(side * side);
    }
}
