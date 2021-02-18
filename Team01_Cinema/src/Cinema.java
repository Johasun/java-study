
import java.util.Scanner;


public class Cinema {
    // �¼�
    private String[][] seat;
    // ���Ź�ȣ
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

    /******************** �� �޴� ���� �޼��� *******************/
    /**
     * ��ȭ ���� �ý��� �޴� ���
     * 
     * @return
     * @author �Ƚ���
     */
    private int menu() {
        System.out.println("******************************");
        System.out.println("*********��ȭ ���� �ý���**********");
        System.out.println("******************************");
        System.out.println("1. �����ϱ�");
        System.out.println();
        System.out.println("2. ������ȸ");
        System.out.println();
        System.out.println("3. �������");
        System.out.println();

        int choiceNum = 0;

        do {
            choiceNum = scanner.nextInt();
            scanner.nextLine();
        } while (choiceNum > 3 || choiceNum < 1);

        return choiceNum;
    }

    /**
     * ���� ���� �޽��� ���
     * 
     * @return
     * @author ����ö
     */
    private int menuChoice() {
        int menu = 0;
        System.out.println("���� �����մϴ�. �����Ͻðڽ��ϱ�?");
        do {
            System.out.println("��(1), �ƴϿ�(2), �ʱ�ȭ��(0)�� �ϳ��� �Է����ּ���.");
            menu = scanner.nextInt();
            scanner.nextLine();
        } while (menu < 0 || menu > 2);
        return menu;
    }

    /*******************************************************/

    /**
     * ���� ���α׷� ����
     * 
     * @author ����ö
     */
    public void ticketing() {

        do {
            int menu = menu();

            if (menu == 1) {
                // �����ϱ�
                booking();
            } else if (menu == 2) {
                // ������ȸ
                checkSystem();
            } else if (menu == 3) {
                // �������
                cancel();
            } else {
                System.out.println("���α׷��� �����մϴ�.");
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
     * @author ����ö, ���ؼ�, �Ƚ���
     */
    private void booking() {

        // �¼���Ȳ
        seatSee();

        System.out.println("�¼��� �������ּ���. ��)1-1");
        System.out.println("�̹� ����� �¼��� \"����\"��� ǥ�õ˴ϴ�.");

        String strSeatChoice = scanner.nextLine();

//        // TODO : ������ '-'�� �����
//        if(strSeatChoice.matches("([0-9]*)+\\-([0-9]*)")) {
//            System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
//            booking();
//            return;
//        }

        // String���� ��ȣ -> �������·� ��ȯ
        String rowString = "";
        String colString = "";

        // �� �������� �޼������� �Ǻ��ϱ� ���� ����
        // true -> rowString ������ ���ڿ��� ��´�.
        // false -> colString ������ ���ڿ��� ��´�.
        boolean pass = true;

        for (int i = 0; i < strSeatChoice.length(); i++) {
            char c = strSeatChoice.charAt(i);
            // '-' �� ���� �ִ� ������ rowString�� ��´�
            // '-' �� �Ŀ� �ִ� ������ colString�� ��´�
            if (c == '-') {
                pass = false;
                continue;
            }

            // ���ڸ� �̾� ���δ�
            if (pass) {
                rowString = "" + c;
            }

            // �ٸ����� ���ڸ� �̾� ���δ�
            if (!pass) {
                colString = "" + c;
            }
        }

        if (isNullOrEmpty(rowString) || isNullOrEmpty(colString)) {
            System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
            booking();
            return;
        }

        int rowNumber = Integer.parseInt(rowString) - 1;
        int colNumber = Integer.parseInt(colString) - 1;

        // �¼��迭�� ũ�⸦ �Ѵ� ���
        if (rowNumber < 0 || rowNumber > seat.length || colNumber < 0 || colNumber > seat[rowNumber].length) {
            System.out.println("���� �¼��Դϴ�. �ٽ� �������ּ���.");
            booking();
            return;
        }

        // �� �¼��� ���
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
        // �̹� ����� �¼��� ���
        else {
            System.out.println("�̹� ����� �¼��Դϴ�.");
            booking();
            return;
        }

    }

    /**
     * 
     * @param row
     * @param col
     * @author �Ƚ���
     */
    private void checkalarm(int row, int col) {
        reservationNumber++;
        seat[row][col] = "" + reservationNumber;
        System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
        System.out.println("������ �¼���ȣ:[" + (row + 1) + "-" + (col + 1) + "]/ " + "���Ź�ȣ:[" + reservationNumber + "]");
        System.out.println("�����մϴ�.");
    }

    /**
     * 
     * @author ���ϼ�
     */
    private void checkSystem() {
        // ���Ź�ȣ ��ȸ
        System.out.println("���Ź�ȣ�� �Է����ּ���");
        String serialNumber = scanner.nextLine();

        // ���Ź�ȣ�� ��ġ�ϴ� ���� ���� ���
        for (int row = 0; row < seat.length; row++) {
            for (int col = 0; col < seat[row].length; col++) {

                if (seat[row][col].equals(serialNumber)) { // ������ �¼� ���
                    System.out.printf("������ �����Ͻ� �¼��� %d-%d �Դϴ�.\n", row + 1, col + 1);
                    return;
                } // if end

                if (row == seat.length - 1 && col == seat[seat.length - 1].length - 1) {

                    int userNumber = 0;
                    do {
                        System.out.println("���Ź�ȣ�� �ùٸ��� �ʽ��ϴ�.");
                        System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�? ��(1), �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
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
     * @author ���ؼ�
     */
    private void seatSee() {

        System.out.println("***********�¼� ��Ȳ************");
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                String strSeat = "[" + (i + 1) + "-" + (j + 1) + "]";
                System.out.print((seat[i][j].equals("__")) ? strSeat : "[����]");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

    }

    /**
     * @author ������
     */
    // �޼ҵ�
    private void cancel() {
 
        System.out.println("�����ȣ�� �Է����ּ���");

        int userNumber1 = scanner.nextInt();
        scanner.nextLine();

        for (int row = 0; row < seat.length; row++) {
            for (int col = 0; col < seat[row].length; col++) {

                if (seat[row][col].equals(String.valueOf(userNumber1))) { // ������ �¼� ���

                    // �¼��� ���� ��ȣ ���� �ʿ�
                    System.out.println("������ �����Ͻ� �¼��� " + (row + 1) + "-" + (col + 1) + " �Դϴ�.");

                    do {
                        System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
                        System.out.println("��(1), �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
                        userNumber1 = scanner.nextInt();
                        scanner.nextLine();
                    } while (userNumber1 < 1 || userNumber1 > 2);

                    switch (userNumber1) {
                    case 1:
                        seat[row][col] = "__";
                        System.out.println("���Ű� ��ҵǾ����ϴ�. �����մϴ�.");
                        break;

                    case 2:
                        // �ʱ�ȭ������
                        break;
                    }

                    return;
                } // if end

                if (row == seat.length - 1 && col == seat[seat.length - 1].length - 1) {

                    int userNumber = 0;
                    do {
                        System.out.println("���Ź�ȣ�� �ùٸ��� �ʽ��ϴ�.");
                        System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�? ��(1), �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
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
