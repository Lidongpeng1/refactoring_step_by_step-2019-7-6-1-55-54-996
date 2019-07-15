package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DriverTset {
    @Test public void shoule_return_turn_when_age_is_18(){
        //given
        Driver driver = new Driver(18);
        Police police = new Police();
        //when
        Boolean result = police.checkDriver(driver);
        //then
        Assertions.assertEquals(true,result);
    }
}
