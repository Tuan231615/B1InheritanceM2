public class Cylinder extends Circle{
    private double height;
   public Cylinder() {}
    public Cylinder(double height , double radius, String color){
        super(radius, color);
       this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
       return this.height*this.setArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + " which is a subclass of A " + super.toString() + " volume: " + getVolume();
    }
}
