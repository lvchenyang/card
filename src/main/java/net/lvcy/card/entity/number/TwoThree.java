package net.lvcy.card.entity.number;

import net.lvcy.card.core.AbstarctCard;
import net.lvcy.card.entity.CombinFive;
import net.lvcy.card.eumn.CardType;

public class TwoThree extends AbstarctCard implements BlackCard, CombinFive {

	public TwoThree() {
		this.type = CardType.TWO_THREE;
	}
}
