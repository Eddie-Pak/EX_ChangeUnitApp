# 개요

- 입력, 출력 단위를 선택할 수 있음
- 입력 ↔ 출력 단위를 반대로 변경할 수 있음
- 입력창에 값을 입력하면 바로 결과창에 단위가 변환된 값이 노출

### 구현기능

- cm 를 m 로 변환
- 값을 입력하면, 바로 변환된 값이 노출
    - 입력값은 자연수로 한정
- 단위를 반대로 변경
- 단위 변환 연산
    - cm → m (X 0.01)
    - m → cm (X 100)

---

# 학습 목표

- 간단한 기능을 구현하고, UI 를 그릴 수 있다 (2)
    - ConstraintLayout 을 이용하여 간단한 UI 를 그릴 수 있다.
    - 키보드로 사용자가 입력한 값을 받을 수 있다.
    - 사용자의 입력값이 변경되면, 바로 변환된 값을 보여줄 수 있다.
    - 방향이 변경됐을때, 값을 유지하는 방법
- UI
    - [ConstraintLayout](https://developer.android.com/training/constraint-layout?hl=ko)
    - EditText
- Android
    - [ViewBinding](https://developer.android.com/topic/libraries/view-binding)
    - [ActivityLifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)
    - [onSaveInstanceState](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=ko#save-simple,-lightweight-ui-state-using-onsaveinstancestate)
   
# 한 걸음 더

1. 소수점이 정확하지 않은 이유는?
    - Java 에서는 실수를 표현할 때는 부동 소수점 방식을 사용 하는데 이 때, 오차가 생길 수 있다. 근사값을 이용하기 때문이다. 부정확성을 해결하기 위해, BigDecimal 이라는 자료형을 사용하면 된다.
        - 상세한 이유는 이해하지 못하더라도, 소수점이 정확하지 않을 수 있다는 점을 인지하고, 정확한 계산을 필요로 할 때는 다른 자료형을 사용하면 됨
        - https://ko.wikipedia.org/wiki/%EB%B6%80%EB%8F%99%EC%86%8C%EC%88%98%EC%A0%90
2. Activity Lifecycle를 숙지하여 적절한 코드작성 공부하기
3. 다양한 UnitButton을 통해 더 많은 변환구조 만들어 보기
