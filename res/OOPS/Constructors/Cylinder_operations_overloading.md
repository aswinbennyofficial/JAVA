
    create a class cylinder and use getter and setters to set its radius and height 
    use constructors to calculate surface and volume of the cylinder  

```java
class Cylinder {
    int radius, height;

    Cylinder(int r,int h){
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
        int r=9,h=12;
        Cylinder blu=new Cylinder(r,h);


        System.out.println(blu.getSarea());
        System.out.println(blu.getVolume());
    }

}

```

### Constructor overloading

```java
class Cylinder {
    int radius, height;

    Cylinder(){
        radius=0;
        height=0;
    }

    Cylinder(int r){
        radius=r;
        height=0;
    }

    Cylinder(int r,int h){
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
        int r=9,h=12;
        //Cylinder blu=new Cylinder(r,h);

        Cylinder blu=new Cylinder(r);
        //Cylinder blu=new Cylinder();

        System.out.println(blu.getSarea());
        System.out.println(blu.getVolume());
    }

}

```
