class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play()"+n);
    }

    String what() {
        return "Stringed";
    }

    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}