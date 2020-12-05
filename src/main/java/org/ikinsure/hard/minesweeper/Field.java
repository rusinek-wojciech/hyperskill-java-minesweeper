package org.ikinsure.hard.minesweeper;

public abstract class Field {

    private Mode mode;

    public Field(Mode mode) {
        this.mode = mode;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
