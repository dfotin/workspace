package com.edu.ocp.oop;


class OuterWorld {
    public InnerPeace i = new InnerPeace();

    private class InnerPeace {
        private String reason = "none";
    }
}
