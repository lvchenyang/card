package net.lvcy.card.entity.number;

import net.lvcy.card.core.AbstarctCard;
import net.lvcy.card.entity.CombinEight;
import net.lvcy.card.eumn.CardType;

public class TwoSix extends AbstarctCard implements BlackCard, CombinEight {

	public TwoSix() {
		this.type = CardType.TWO_SIX;
	}
}
