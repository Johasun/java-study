
import java.util.Scanner;


public class Cinema {
    // 좌석
    private String[][] seat;
    // 예매번호
    private int reservationNumber;

    private Scanner scanner;

    public Cinema() {
        this(4, 5);
    }

    public Cinema(int row, int col) {
        reservationNumber = 10000000;
        scanner = new Scanner(System.in);
        seat = new String[row][col];
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                seat[i][j] = "__";
            }
        }
    }

    /******************** 고객 메뉴 선택 메서드 *******************/
    /**
     * 영화 예매 시스템 메뉴 출력
     * 
     * @return
     * @author 안승주
     */
    private int menu() {
        System.out.println("******************************");
        System.out.println("*********영화 예매 시스템**********");
        System.out.println("******************************");
        System.out.println("1. 예매하기");
        System.out.println();
        System.out.println("2. 예매조회");
        System.out.println();
        System.out.println("3. 예매취소");
        System.out.println();

        int choiceNum = 0;

        do {
            choiceNum = scanner.nextInt();
            scanner.nextLine();
        } while (choiceNum > 3 || choiceNum < 1);

        return choiceNum;
    }

    /**
     * 예매 가능 메시지 출력
     * 
     * @return
     * @author 문형철
     */
    private int menuChoice() {
        int menu = 0;
        System.out.println("예매 가능합니다. 예매하시겠습니까?");
        do {
            System.out.println("네(1), 아니오(2), 초기화면(0)중 하나를 입력해주세요.");
            menu = scanner.nextInt();
            scanner.nextLine();
        } while (menu < 0 || menu > 2);
        return menu;
    }

    /*******************************************************/

    /**
     * 예매 프로그램 시작
     * 
     * @author 문형철
     */
    public void ticketing() {

        do {
            int menu = menu();

            if (menu == 1) {
                // 예매하기
                booking();
            } else if (menu == 2) {
                // 예매조회
                checkSystem();
            } else if (menu == 3) {
                // 예매취소
                cancel();
            } else {
                System.out.println("프로그램을 종료합니다.");
                scanner.close();
                break;
            }
        } while (true);

    }
    
    private boolean isNullOrEmpty(String str) {
        boolean isNull = false;

        if (str == null || str.equals("")) {
            isNull = true;
        }
        return isNull;
    }

    /**
     * 
     * @author 문형철, 하준수, 안승주
     */
    private void booking() {

        // 좌석현황
        seatSee();

        System.out.println("좌석을 선택해주세요. 예)1-1");
        System.out.println("이미 예약된 좌석은 \"예매\"라고 표시됩니다.");

        String strSeatChoice = scanner.nextLine();

//        // TODO : 정수와 '-'만 남긴다
//        if(strSeatChoice.matches("([0-9]*)+\\-([0-9]*)")) {
//            System.out.println("잘못된 형식입니다. 다시 입력해주세요");
//            booking();
//            return;
//        }

        // String형식 번호 -> 정수형태로 변환
        String rowString = "";
        String colString = "";

        // 앞 숫자인지 뒷숫자인지 판별하기 위한 변수
        // true -> rowString 정수를 문자열로 담는다.
        // false -> colString 정수를 문자열로 담는다.
        boolean pass = true;

        for (int i = 0; i < strSeatChoice.length(); i++) {
            char c = strSeatChoice.charAt(i);
            // '-' 이 전에 있는 정수는 rowString에 담는다
            // '-' 이 후에 있는 정수는 colString에 담는다
            if (c == '-') {
                pass = false;
                continue;
            }

            // 숫자를 이어 붙인다
            if (pass) {
                rowString = "" + c;
            }

            // 다른변수 숫자를 이어 붙인다
            if (!pass) {
                colString = "" + c;
            }
        }

        if (isNullOrEmpty(rowString) || isNullOrEmpty(colString)) {
            System.out.println("잘못된 형식입니다. 다시 입력해주세요");
            booking();
            return;
        }

        int rowNumber = Integer.parseInt(rowString) - 1;
        int colNumber = Integer.parseInt(colString) - 1;

        // 좌석배열의 크기를 넘는 경우
        if (rowNumber < 0 || rowNumber > seat.length || colNumber < 0 || colNumber > seat[rowNumber].length) {
            System.out.println("없는 좌석입니다. 다시 선택해주세요.");
            booking();
            return;
        }

        // 빈 좌석일 경우
        if (seat[rowNumber][colNumber].equals("__")) {

            switch (menuChoice()) {
            case 1:
                checkalarm(rowNumber, colNumber);
                break;
            case 2:
                booking();
                return;
            case 0:
                ticketing();
                return;
            }

        }
        // 이미 예약된 좌석일 경우
        else {
            System.out.println("이미 예약된 좌석입니다.");
            booking();
            return;
        }

    }

    /**
     * 
     * @param row
     * @param col
     * @author 안승주
     */
    private void checkalarm(int row, int col) {
        reservationNumber++;
        seat[row][col] = "" + reservationNumber;
        System.out.println("예매가 완료되었습니다.");
        System.out.println("예매한 좌석번호:[" + (row + 1) + "-" + (col + 1) + "]/ " + "예매번호:[" + reservationNumber + "]");
        System.out.println("감사합니다.");
    }

    /**
     * 
     * @author 조하선
     */
    private void checkSystem() {
        // 예매번호 조회
        System.out.println("예매번호를 입력해주세요");
        String serialNumber = scanner.nextLine();

        // 예매번호가 일치하는 것이 없는 경우
        for (int row = 0; row < seat.length; row++) {
            for (int col = 0; col < seat[row].length; col++) {

                if (seat[row][col].equals(serialNumber)) { // 예매한 좌석 출력
                    System.out.printf("고객님이 예매하신 좌석은 %d-%d 입니다.\n", row + 1, col + 1);
                    return;
                } // if end

                if (row == seat.length - 1 && col == seat[seat.length - 1].length - 1) {

                    int userNumber = 0;
                    do {
                        System.out.println("예매번호가 올바르지 않습니다.");
                        System.out.println("다시 입력하시겠습니까? 네(1), 아니오(2) 중 하나를 입력해주세요.");
                        userNumber = scanner.nextInt();
                        scanner.nextLine();
                    } while (userNumber < 1 || userNumber > 2);

                    if (userNumber == 1) {
                        checkSystem();
                    } else if (userNumber == 2) {
                        ticketing();
                    }
                    return;

                } // if end

            } // j for end

        } // i for end

    }

    /**
     * @author 하준수
     */
    private void seatSee() {

        System.out.println("***********좌석 현황************");
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                String strSeat = "[" + (i + 1) + "-" + (j + 1) + "]";
                System.out.print((seat[i][j].equals("__")) ? strSeat : "[예매]");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

    }

    /**
     * @author 김진아
     */
    // 메소드
    private void cancel() {
 
        System.out.println("예약번호를 입력해주세요");

        int userNumber1 = scanner.nextInt();
        scanner.nextLine();

        for (int row = 0; row < seat.length; row++) {
            for (int col = 0; col < seat[row].length; col++) {

                if (seat[row][col].equals(String.valueOf(userNumber1))) { // 예매한 좌석 출력

                    // 좌석과 예약 번호 연결 필요
                    System.out.println("고객님이 예약하신 좌석은 " + (row + 1) + "-" + (col + 1) + " 입니다.");

                    do {
                        System.out.println("예매를 취소하시겠습니까?");
                        System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
                        userNumber1 = scanner.nextInt();
                        scanner.nextLine();
                    } while (userNumber1 < 1 || userNumber1 > 2);

                    switch (userNumber1) {
                    case 1:
                        seat[row][col] = "__";
                        System.out.println("예매가 취소되었습니다. 감사합니다.");
                        break;

                    case 2:
                        // 초기화면으로
                        break;
                    }

                    return;
                } // if end

                if (row == seat.length - 1 && col == seat[seat.length - 1].length - 1) {

                    int userNumber = 0;
                    do {
                        System.out.println("예매번호가 올바르지 않습니다.");
                        System.out.println("다시 입력하시겠습니까? 네(1), 아니오(2) 중 하나를 입력해주세요.");
                        userNumber = scanner.nextInt();
                        scanner.nextLine();
                    } while (userNumber < 1 || userNumber > 2);

                    if (userNumber == 1) {
                        cancel();
                    } else if (userNumber == 2) {
                        ticketing();
                    }
                    return;
                } // if end

            } // j for end

        } // i for end
    }
}
