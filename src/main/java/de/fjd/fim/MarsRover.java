package de.fjd.fim;

public class MarsRover {

    public MarsRover() {
        this.position = "0,0,N";
    }

    private String position;

    public String getPosition() {
        return position;
    }

    public void move(String f) {
    setPosition("0,1,N");

    }

    public void setPosition(String position) {
        this.position = position;
    }

}
