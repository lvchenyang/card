package net.lvcy.card.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import net.lvcy.card.entity.Card;

public class Person {

	private String name;
	private Person next;
	private List<Card> handCards;
	private List<Card> successCards;
	private final Lock getCardLock = new ReentrantLock();
	public Person(String name) {
		this.name = name;
		this.handCards = new Vector<Card>();
		this.successCards = new Vector<Card>();
	}
	public Person getNext() {
		return next;
	}
	public void setNext(Person next) {
		this.next = next;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void init() {
		this.handCards.clear();
		this.successCards.clear();
	}
	public void addOneHandCard(Card card) {
		this.handCards.add(card);
	}
	
	public List<Card> playCards(int...codes) {
		List<Card> cardList = new Vector<Card>();
		for(int i = 0; i < codes.length; i++) {
			Card card = getCardByCode(codes[i]);
			if(card != null) {
				cardList.add(card);
			}
		}
		System.out.println(cardList.size());
		return cardList;
	}
	
	public int getHandCardsSize() {
		return this.handCards.size();
	}
	private Card getCardByCode(int code) {
		
		Card card = null;
		int index = -1;
		for(int i = 0; i < this.handCards.size(); i++) {
			if(handCards.get(i).equal(code)){
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			card = this.handCards.get(index);
			this.handCards.remove(index);
			this.handCards.size();
		}
		
		return card;
	}
	
}
