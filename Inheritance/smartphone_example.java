abstract class mobile{
    abstract void call();
    abstract void text();
}

interface GPS{
    void locate();
}
interface ipod{
    void play();
}

class smartphone extends mobile implements GPS,ipod{
    @Override
    public void call(){
        System.out.println("calling....");
    }
    @Override
    public void text(){
        System.out.println("sending msg..");
    }

    @Override
    public void locate() {
        System.out.println("Getting GPS location");
    }

    @Override
    public void play() {
        System.out.println("Playing song...");

    }
}

class Main{
    public static void main(String[] args) {
        ipod obj=new smartphone();
        obj.play();
    }
}
