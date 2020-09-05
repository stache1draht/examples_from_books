//this example shows how overloaded methods of the base class can be accessed by the child class

class Homer{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f){
        System.out.println("dog(float)");
        return 1.0f;
    }
}

class Milhouse{}

class Bart extends Homer{
    void doh(Milhouse m){
        System.out.println("doh(Milhouse)");
    }
}

public class Hide {
    public static void main(String[] args){
        Bart b=new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
