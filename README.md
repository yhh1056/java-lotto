# java-lotto

로또 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)


# 요구사항

### 구입
- [x] 구입금액을 숫자로 입력받을 수 있다.
- [x] 구입 금액을 구매 장 수로 변환할 수 있다.
- [x] [Error] 천원 미만일 경우 예외를 발생시킨다.

### 로또 번호
- [x] 1 ~ 45까지의 번호만 존재한다.

### 자동 로또 머신
- [x] 중복되지 않는 6개의 수를 가진 로또를 반환할 수 있다.

### 당첨 로또
- [x] 당첨번호 6개와 보너스 볼을 저장할 수 있다.
- [x] [Error] 당첨번호와 보너스 볼이 중복될 경우 예외를 발생시킨다.
- [x] [Error] 당첨번호와 보너스 볼이 1 ~ 45가 아닌 경우 예외를 발생시킨다.
- [x] [Error] 당첨번호가 6개가 아닐 경우 예외를 발생시킨다.
- [x] 로또를 받아 일치 결과를 반환할 수 있다.

### 구매 로또(lotto)
- [x] [Error] 구매번호가 중복될 경우 예외를 발생시킨다.
- [x] [Error] 구매번호가 6개가 아닐 경우 예외를 발생시킨다.

### 구매 로또(lottos)
- [x] 로또 결과를 생성할 수 있다.
- [x] [Error] 구매로또가 빈 값으로는 생성될 수 없다.

### 등수(rank)
- [x] 등수의 당첨 금액을 계산하여 반환할 수 있다. 
- [x] 일치 결과를 받아 등수를 반환할 수 있다.

### 로또 결과(lotto result)
- [x] 수익률을 계산할 수 있다.
