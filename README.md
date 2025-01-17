# java-lotto

로또 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
  
## 기능 요구 사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다. 
- 로또 1장의 가격은 1000원이다.

## 실행 결과
```
실행 결과
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```

## 로또(자동) 기능 구현 목록

### 입력
- [x] 로또 구입 금액을 입력 받는다.
  - [x] 입력 금액은 최소 1,000원 이어야 한다.
  - [x] 입력 금액은 최대 100,000원 이어야 한다.
  - [x] 입력 금액이 숫자이어야 한다.
  
- [x] 지난주 당첨 번호를 입력 받는다.
  - [x] 입력 받을 숫자를 ','로 구분한다.
  - [x] 입력 받은 숫자가 숫자이어야 한다.
  
- [x] 보너스 볼을 입력받는다.
  - [x] 보너스 볼은 숫자이어야 한다.
  - [x] 보너스 볼은 1이상 45이하 이어야 한다.
  - [x] 보너스 볼은 당첨번호와 중복이면 안된다.
  
### 출력
- [x] 구매한 로또를 출력한다.
  - [x] 구매한 로또는 정렬되어야 한다.
  - [x] 출력할 로또 숫자는 '[', ']' 안에 들어가야 한다.
  - [x] 출력할 로또 숫자는 ','로 구분한다.
- [x] 당첨 통계를 출력한다.
- [x] 로또를 구입한 개수를 안내한다.
- [x] 생성된 로또 숫자는 정렬되어야 한다.

### 돈
- [x] 돈은 0이상이어야 한다.
- [x] 돈은 당첨 금액의 합을 표현할 수 있어야 한다.
- [x] 총 수익률은 당첨 금액분의 구입금액이다.
  - [x] 총 수익률은 소숫점 3번째 자리를 버림한다.
- [x] 금액은 1000원 단위여야 한다.

### 로또 생성
- [x] 구매한 로또 개수 만큼 로또를 생성한다.
  - [x] 구매한 로또 개수는 1개 이상이어야 한다.
- [x] 6자리의 숫자로 로또를 생성한다.
  - [x] 로또 숫자는 6개이어야 한다.
  - [x] 생성된 로또 숫자는 중복이면 안된다.
  - [x] 로또 숫자는 1이상 45이하 이다.
  - [x] 로또 한장을 1000원에 구매한다.
  - [x] 최대 구입할 수 있는 개수 만큼 구입한다.
  
### 로또 당첨 확인
- [x] 내가 구매한 로또와 당첨번호를 비교한다.
  - [x] 당첨번호를 비교한다.
  - [x] 보너스 볼이 포함되어있는지 확인한다.
  - [x] 총 당첨 갯수를 확인한다.
  - [x] 당첨이 되면 금액을 고지한다.

  
## 로또(수동) 추가 기능 구현 목록

### 입력
- [x] 수동으로 구매할 수량을 입력받는다.
  - [x] 입력한 금액이 숫자인지 검증한다.
- [x] 수동으로 구매할 로또의 번호들을 입력받는다.

### 출력
- [x] 수동, 자동 로또의 수량을 출력한다.

### 로또 생성 
- [x] 수동으로 입력받은 로또와 남은 돈으로 로또를 생성한다.
  - [x] 현재 금액보다 많은 양의 수동 로또를 구매하는지 검증한다.
  - [x] 구매 개수가 한장 이상일 경우에 수동 로또를 생성한다.