package blackjack.dto;

import blackjack.domain.card.Card;

public record CardDTO(String number, String shape) {
    public static CardDTO from(final Card dealerCard) {
        return new CardDTO(dealerCard.getNumberName(), dealerCard.getShapeName());
    }
}
