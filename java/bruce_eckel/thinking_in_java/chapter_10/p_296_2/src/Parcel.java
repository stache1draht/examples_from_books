public class Parcel {
    private void internalTracking(boolean b) {
        if(b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id=s;
                }

                String getSlip() {
                    return id;
                }
            }

            TrackingSlip ts=new TrackingSlip("slip");
            String s=ts.getSlip();
        }
    }

    public void track() {
        internalTracking(true);
    }
    
    public static void main(String[] args) {
        Parcel p=new Parcel();
        p.track();
    }
}
