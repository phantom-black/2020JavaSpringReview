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
		
		System.out.println("���� ��");
		dealer.openCards();
		System.out.println("���̸� ��");
		gamer.openCards();
		
		Rule.whoIsWin(gamer, dealer);
		*/
		
		CardDeck cd = new CardDeck();
		Card c = cd.getCard();
		
		Gamer gamer = new Gamer(); // �ּҰ� ���� �� �ϴ� ���� 8�� - �Ϲ� ����
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
		
		// ������ ī�带 1�� ���� and ī�嵦���� ������ ī�� ����
		/*
		System.out.println(c);
		System.out.println(cd);
		*/
	}
}
