package org.example;

public class MyBuild {
    public static void main(String[] args) {
//        builder.basement("Framed");
//        builder.waterTank("Sump");
        // System.out.println()
//        Builder.builderObject.waterTank("PVC");
//        Builder.builderObject.basement("Framed one");
        // System.out.println()
        Contract.builderObject.basement("Piller");
    }
}

// System
class Contract{
    // static java.io.PrintStream out=new java.io.PrintStream();
    static Builder builderObject=new Builder();
}

// PrintStream
class Builder{
    // println()
    public void basement(String kind){
        System.out.println("User requested for "+kind+" of basement");
    }
    // print
    public void waterTank(String wish){
        System.out.println("User requested to store water as "+wish);
    }
}