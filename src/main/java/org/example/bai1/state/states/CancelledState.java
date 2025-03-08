package org.example.bai1.state.states;

import org.example.bai1.state.OrderContext;
import org.example.bai1.state.OrderState;

public class CancelledState implements OrderState {
    @Override
    public void handleOrder(OrderContext orderContext) {
        if(orderContext.getCurrentState().equals(new ProssingState())) {
            System.out.println("Cancelled Order");
        }else{
//            orderContext.setCurrentState(new ProssingState());
            System.out.println("Can't Cancelled Order");
        }
    }
}
