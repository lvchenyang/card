package net.lvcy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.lvcy.card.core.CardPair;
import net.lvcy.card.core.Person;
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

	public static void main(String[] args) throws Exception {
		
		CardPair cardPair = CardPair.getOnePairOfCard();
		Person person1 = new Person("ÂÀ³¿Ñô");
		Person person2 = new Person("ÂÀ½£");
		Person person3 = new Person("ÂÀÇ¿");
		person1.setNext(person2);
		person2.setNext(person3);
		person3.setNext(person1);
		for(int i = 0; i < 27; i++) {
			person1.addOneHandCard(cardPair.getOneRadomCard());
			person2.addOneHandCard(cardPair.getOneRadomCard());
			person3.addOneHandCard(cardPair.getOneRadomCard());
		}
		System.out.println(person1.getHandCardsSize());
		System.out.println(person2.getHandCardsSize());
		System.out.println(person3.getHandCardsSize());
		List<Card> cards = person1.playCards(15,15);
	}
}
