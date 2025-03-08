package org.example.bai1.state;

import org.example.bai1.state.states.NewOrderState;

public class OrderContext {
    private OrderState state;
    private OrderState currentState;

    public OrderContext() {
        this.state = new NewOrderState();
        this.currentState = new NewOrderState();
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void setCurrentState(OrderState state) {
        this.state = state;
    }

    public void prossingOrder(){
        state.handleOrder(this);
    }
}
