package net.lvcy.card.entity;

import net.lvcy.card.eumn.CardStatus;
import net.lvcy.card.eumn.CardType;

public interface Card {

	public void setStatus(CardStatus status);
	public CardStatus getStatus();
	public CardType getType();
	public boolean equal(int code);
	
}
