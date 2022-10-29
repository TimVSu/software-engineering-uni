public class Elevator {
    private State elevatorState;
    public static int currentFloor;
    int destFloor;
    public Elevator(int destFloor){
        currentFloor = 5;
        elevatorState = State.IDLE;
        this.destFloor = destFloor;
        if(this.destFloor < currentFloor){
            goDown();
        }
        else if(this.destFloor > currentFloor){
            goUp();
        }
        else {
            exit();
        }
    }

    private void goUp (){
        if(currentFloor < destFloor){
            elevatorState = State.MOVING_UP;
            currentFloor+=1;
            System.out.println("Floor: " + currentFloor);
            goUp();
        }
        else if (currentFloor == destFloor){
            arriveToFloor();
        }
    }
    private void arriveToFloor() {
        elevatorState = State.IDLE;
        exit();
        System.out.println("arrived at floor: " + currentFloor);
    }

    private void exit(){
        System.out.println("doors open/ exit at Floor: " + currentFloor);
    }

    public void setDestFloor(int floor){
        destFloor = floor;
        if(floor < currentFloor){
            goDown();
        }
        else if(floor > currentFloor){
            goUp();
        }
        else{
            exit();
        }
    }
    private void goDown (){
        if(currentFloor > destFloor){
            elevatorState = State.MOVING_DOWN;
            currentFloor+=1;
            System.out.println("Floor: " + currentFloor);
            goDown();
        }
        else if (currentFloor == destFloor){
            arriveToFloor();
        }
    }
}
