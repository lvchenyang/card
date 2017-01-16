package net.lvcy.card.entity.number;

import net.lvcy.card.core.AbstarctCard;
import net.lvcy.card.entity.CombinNine;
import net.lvcy.card.eumn.CardType;

public class ThreeSix extends AbstarctCard implements BlackCard, CombinNine {

	public ThreeSix() {
		this.type = CardType.THREE_SIX;
	}
}
