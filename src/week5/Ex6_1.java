package week5;

public class Ex6_1 {

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        System.out.println("(1) 공백 리스트에 노드 3개 삽압하기");
        L.insertLastNode("월");
        L.insertLastNode("수");
        L.insertLastNode("일");
        L.printList();

        System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
        ListNode pre = L.searchNode("수");
        if (pre == null)
            System.out.println("검색실패>>찾는 데이터가 없습니다.");
        else {
            L.insertMiddleNode(pre, "금");
            L.printList();
        }

        System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
        L.reverseList();
        L.printList();

        System.out.println("(4) 리스트의 마지막 노드 삭제하기");
        L.deleteLastNode();
        L.printList();

        System.out.println("(5) 무지개 리스트를 생성하기");
        //
        // 위 예제를 참고하여, insertLastNode 함수를 사용하여 아래 무지개 리스트를 생성하고 출력하기
        // L = (빨강, 주황, 노랑, 초록, 파랑, 남색, 보라)
        LinkedList rainbow = new LinkedList();
        rainbow.insertLastNode("빨강");
        rainbow.insertLastNode("주황");
        rainbow.insertLastNode("노랑");
        rainbow.insertLastNode("초록");
        rainbow.insertLastNode("파랑");
        rainbow.insertLastNode("남색");
        rainbow.insertLastNode("보라");
        rainbow.printList();
        
        //

        System.out.println("(6) 무지개 리스트의 색깔 순서틀 바꾸기");
        //
        // 무지개 리스트의 색깔을 아래와 같은 순서로 바꾸고 출력하기
        // L = (노랑, 주황, 초록, 남색, 파랑, 보라, 빨강)를 연결리스트로 만들고 출력하기
        rainbow.reverseList();
        rainbow.printList();
        
    }
}