
    create a class cylinder and use getter and setters to set its radius and height and
    use it to calculate surface and volume of the cylinder 


```java
class Cylinder {
    int radius, height;

    void setDetails(int r, int h) {
        radius=r;
        height=h;
    }

    float getSarea(){
        return (float)(2*3.14*radius*(radius+height));
    }

    float getVolume(){
        return (float)(3.14*radius*radius*height);
    }
}

class Main{
    public static void main(String args[]){
        int r=8,h=10;
        Cylinder blu=new Cylinder();
        blu.setDetails(r,h);

        System.out.println(blu.getSarea());
        System.out.println(blu.getVolume());
    }

}

```
