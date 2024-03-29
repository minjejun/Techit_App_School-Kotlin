// 문제 3) 1부터 100까지의 홀수의 합을 출력하세요.

fun main() {
    // 총합 정의
    var sum = 0
    // for 문으로 1부터 100까지의 홀수들을 더해준 것을 총합으로 만듬.
    // 홀수들은 전 수보다 2씩 차이가 나기에 step 2를 이용해 홀수들을 더해줌.
    for ( i in 1..100 step 2) {
        sum += i
    }
    // 1부터 100까지의 총합 출력
    println("1부터 100까지의 홀수들의 총합은 ${sum}입니다.")
}