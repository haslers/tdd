package de.fjd.fim;

public class MarsRover {

    private int x;
    private int y;
    private String direction;


    public MarsRover() {
        x = 0;
        y = 0;
        direction = "N";

    }


    public String getPosition() {
        return new StringBuilder()
                .append(x)
                .append(",")
                .append(y)
                .append(",")
                .append(direction)
                .toString()
                ;
    }

    public void move(String input) {
        switch (input) {
            case "F" : y++; break;
            case "B" : y--; break;
        }

    }


}
