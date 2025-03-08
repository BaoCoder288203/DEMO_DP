package org.example.bai1.state.states;

import org.example.bai1.state.OrderContext;
import org.example.bai1.state.OrderState;

public class NewOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext orderContext) {
        System.out.println("New Order");
        orderContext.setState(new ProssingState());
        orderContext.setCurrentState(new ProssingState());
    }
}
