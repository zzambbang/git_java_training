public class p169_AdvancedForExample {
//향상된 for문
// 향상된 for문은 반복 실행을 하기 위해 카운터 변수와 증감식을 사용하지 않는다.
// 배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나간다.
// 다음은 향상된 for문을 작성하는 형식과 실행 흐름을 보여준다.
// for문의 괄호()에는 배열에서 꺼낸 항목을 저장할 변수 선언과 콜론(:) 
// 그리고 배열을 나란히 작성한다. 
// for문이 처음 실행될 때 1배열에서 가져올 첫 번째 값이 존재하는지 평가한다. 가져올 값이 존재하면 해당 값을 2변수에 저장한다. 그리고 3실행문을 실행한다.

    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        for(int score : scores){
            sum = sum + score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
