# 단위변환기 앱

<img src="https://github.com/Eddie-Pak/EX_ChangeUnitApp/assets/136288531/17de9ab4-3696-4f38-8f79-184aa5680111" width="300">

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

- 소수점이 정확하지 않은 이유를 찾아보고 수정해보기 (BigDecimal이라는 자료형을 사용하면 해결할 수 있음)
- Activity Lifecycle 을 충분히 공부해 보기
- 추후 단위를 선택하여 좀 더 다양한 단위들을 변경할 수 있게 만들어보기
  
