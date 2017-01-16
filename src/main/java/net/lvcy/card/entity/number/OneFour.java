package net.lvcy.card.entity.number;

import net.lvcy.card.core.AbstarctCard;
import net.lvcy.card.entity.CombinFive;
import net.lvcy.card.eumn.CardType;

public class OneFour extends AbstarctCard implements RedCard, CombinFive{

	public OneFour() {
		this.type = CardType.ONE_FOUR;
	}
}
