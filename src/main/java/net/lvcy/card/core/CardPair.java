package net.lvcy.card.core;

import java.util.ArrayList;
import java.util.Random;

import net.lvcy.card.entity.Card;
import net.lvcy.card.entity.gate.max.FourFour;
import net.lvcy.card.entity.gate.max.OneOne;
import net.lvcy.card.entity.gate.max.OneThree;
import net.lvcy.card.entity.gate.max.SixSix;
import net.lvcy.card.entity.gate.mid.FiveFive;
import net.lvcy.card.entity.gate.mid.ThreeThree;
import net.lvcy.card.entity.gate.mid.TwoTwo;
import net.lvcy.card.entity.gate.min.FiveSix;
import net.lvcy.card.entity.gate.min.FourSix;
import net.lvcy.card.entity.gate.min.OneFive;
import net.lvcy.card.entity.gate.min.OneSix;
import net.lvcy.card.entity.hard.OneTwo;
import net.lvcy.card.entity.hard.TwoFour;
import net.lvcy.card.entity.number.FourFive;
import net.lvcy.card.entity.number.OneFour;
import net.lvcy.card.entity.number.ThreeFive;
import net.lvcy.card.entity.number.ThreeFour;
import net.lvcy.card.entity.number.TwoFive;
import net.lvcy.card.entity.number.TwoSix;
import net.lvcy.card.entity.number.TwoThree;
import net.lvcy.card.eumn.CardStatus;

public class CardPair extends ArrayList<Card> {


	private static final long serialVersionUID = 1L;
	private CardPair() {
		
	}
	public static CardPair getOnePairOfCard() throws Exception {
		
		CardPair cardPair = new CardPair();
		cardPair.addTypeOfCards(OneTwo.class);
		cardPair.addTypeOfCards(TwoFour.class);
		cardPair.addTypeOfCards(OneFive.class);
		cardPair.addTypeOfCards(OneSix.class);
		cardPair.addTypeOfCards(FourSix.class);
		cardPair.addTypeOfCards(FiveSix.class);
		cardPair.addTypeOfCards(TwoTwo.class);
		cardPair.addTypeOfCards(ThreeThree.class);
		cardPair.addTypeOfCards(FiveFive.class);
		cardPair.addTypeOfCards(OneThree.class);
		cardPair.addTypeOfCards(OneFour.class);
		cardPair.addTypeOfCards(TwoThree.class);
		cardPair.addTypeOfCards(FourFour.class);
		cardPair.addTypeOfCards(ThreeFour.class);
		cardPair.addTypeOfCards(TwoFive.class);
		cardPair.addTypeOfCards(OneOne.class);
		cardPair.addTypeOfCards(ThreeFive.class);
		cardPair.addTypeOfCards(TwoSix.class);
		cardPair.addTypeOfCards(SixSix.class);
		cardPair.addTypeOfCards(FourFive.class);
		cardPair.addTypeOfCards(FourFive.class);
		if(cardPair.size() != 84) {
			throw new Exception("length error");
		}
		return cardPair;
	}
	public Card getOneRadomCard() {
		Random random = new Random();
		int index = random.nextInt(this.size());
		Card card = this.get(index);
		this.remove(index);
		return card;
	}
	
	
	private void addTypeOfCards(Class<? extends Card> clazz) {
		for(int i = 0; i < 4; i++) {
			try {
				Card card = clazz.newInstance();
				card.setStatus(CardStatus.ACTIVE);
				this.add(card);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	
}
