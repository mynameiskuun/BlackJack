
# 블랙잭 게임 구현 - OOP 연습

> ref : https://jojoldu.tistory.com/62 

## 구현 명세

* 딜러와 게이머 단 2명만 존재한다.
* 카드는 조커를 제외한 52장이다. (즉, 카드는 다이아몬드,하트,스페이드,클럽 무늬를 가진 A,2~10,K,Q,J 으로 이루어져있다.)
* 2~10은 숫자 그대로 점수를, K/Q/J는 10점으로, A는 1로 계산한다. (기존 규칙은 A는 1과 11 둘다 가능하지만 여기선 1만 허용하도록 스펙아웃)
* 딜러와 게이머는 순차적으로 카드를 하나씩 뽑아 각자 2개의 카드를 소지한다.
* 게이머는 얼마든지 카드를 추가로 뽑을 수 있다.
* 딜러는 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 추가할 수 없다.
* 양쪽다 추가 뽑기 없이, 카드를 오픈하면 딜러와 게이머 중 소유한 카드의 합이 21에 가장 가까운 쪽이 승리한다.
* 단 21을 초과하면 초과한 쪽이 진다.

## 주요 객체

* 게임
  * 게임 시작
  * 종료
* 카드
* 카드 덱
  * 카드 셔플
  * 카드 끗수 정의
* 규칙
  * burst(21점 이상) 판단
  * 카드 합계 점수 계산
  * 승자 판단
* 딜러
  * 카드 뽑기
* 유저
  * 카드 뽑기
  * stay(카드 뽑기 중지)

## 설계원칙

* 클래스 우선이 아닌, 객체의 속성과 행위가 우선이다.
  * 클래스는 객체를 추상화하는 도구일 뿐이다.
* 데이터가 아닌 메세지(행위)를 중심으로 객체를 설계해라.
  * 객체는 혼자 있을 수 없다. 다른 객체와의 협력 안에서만 존재할 수 있다.
  * 메세지를 중심으로, 해당 메세지가 어떤 객체를 필요로 하는지를 생각하자.
* 하나하나 지시하지 말고 요청해라.
  * 예를들어, 판사가 증인에게 1) 목격했던 장면을 떠올리고, 2) 떠오르는 시간을 순서대로 구성하고, 3) 말로 간결하게 표현해라 라고 요청하지 않는다. 그냥 "증언하라" 라고 요청한다.
  * 마찬가지로 객체의 설계단계에서도 책임이 있는 객체에 요청만 하도록 설계한다.
* 하나의 메소드는 하나의 일만 해야한다.
* 처음부터 완벽한 설계는 없다.
  * 설계를 코드로 구현해가는 과정에서 수정이 필요하다면 설계를 수정한다.