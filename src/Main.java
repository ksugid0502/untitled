public class Main {
    public static void main(String[] args) {
      long[] sales={500L, 100L, 300L, 400L};

        SalesManager p1 = new SalesManager(sales);
        System.out.println("max: " + p1.max());
    }
}