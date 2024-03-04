package org.amaap.liftkata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LiftTest {

    Lift lift = new Lift(4,6); // maxFloor, maxCapacity

    @Test
    void shouldAbleToInitiateProperties(){

        assertEquals(4,lift.getTotalFloor());
        assertEquals(6,lift.getMaxCapacity());
        assertEquals(0,lift.getCurrentFloor());
        assertEquals(1,lift.getLiftDirection());
        assertFalse(lift.isDoorCondition());

    }
    @Test
    void shouldCallLiftAtSourceAndMoveInUpwardDirection() throws BeyondCapacaityException, InterruptedException {

        lift.callLift(2,4,2);
        assertEquals(4, lift.getCurrentFloor());
        assertEquals(1,lift.getLiftDirection());

    }
    @Test
    void shouldGoToDestinationFloorAndMoveInDownwardDirection() throws BeyondCapacaityException, InterruptedException {

        lift.callLift(2,1,4);
        assertEquals(-1,lift.getLiftDirection());
        assertEquals(1,lift.getCurrentFloor());
        assertTrue(lift.dingMessage);

    }
    @Test
    void shouldAbleToThrowBeyondCapacityExceptionWhenPassengerIsMoreThanMaximumCapacity(){

        assertThrows(BeyondCapacaityException.class,()->{
            lift.callLift(2,3,8);
        });

    }

}
