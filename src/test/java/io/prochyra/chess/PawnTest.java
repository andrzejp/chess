package io.prochyra.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTest {

    @Test
    void testCreate() {
        final String white = "white";
        Pawn firstPawn = new Pawn(white);
        assertEquals(white, firstPawn.getColor());

        final String black = "black";
        Pawn secondPawn = new Pawn(black);
        assertEquals(black, secondPawn.getColor());
    }
}
