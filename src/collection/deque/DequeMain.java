package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 이론적으로 `LinkedList`가 삽입 삭제가 자주 발생할 때 더 효율적일 수 있지만,
 * 현대 컴퓨터 시스템의 메모리 접근 패턴, CPU 캐시 최적화 등을 고려할 때 배열을 사용하는 `
 * ArrayDeque` 가 실제 사용 환경에서 더 나은 성능을 보여주는 경우가 많다.
 */
public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(); // 더 빠름
//        Deque<Integer> deque = new LinkedList<>();

        //데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        //데이터 꺼내기
        System.out.println("pollFirst = " + deque.pollFirst());
        System.out.println("pollFirst = " + deque.pollFirst());
        System.out.println("pollLast = " + deque.pollLast());
        System.out.println("pollLast = " + deque.pollLast());
        System.out.println(deque);
    }
}
