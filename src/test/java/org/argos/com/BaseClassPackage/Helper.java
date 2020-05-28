package org.argos.com.BaseClassPackage;

import java.util.Random;

public class Helper extends DriverFactory{
    public int select(int size){
        Random random= new Random();
        int i;
        i = random.nextInt(size - 1);
        return i;

    }
}
