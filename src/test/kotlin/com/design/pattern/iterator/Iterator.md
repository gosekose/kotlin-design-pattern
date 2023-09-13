# Iterator 패턴

- Iterator(반복자)
    - 요소를 순서대로 검색하는 인터페이스(API)를 결정
    - Iterator 인터페이스가 이 역할을 맡아서 다음 요소가 존재하는지 검사하는 hasNext(), next() 함수를 결정
- ConcreteIterator(구체적인 반복자)
    - Iterator가 결정한 인터페이스를 실제로 구현
    - 검색에 필요한 정보를 가지고 있어야 함
- Aggregate(집합체)
    - 내가 가진 요소를 차례대로 검색해주는 사람을 만들어내는 함수
    - Iterable 인터페이스가 이 역할을 담당
- ConcreteAggregate(구체적인 집합체)
    - 실제로 구현

- iterator 패턴을 적용함으로써 집합체에 배열 -> 리스트 등으로 변경하더라도 동일한 이터레이터를 적용할 수 있음