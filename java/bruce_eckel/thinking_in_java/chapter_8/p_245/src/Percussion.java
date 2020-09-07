class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play()"+n);
    }

    String what() {
        return "Percussion";
    }

    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}