package net.lvcy.card.entity.number;

import net.lvcy.card.core.AbstarctCard;
import net.lvcy.card.entity.CombinSeven;
import net.lvcy.card.eumn.CardType;

public class TwoFive extends AbstarctCard implements BlackCard, CombinSeven {

	public TwoFive() {
		this.type = CardType.TWO_FIVE;
	}
}
