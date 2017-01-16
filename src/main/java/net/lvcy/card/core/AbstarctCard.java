package net.lvcy.card.core;

import net.lvcy.card.eumn.CardStatus;
import net.lvcy.card.eumn.CardType;

public abstract class AbstarctCard {

	private CardStatus status;
	protected CardType type;
	public CardStatus getStatus() {
		return status;
	}
	public void setStatus(CardStatus status) {
		this.status = status;
	}
	public CardType getType() {
		return this.type;
	}
	@Override
	public String toString() {
		
		return this.getClass().getSimpleName();
	}
	public boolean equal(int code) {
		return this.type.getCode() == code;
	}
}
