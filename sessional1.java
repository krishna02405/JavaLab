interface Calculate{
    void area();
    void diagonal();
}
class right_angled implements Calculate{
    double base, height;

    right_angled(double b,double h){
        base = b;
        height = h;
    }

    public void area(){
        System.out.println("Area of right angled triangle: "+(0.5*base*height));
    }

    public void diagonal(){
        System.out.println("Diagonal of triangle: "+Math.sqrt(base*base + height*height));      //((base^2+height^2)^0.5)
    }
}
class Rectangle implements Calculate {
    double base, height;

    Rectangle(double b, double h){
        base = b;
        height = h;
    }
    public void area(){
        System.out.println("Area of Rectangle: "+base * height);
    }
    public void diagonal(){
        System.out.println("Diagonal of Rectangle: "+Math.sqrt(base*base + height*height));
    }
}

public class sessional1{
    public static void main(String[] args){
        right_angled tri = new right_angled(10.2,13.9);
        tri.area();
        tri.diagonal();
        Rectangle rect = new Rectangle(10.2,13.9);
        rect.area();
        rect.diagonal();
        }
}
