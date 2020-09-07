class StaticSuper {
    public static String staticGet() {
        return "Basic version of staticGet()";
    }

    public String dynamicGet() {
        return "Basic version of dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived version of staticGet()";
    }

    public String dynamicGet() {
        return "Derived version of dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup=new StaticSub();

        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
