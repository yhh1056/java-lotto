# java-lotto

로또 미션 진행을 위한 저장소

1. 로또 구매
    - [x] 사용자 입력 : 구입 금액
        - 최대 구입 가능 금액은 100만원으로 한정
        - 발생 가능한 예외 사항
            - [x] null 입력된 경우
            - [x] 숫자가 아닌 경우
            - [x] 1000원 이하의 금액이 입력된 경우
            - [x] 100만원 초과의 금액이 입력된 경우
            - [x] 1000원 단위의 금액이 입력되지 않은 경우
    - [x] 구입한 로또 개수 출력
    - [x] 사용자가 구입한 로또 티켓 번호 생성
        - 로또 번호는 1 ~ 45
            - [x] 번호 오름차순 정렬
        - 발생 가능한 예외 사항
            - [x] 한 로또 티켓에 중복된 번호가 있는 경우
            - [x] 한 로또 티켓의 사이즈가 6이 아닌 경우
            - [x] 로또 번호 범위를 벗어나는 숫자가 생길 경우
    - [x] 사용자가 구입한 로또 티켓 번호 출력

2. 당첨 번호 및 보너스 입력
    - [x] 사용자 입력 : 지난 주 당첨 번호
    - [x] 사용자 입력 : 보너스 번호
        - 로또 번호는 1 ~ 45
            - [x] 번호 오름차순 정렬
        - 발생 가능한 예외 사항
            - [x] null 입력된 경우
            - [x] 숫자가 아닌 경우
            - [x] 로또 번호가 부족한 경우 (당첨 번호 6 개, 보너스 번호 1 개)
            - [x] 중복된 번호가 있는 경우
            - [x] 로또 번호 범위를 벗어난 숫자인 경우

3. 당첨 통계 및 총 수익률 출력
    - [x] 당첨 통계 title 출력
    - [x] 당첨 금액별 로또 개수 출력
        1. 보너스 번호를 제외한 일치 개수 계산
        2. 5 개 일치할 경우, 보너스 번호 일치 여부 확인
    - [x] 총 수익률 계산
    - [x] 총 수익률 출력

## 추가 리팩토링

- [x] enum 적용할 객체 정하기 (ex: 로또 숫자, 당첨 통계 부분)
- [x] 숫자를 나눌 delimiter(,) 와 trim() 처리
- [x] 사용자로부터 받은 번호가 정렬되지 않은 경우
- [x] null이 아닌 enter가 입력된 경우 예외처리
- [ ] 로또 티켓 가격이 바뀔 경우
- [ ] Price의 역할 분리 고려
- [ ] 가격 integer 최댓값 넘어가는 오버플로우 상황 고려