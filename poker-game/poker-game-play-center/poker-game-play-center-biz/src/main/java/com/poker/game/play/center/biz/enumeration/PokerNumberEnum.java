package com.poker.game.play.center.biz.enumeration;

import lombok.Getter;

public enum PokerNumberEnum {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    SMALL_JOKER(Integer.MAX_VALUE - 1),
    BIG_JOKER(Integer.MAX_VALUE);

    @Getter
    private final int number;

    PokerNumberEnum(int number) {
        this.number = number;
    }
}
