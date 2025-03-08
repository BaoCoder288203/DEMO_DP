package org.example.bai1.state.states;

import org.example.bai1.state.OrderContext;
import org.example.bai1.state.OrderState;

public class ProssingState implements OrderState {
    @Override
    public void handleOrder(OrderContext orderContext) {
        System.out.println("Prossing");
        orderContext.setState(new DeliveredState());
        orderContext.setCurrentState(new DeliveredState());
    }
}
