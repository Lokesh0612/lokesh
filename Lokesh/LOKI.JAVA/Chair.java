class Chair {
    int legs;
    int splits;

    Chair(int legs) {
        this.legs = legs;
    }

    void sit() {
        System.out.println("sat");
    }

    public String toString() {
        return "legs:" + legs + " splits:" + splits;
    }
}

class Main {
    public static void main(String args[]) {
        Chair c1 = new Chair(4);
        c1.splits = 10;
        c1.sit();
        System.out.println(c1);
        Chair c2 = new Chair(5);
        System.out.println(c2.splits);
    }
}