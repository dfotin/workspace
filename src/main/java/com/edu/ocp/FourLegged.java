package com.edu.ocp;

public class FourLegged {
    private String walk1 = "walk";

    public void walk() {
        System.out.println(walk1);
    }

    static class BabyRhino extends FourLegged {
        private String walk2 = "toddle";

        // comment this method and see which is variable will be used
        @Override
        public void walk() {
            System.out.println(walk2);
        }
    }


    public static void main(String[] args) {
        FourLegged fourLegged = new BabyRhino();

        BabyRhino babyRhino = new BabyRhino();

        fourLegged.walk();
        babyRhino.walk();
    }
}
