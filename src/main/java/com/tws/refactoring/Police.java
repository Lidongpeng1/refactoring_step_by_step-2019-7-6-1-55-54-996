package com.tws.refactoring;

public class Police {
    public static int maxAge = 18;
    public boolean checkDriver(Driver driver) {
        return driver.getAge() >= maxAge;
//        if(driver.age >= 18) return true;
//        else return false;
    }
}
