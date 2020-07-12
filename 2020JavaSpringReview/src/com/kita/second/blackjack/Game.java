package com.kita.second.blackjack;

public class Game {
	public static void main(String[] args) {
		/*
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		
		System.out.println("딜러 덱");
		dealer.openCards();
		System.out.println("게이머 덱");
		gamer.openCards();
		
		Rule.whoIsWin(gamer, dealer);
		*/
		
		CardDeck cd = new CardDeck();
		Card c = cd.getCard();
		
		Gamer gamer = new Gamer(); // 주소값 저장 안 하는 변수 8개 - 일반 변수
		Dealer dealer = new Dealer();
		
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		
		dealer.receiveCard(cd.getCard());
		Card card = cd.getCard();
		gamer.receiveCard(card);
		
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		
		
		gamer.openCards();
		
		Rule.whoIsWin(gamer, dealer);
		
		// 랜덤한 카드를 1장 리턴 and 카드덱에서 리턴한 카드 삭제
		/*
		System.out.println(c);
		System.out.println(cd);
		*/
	}
}
