package chap_01;

public class _05_variableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 (공백 사용 불가)
        // 3. 밑줄/문자로 시작 하능
        // 4. 한 단어/2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어 제외)
        // 6. 예약어 사용 불가 ( public, static, void, int ... )

//        입국 신고서
        String nationality = "Korea";
        String firstName = "Seungmin";
        String lastName = "Lee";
        String date_of_birth = "1994 - 08 - 09";
        String residential_address = "Home";
        String purpose_of_visit = "Traveling";
        String flightNo = "E2031";
        int accompany = 2;
        String Mem1 = "papa";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
