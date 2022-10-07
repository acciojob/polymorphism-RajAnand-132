package com.driver;

public class Main {
  public class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("Product method is called with two integer parameter: Answer = "+p.product(3,4));
        System.out.println("Product method is called with three integer parameter: Answer = "+p.product(3,4,5));
        System.out.println("Product method is called with two double parameter: Answer = "+p.product(3,4));

    }

}
