class college {
    String name;
    static int count;

    @SuppressWarnings("static-access")
    college(String x, int y) {
        this.name = x;
        this.count = y;
    }

    static int getCount() {
        return count;
    }
}

public class College1 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        college c1 = new college("spec", 3000);
        college c2 = new college("nrms", 5000);

        System.out.println(college.count);
        c1.count = 4000;
        System.out.println(college.getCount()); 
        System.out.println(c2.count); 
    }
}