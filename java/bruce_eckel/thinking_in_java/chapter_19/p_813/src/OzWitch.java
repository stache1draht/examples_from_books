public enum OzWitch {
    WEST ("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH ("Glinda, the Good Witch of the North"),
    EAST ("Wicked witch of the East, wearer of the Ruby" + "Slippers, crushed by Dotothy's house"),
    SOUTH ("Good by inference, but missing");

    private String Description;

    //constructor must be declared as private or default
    private OzWitch(String Description){
        this.Description=Description;
    }

    public String getDescription() {return Description;}

    public static void main(String[] main){
        for (OzWitch witch:OzWitch.values())
            System.out.println(witch+": "+witch.getDescription());
    }
}
