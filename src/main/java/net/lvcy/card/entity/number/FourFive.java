package net.lvcy.card.entity.number;

import net.lvcy.card.core.AbstarctCard;
import net.lvcy.card.entity.CombinNine;
import net.lvcy.card.eumn.CardType;

public class FourFive extends AbstarctCard implements RedCard, CombinNine {

	public FourFive() {
		this.type = CardType.FOUR_FIVE;
	}
}
