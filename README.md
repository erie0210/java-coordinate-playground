기능 요구사항

## 선길이
- 점 구현
  - 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
    - [x] 생성자에 parameter를 구성한다: int x, int y를 Point의 constructor로 사용
  - 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
    - [x] Point of()
  - X, Y좌표 모두 최대 24까지만 입력할 수 있다.
    - [x] 생성자에서 확인하고 예외처리
    - [x] 0보다 작아도 안된다
    - [] 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
  - 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
    - [] 특수문자의 종류
    - 어떻게 표시할지?
- 도형구현
  - 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
    - [x] 두 점인 경우 선으로 인식
    - [x] 세 점인 경우 삼각형으로 인식
    - [x] 네 점인 경우 사각형으로 인식
  - 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.
    - [x] Point getDistance() 
    