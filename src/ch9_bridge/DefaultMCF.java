package ch9_bridge;

public class DefaultMCF implements MorseCodeFunction{
    @Override
    public void dot() {
        System.out.print("dot ");
    }

    @Override
    public void dash() {
        System.out.print("dash");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
