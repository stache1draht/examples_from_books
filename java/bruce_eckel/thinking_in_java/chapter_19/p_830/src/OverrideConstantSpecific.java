//overriding enum default methods

public enum OverrideConstantSpecific {
    NUL, BOLT,
    WASHER {
        void f() {
            System.out.println("Overriden method");
        }
    };

    void f() {
        System.out.println("Default behavior");
    }

    public static void main(String[] args) {
        for(OverrideConstantSpecific ocs : values()) {
            System.out.println(ocs + " ");
            ocs.f();
        }
    }
}
