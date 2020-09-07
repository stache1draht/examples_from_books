class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play()"+n);
    }

    String what(){
        return "Woodwind";
    }
}