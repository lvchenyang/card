package net.lvcy.card.entity.number;

import net.lvcy.card.core.AbstarctCard;
import net.lvcy.card.entity.CombinEight;
import net.lvcy.card.eumn.CardType;

public class ThreeFive extends AbstarctCard implements BlackCard, CombinEight {

	public ThreeFive() {
		this.type = CardType.THREE_FIVE;
	}
}
