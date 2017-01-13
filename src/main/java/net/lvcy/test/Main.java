package net.lvcy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.lvcy.card.entity.Card;
import net.lvcy.card.entity.gate.MaxCard;
import net.lvcy.card.entity.gate.MidCard;
import net.lvcy.card.entity.gate.MinCard;
import net.lvcy.card.entity.gate.max.FourFour;
import net.lvcy.card.entity.gate.max.OneOne;
import net.lvcy.card.entity.gate.max.OneThree;
import net.lvcy.card.entity.gate.max.SixSix;
import net.lvcy.card.entity.gate.mid.FiveFive;
import net.lvcy.card.entity.gate.mid.ThreeThree;
import net.lvcy.card.entity.gate.mid.TwoTwo;
import net.lvcy.card.entity.gate.min.FiveSix;
import net.lvcy.card.entity.gate.min.OneFive;
import net.lvcy.card.entity.gate.min.OneSix;
import net.lvcy.card.entity.hard.HardCard;
import net.lvcy.card.entity.hard.OneTwo;
import net.lvcy.card.entity.hard.TwoFour;
import net.lvcy.card.entity.number.FourFive;
import net.lvcy.card.entity.number.OneFour;
import net.lvcy.card.entity.number.ThreeFive;
import net.lvcy.card.entity.number.ThreeFour;
import net.lvcy.card.entity.number.ThreeSix;
import net.lvcy.card.entity.number.TwoFive;
import net.lvcy.card.entity.number.TwoThree;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		List<Card> cards = new ArrayList<Card>();
		
		cards.addAll(generateCards(OneTwo.class));
		cards.addAll(generateCards(TwoFour.class));
		cards.addAll(generateCards(OneFive.class));
		cards.addAll(generateCards(OneSix.class));
		cards.addAll(generateCards(FiveSix.class));
		cards.addAll(generateCards(FiveSix.class));
		cards.addAll(generateCards(TwoTwo.class));
		cards.addAll(generateCards(ThreeThree.class));
		cards.addAll(generateCards(FiveFive.class));
		cards.addAll(generateCards(OneThree.class));
		cards.addAll(generateCards(FourFour.class));
		cards.addAll(generateCards(OneOne.class));
		cards.addAll(generateCards(SixSix.class));
		cards.addAll(generateCards(OneFour.class));
		cards.addAll(generateCards(TwoThree.class));
		cards.addAll(generateCards(TwoFive.class));
		cards.addAll(generateCards(ThreeFour.class));
		cards.addAll(generateCards(ThreeFive.class));
		cards.addAll(generateCards(ThreeFive.class));
		cards.addAll(generateCards(FourFive.class));
		cards.addAll(generateCards(ThreeSix.class));
		
		System.out.println(cards.size());
		
		List<Card> myCards = new ArrayList<Card>();
		for(int i = 0; i < 27; i++) {
			Random random = new Random();
			int index = (int)random.nextInt(cards.size());
			myCards.add(cards.get(index));
			cards.remove(index);
		}
		System.out.println(myCards.size());
		for(int i = 0; i < myCards.size(); i++) {
			System.out.println(myCards.get(i).toString());
		}
		
		
		List<HardCard> hardCards = new ArrayList<HardCard>();
		
		List<MinCard> minCards = new ArrayList<MinCard>();
		
		List<MidCard> midCards = new ArrayList<MidCard>();
		
		List<MaxCard> maxCards = new ArrayList<MaxCard>();
		
	}
	public static List<Card> generateCards(Class<? extends Card> clazz) throws InstantiationException, IllegalAccessException {
		List<Card> cards = new ArrayList<Card>();
		for(int i = 0; i < 4; i++) {
			cards.add(clazz.newInstance());
		}
		return cards;
	}
}
