interface Destination {
    String readLabel();
}
public class Parcel {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination (String whereTo) {
                label=whereTo;
            }

            public String readLabel() {
                return label;
            }
        }

        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel p=new Parcel();
        Destination d=p.destination("Colorado");
    }
}