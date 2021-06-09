package com.model.app;
import com.model.CD;
import com.model.HollywoodCD;
import com.model.SpecialCD;

public class App {
    public static void main(String[] args){
        CD mycd = null;
        mycd = new HollywoodCD("Spider Man",200.4,"Eng");
        System.out.println(mycd.getDetails());
        mycd = new SpecialCD("Thor",190.3, "4DX");
        System.out.println(mycd.getDetails());
    }
}
