package com.kita.first.baseball;

public class Checker {
	//S:0 / B:0 / O:0
	//�����ϸ�  false, �������̸� true
	public static boolean check(int gameCnt, Baseball bb, MyBall mb) {
		int s=0, b=0;
		for(int i=0; i<gameCnt; i++) {
			for(int z=0; z<gameCnt; z++) {
				if(bb.get(i) == mb.get(z)) {
					if(i==z) {
						s++;
					} else {
						b++;
					}
				}
			}
		}
		System.out.printf("S:%d, B:%d, O:%d", s, b, (gameCnt-s-b));
		return s != gameCnt;
	}
}
