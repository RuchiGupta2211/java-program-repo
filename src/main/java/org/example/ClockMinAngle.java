package org.example;

public class ClockMinAngle {

    public static void main(String[] args) {
        System.out.println(angleClock(12, 30));
    }
    public static double angleClock(int hour, int minutes) {
        // hour 1 min = 0.5 degs, min 1 min = 6 degs
        double hAngle = (60*hour + minutes) * 0.5;
        double mAngle = minutes * 6;
        double angle = Math.abs(hAngle - mAngle);
        return Math.min(angle, 360 - angle);
    }
}
