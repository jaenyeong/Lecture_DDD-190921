<<<<<<< HEAD
- 간단한 포켓몬 게임을 구현한다.
- 트레이너
    - [] 사용자는 트레이너라고 부른다.
    - [] 트레이너는 아이디를 등록할 수 있고 등록한 아이디로 로그인할 수 있어야 한다.
    - [] 트레이너는 레벨을 가지고 있으며 포켓몬을 잡을 때마다 레벨이 1씩 증가한다.
    - [] 레벨은 30까지 증가한다.
    - [] 최초 로그인 시 이상해씨, 파이리, 꼬부기 중 한 마리를 선택할 수 있다.
    - [] 가지고 있는 포켓몬 목록을 볼 수 있다.
    - [] 가지고 있는 아이템 목록을 볼 수 있다.
- 포켓몬
    - [] 전국 도감 번호 1번부터 151번까지의 포켓몬이 무작위로 등장한다.
    - [] 포켓몬은 고유의 포획률을 가지고 있다.
    - [] 트레이너는 가지고 있는 몬스터볼을 소비함으로써 포켓몬을 잡을 수 있다.
    - [] 포획률 = (포켓몬의 포획률 * 몬스터볼 보정 승수 * (레벨 11 이상의 트레이너 레벨 / 10)) * 100 / 255
    - [] 잡은 포켓몬은 닉네임을 지어 붙일 수 있다.
- 아이템
    - [] 몬스터볼은 고유의 보정 승수를 가지고 있다.
    - [] (몬스터볼: 1.0, 수퍼볼: 1.5, 하이퍼볼: 2.0, 마스터볼: 255)

## 용어사전

| 한글명 | 영문명 | 설명 | 
| -- | -- | -- |
=======
## 요구 사항

- 간단한 포켓몬 게임을 구현한다.
- 트레이너
    - [ ]  사용자는 트레이너라고 부른다.
    - [ ]  트레이너는 아이디를 등록할 수 있고 등록한 아이디로 로그인할 수 있어야 한다.
    - [ ]  트레이너는 레벨을 가지고 있으며 포켓몬을 잡을 때마다 레벨이 1씩 증가한다.
    - [ ]  레벨은 30까지 증가한다.
    - [ ]  최초 로그인 시 이상해씨, 파이리, 꼬부기 중 한 마리를 선택할 수 있다.
    - [ ]  가지고 있는 포켓몬 목록을 볼 수 있다.
    - [ ]  가지고 있는 아이템 목록을 볼 수 있다.
- 포켓몬
    - [ ]  전국 도감 번호 1번부터 151번까지의 포켓몬이 무작위로 등장한다.
    - [ ]  포켓몬은 고유의 포획률을 가지고 있다.
    - [ ]  트레이너는 가지고 있는 몬스터볼을 소비함으로써 포켓몬을 잡을 수 있다.
    - [ ]  포획률 = (포켓몬의 포획률 * 몬스터볼 보정 승수 * (레벨 11 이상의 트레이너 레벨 / 10)) * 100 / 255
    - [ ]  잡은 포켓몬은 닉네임을 지어 붙일 수 있다.
- 아이템
    - [ ]  몬스터볼은 고유의 보정 승수를 가지고 있다.
    (몬스터볼: 1.0, 수퍼볼: 1.5, 하이퍼볼: 2.0, 마스터볼: 255)

## 용어 사전

| 한글명 | 영문명 | 설명  |
| --- | --- | --- |
>>>>>>> 632e14f84c85ec66106863820f59b5dbbd582e83
| 포켓몬 | Pokemon | 몬스터볼에 넣어서 주머니에 간편하게 휴대하고 다닐 수 있는 몬스터를 뜻한다. |
| 몬스터볼 | Poke ball | 포켓몬을 포획하고 운반할 때 사용되는 도구 |
| 트레이너 | Trainer | 사용자, 포켓몬을 몬스터볼로 잡을 수 있다. (아이디, 레벨, 잡은 포켓몬) |
| 잡은 포켓몬 | Pokemon caught | 닉네임을 가질 수가 있다. |
<<<<<<< HEAD
| 전국 도감 | National Pokedex | 포켓몬스터에 등장하는 모든 포켓몬의 정보가 담겨있는 도감이다. |  
=======
| 전국 도감 | National Pokedex | 포켓몬스터에 등장하는 모든 포켓몬의 정보가 담겨있는 도감이다. |
>>>>>>> 632e14f84c85ec66106863820f59b5dbbd582e83
| 포획률 | Capture rate | 야생 포켓몬에게 몬스터볼을 던졌을 때, 그 포켓몬을 잡을 확률에 영향을 주는 수치이다. 모든 포켓몬은 3부터 255사이의 포획률이 정해져 있으며, 이 포획률이 낮을수록 잡기 어렵고, 높을수록 잡기 쉬워진다. |

## 모델링

<<<<<<< HEAD
- `Trainer`는 아이디를 가진다.
- `Trainer`는 레벨을 가지며 레벨의 범위는 1부터 30까지이다.
- `Trainer`는 가지고 있는 `Pokemon caught`을 볼 수 있다.
- `Trainer`는 아이템 목록을 볼 수 있다.
- `Trainer`는 가지고 있는 `Poke ball`의 소비를 통해서 `Pokemon`을 잡을 수 있다.
- `Trainer`는 최초 로그인시 이상해씨, 파이리, 꼬부기 중 한마리를 선택할 수 있다. 

- `Pokemon`은 이름과 `National Pokedex Number`와 `Capture rate`를 가진다.

- `National Pokedex Number`은 1부터 151까지 존재한다.
- 계산된 포획률이 `Pokemon`의 `Capture rate` 보다 높을 때 잡힐 수 있다.
    - 계산된 포획률이 `Pokemon`의 `Capture rate` 보다 높을 때 `Pokemon caught`이 된다.
- `Pokemon caught`은 닉네임을 가질 수 있다.

=======
>>>>>>> 632e14f84c85ec66106863820f59b5dbbd582e83
