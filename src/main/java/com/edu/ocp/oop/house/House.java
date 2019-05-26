package com.edu.ocp.oop.house;

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}