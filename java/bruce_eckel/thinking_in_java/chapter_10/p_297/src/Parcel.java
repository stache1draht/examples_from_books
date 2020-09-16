//demonstrating usage of anonymous inner classes

interface Contents {
    int value();
}

public class Parcel {
    public Contents contents() {
        return new Contents() {
            private int i=11;
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel p=new Parcel();
        Contents c=p.contents();
    }
}
