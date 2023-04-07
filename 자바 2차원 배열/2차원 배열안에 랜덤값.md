
 4x4 크기의 2차원 배열을 생성하고, 그 안에 1~10 범위의 랜덤한 정수 값을 저장하는 코드입니다. 이를 위해서 java.util.Random 라이브러리를 사용해 랜덤한 값을 생성하고,
이를 이용해 배열의 모든 요소에 값을 저장합니다.
그 후, 이를 출력하기 위해서 중첩된 for 루프를 사용하여 배열의 모든 요소를 출력합니다. 각각의 행의 요소들은 공백을 이용해 구분하고,
다음 행으로 넘어갈 때는 System.out.println() 메서드를 이용합니다.
즉, 아래 코드는 다차원 배열과 랜덤 값을 생성하는 방법, 그리고 중첩된 for 루프를 이용한 출력 방법을 보여주는 코드입니다.

```java
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[4][4]; // 4x4 배열 생성
        Random random = new Random(); // 랜덤 객체 생성
        // 배열에 1~10 범위의 랜덤한 정수 저장
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10) + 1;
            }
        }
        // 배열 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
