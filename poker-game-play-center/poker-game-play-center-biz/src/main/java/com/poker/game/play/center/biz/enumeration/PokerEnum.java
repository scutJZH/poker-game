package com.poker.game.play.center.biz.enumeration;

import lombok.Getter;

public enum PokerEnum {
    /**
     * 黑桃A-K
     */
    SPADE_ACE(PokerSuitEnum.SPADE, PokerNumberEnum.ACE),
    SPADE_TWO(PokerSuitEnum.SPADE, PokerNumberEnum.TWO),
    SPADE_THREE(PokerSuitEnum.SPADE, PokerNumberEnum.THREE),
    SPADE_FOUR(PokerSuitEnum.SPADE, PokerNumberEnum.FOUR),
    SPADE_FIVE(PokerSuitEnum.SPADE, PokerNumberEnum.FIVE),
    SPADE_SIX(PokerSuitEnum.SPADE, PokerNumberEnum.SIX),
    SPADE_SEVEN(PokerSuitEnum.SPADE, PokerNumberEnum.SEVEN),
    SPADE_EIGHT(PokerSuitEnum.SPADE, PokerNumberEnum.EIGHT),
    SPADE_NINE(PokerSuitEnum.SPADE, PokerNumberEnum.NINE),
    SPADE_TEN(PokerSuitEnum.SPADE, PokerNumberEnum.TEN),
    SPADE_JACK(PokerSuitEnum.SPADE, PokerNumberEnum.JACK),
    SPADE_QUEEN(PokerSuitEnum.SPADE, PokerNumberEnum.QUEEN),
    SPADE_KING(PokerSuitEnum.SPADE, PokerNumberEnum.KING),

    /**
     * 红桃A-K
     */
    HEART_ACE(PokerSuitEnum.HEART, PokerNumberEnum.ACE),
    HEART_TWO(PokerSuitEnum.HEART, PokerNumberEnum.TWO),
    HEART_THREE(PokerSuitEnum.HEART, PokerNumberEnum.THREE),
    HEART_FOUR(PokerSuitEnum.HEART, PokerNumberEnum.FOUR),
    HEART_FIVE(PokerSuitEnum.HEART, PokerNumberEnum.FIVE),
    HEART_SIX(PokerSuitEnum.HEART, PokerNumberEnum.SIX),
    HEART_SEVEN(PokerSuitEnum.HEART, PokerNumberEnum.SEVEN),
    HEART_EIGHT(PokerSuitEnum.HEART, PokerNumberEnum.EIGHT),
    HEART_NINE(PokerSuitEnum.HEART, PokerNumberEnum.NINE),
    HEART_TEN(PokerSuitEnum.HEART, PokerNumberEnum.TEN),
    HEART_JACK(PokerSuitEnum.HEART, PokerNumberEnum.JACK),
    HEART_QUEEN(PokerSuitEnum.HEART, PokerNumberEnum.QUEEN),
    HEART_KING(PokerSuitEnum.HEART, PokerNumberEnum.KING),

    /**
     * 梅花A-K
     */
    CLUB_ACE(PokerSuitEnum.CLUB, PokerNumberEnum.ACE),
    CLUB_TWO(PokerSuitEnum.CLUB, PokerNumberEnum.TWO),
    CLUB_THREE(PokerSuitEnum.CLUB, PokerNumberEnum.THREE),
    CLUB_FOUR(PokerSuitEnum.CLUB, PokerNumberEnum.FOUR),
    CLUB_FIVE(PokerSuitEnum.CLUB, PokerNumberEnum.FIVE),
    CLUB_SIX(PokerSuitEnum.CLUB, PokerNumberEnum.SIX),
    CLUB_SEVEN(PokerSuitEnum.CLUB, PokerNumberEnum.SEVEN),
    CLUB_EIGHT(PokerSuitEnum.CLUB, PokerNumberEnum.EIGHT),
    CLUB_NINE(PokerSuitEnum.CLUB, PokerNumberEnum.NINE),
    CLUB_TEN(PokerSuitEnum.CLUB, PokerNumberEnum.TEN),
    CLUB_JACK(PokerSuitEnum.CLUB, PokerNumberEnum.JACK),
    CLUB_QUEEN(PokerSuitEnum.CLUB, PokerNumberEnum.QUEEN),
    CLUB_KING(PokerSuitEnum.CLUB, PokerNumberEnum.KING),

    /**
     * 方片A-K
     */
    DIAMOND_ACE(PokerSuitEnum.DIAMOND, PokerNumberEnum.ACE),
    DIAMOND_TWO(PokerSuitEnum.DIAMOND, PokerNumberEnum.TWO),
    DIAMOND_THREE(PokerSuitEnum.DIAMOND, PokerNumberEnum.THREE),
    DIAMOND_FOUR(PokerSuitEnum.DIAMOND, PokerNumberEnum.FOUR),
    DIAMOND_FIVE(PokerSuitEnum.DIAMOND, PokerNumberEnum.FIVE),
    DIAMOND_SIX(PokerSuitEnum.DIAMOND, PokerNumberEnum.SIX),
    DIAMOND_SEVEN(PokerSuitEnum.DIAMOND, PokerNumberEnum.SEVEN),
    DIAMOND_EIGHT(PokerSuitEnum.DIAMOND, PokerNumberEnum.EIGHT),
    DIAMOND_NINE(PokerSuitEnum.DIAMOND, PokerNumberEnum.NINE),
    DIAMOND_TEN(PokerSuitEnum.DIAMOND, PokerNumberEnum.TEN),
    DIAMOND_JACK(PokerSuitEnum.DIAMOND, PokerNumberEnum.JACK),
    DIAMOND_QUEEN(PokerSuitEnum.DIAMOND, PokerNumberEnum.QUEEN),
    DIAMOND_KING(PokerSuitEnum.DIAMOND, PokerNumberEnum.KING),

    /**
     * 大小王
     */
    SMALL_JOKER(PokerSuitEnum.JOKER, PokerNumberEnum.SMALL_JOKER),
    BIG_JOKER(PokerSuitEnum.JOKER, PokerNumberEnum.BIG_JOKER),
    ;

    @Getter
    private final PokerSuitEnum suit;

    @Getter
    private final PokerNumberEnum number;

    PokerEnum(PokerSuitEnum suit, PokerNumberEnum number) {
        this.suit = suit;
        this.number = number;
    }
}
