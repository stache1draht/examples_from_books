class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play()"+n);
    }

    String what() {
        return "Wind";
    }

    void adjust(){
        System.out.println("Adjusting wind");
    }
}