package org.example.bai1.normal;

public class OrderState {
    private State state;

    public OrderState(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void prossingOrder() {
        if(state == State.NEW) {
            state = State.PROSSING;
            System.out.println("Prossing order");
        }else {
            System.out.println("Can't prossing order");
        }
    }

    public void delivered() {
        if(state == State.PROSSING) {
            state = State.DELIVERED;
            System.out.println("Delivered order");
        }else{
            System.out.println("Can't deliver order");
        }
    }

    public void cancelled() {
        if(state == State.PROSSING) {
            state = State.CANCELED;
            System.out.println("Cancelled order");
        }else{
            System.out.println("Can't cancel order");
        }
    }
}
