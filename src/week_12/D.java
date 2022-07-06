package week_12;

class D {
    static {
        System.out.println("static block of class D");
    }
}

class E extends D {
    static {
        System.out.println("static block of class E");
    }
}

class F extends E {
    static {
        System.out.println("static block of class F");
    }
}

class MainClass2 {
    public static void main(String[] args) {
        F f = new F();
    }
}


