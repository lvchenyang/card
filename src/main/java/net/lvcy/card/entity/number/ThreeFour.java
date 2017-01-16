package net.lvcy.card.entity.number;

import net.lvcy.card.core.AbstarctCard;
import net.lvcy.card.entity.CombinSeven;
import net.lvcy.card.eumn.CardType;

public class ThreeFour extends AbstarctCard implements RedCard, CombinSeven {

	public ThreeFour() {
		this.type = CardType.THREE_FOUR;
	}
}
