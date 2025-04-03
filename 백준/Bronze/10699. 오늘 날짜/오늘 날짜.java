import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        // 서버의 현재 시간을 UTC 기준으로 가져옵니다.
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));

        // UTC 시간을 서울 시간(Asia/Seoul)으로 변환합니다.
        ZonedDateTime seoulNow = utcNow.withZoneSameInstant(ZoneId.of("Asia/Seoul"));

        // 서울의 날짜 부분만 추출합니다.
        LocalDate seoulDate = seoulNow.toLocalDate();

        // "YYYY-MM-DD" 형식으로 포맷 후 출력합니다.
        System.out.println(seoulDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }


}

