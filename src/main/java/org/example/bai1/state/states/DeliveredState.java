package org.example.bai1.state.states;

import org.example.bai1.state.OrderContext;
import org.example.bai1.state.OrderState;

public class DeliveredState implements OrderState {

    @Override
    public void handleOrder(OrderContext orderContext) {
        orderContext.setCurrentState(new DeliveredState());
        System.out.println("Delivered");
    }
}
