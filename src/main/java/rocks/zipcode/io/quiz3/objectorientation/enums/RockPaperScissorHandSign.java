package rocks.zipcode.io.quiz3.objectorientation.enums;

import java.util.Scanner;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    ROCK, PAPER, SCISSOR;

    public RockPaperScissorHandSign getWinner() {

            if (this == ROCK)
                return PAPER;
        else

            if (this == PAPER)
                return SCISSOR;
        else
                return ROCK;

    }

    public RockPaperScissorHandSign getLoser() {

        if (this == ROCK)
            return SCISSOR;
        else

        if (this == SCISSOR)
            return PAPER;
        else
            return ROCK;
    }
}
