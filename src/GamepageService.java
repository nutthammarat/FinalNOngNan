import java.util.Random;
import javax.swing.JOptionPane;

public class GamepageService {

    static String a = "Red";
    static String b = "Blue";
    static String c = "Yellow";
    static String d = "Green";
    static int i = 0;
    static GamePage2 game2 = new GamePage2();
    static GamePage1 game1 = new GamePage1();
    static GamePage3 game3 = new GamePage3();
    static StartPage start = new StartPage();

    public static int random(int x) {
        Random ran = new Random();
        if (x == 1) {
            int i = ran.nextInt(3) + 1;
            return i;
        }
        if (x == 2) {
            int i = ran.nextInt(4) + 1;
            //System.out.println(i+ " x");
            return i;
        } else {
            int i = ran.nextInt(3) + 1;
           // System.out.println(i);
            return i;
        }
    }

    public static void getBtn(int x) {
        int i = random(x);
//        System.out.println(x);
        if (x == 1) {
            if (GamePage1.comchoose.getText().equals("")) {
                if (i == 1) {
                    GamePage1.comchoose.setText(a);
                }
                if (i == 2) {
                    GamePage1.comchoose.setText(b);
                }
                if (i == 3) {
                    GamePage1.comchoose.setText(c);
                }
            }
        } else if (x == 2) {
            if (GamePage2.comchoose.getText().equals("")) {
                if (i == 1) {
                    GamePage2.comchoose.setText(a);

                }
                if (i == 2) {
                    GamePage2.comchoose.setText(b);
                }
                if (i == 3) {
                    GamePage2.comchoose.setText(c);
                }
                if (i == 4) {
                    GamePage2.comchoose.setText(d);
                }

            }
        } else if (x == 3) {
            if (GamePage3.comchoose.getText().equals("")||GamePage3.comchoose.getText().equals(null)) {
                if (i == 1) {
                    GamePage3.comchoose.setText(d);
                }
                if (i == 2) {
                    GamePage3.comchoose.setText(c);
                }
                if (i == 3) {
                    GamePage3.comchoose.setText(a);
                }
            }
        }

    }

    public static void getAnswerStateOne() {
        if (GamePage1.comchoose.getText().equals(a)) {
            JOptionPane.showMessageDialog(null, "มันเป็นแม่สี ที่เด็กๆผู้ชายชอบเลือกเวลาดู Power Ranger", "คำใบ้", JOptionPane.WARNING_MESSAGE);
            int input = JOptionPane.showConfirmDialog(null, "คุณเลือกสี " + GamePage1.userchoose.getText() + " ไว้จะตอบใช่หรือไม่", "ยืนยันคำตอบ",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
            getChoiceStateOne(input);
        }
        if (GamePage1.comchoose.getText().equals(b)) {
            JOptionPane.showMessageDialog(null, "เป็นสีของท้องฟ้าสวยงามมม ...", "คำใบ้", JOptionPane.WARNING_MESSAGE);
            int input = JOptionPane.showConfirmDialog(null, "คุณเลือกสี " + GamePage1.userchoose.getText() + " ไว้จะตอบใช่หรือไม่", "ยืนยันคำตอบ",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
            getChoiceStateOne(input);
        }
        if (GamePage1.comchoose.getText().equals(c)) {
            JOptionPane.showMessageDialog(null, "เป็นสีของ บับเบิ้ลบี ใน Transformer", "คำใบ้", JOptionPane.WARNING_MESSAGE);
            int input = JOptionPane.showConfirmDialog(null, "คุณเลือกสี " + GamePage1.userchoose.getText() + " ไว้จะตอบใช่หรือไม่", "ยืนยันคำตอบ",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
            getChoiceStateOne(input);
        }
    }

    public static void getAnswerStateTwo() {
        if (GamePage2.comchoose.getText().equals(a)) {
            JOptionPane.showMessageDialog(null, "สีที่วัวกระทิงเอาไว้พุ่งชน.....", "คำใบ้", JOptionPane.WARNING_MESSAGE);
            int input = JOptionPane.showConfirmDialog(null, "คุณเลือกสี " + GamePage2.userchoose.getText() + " ไว้จะตอบใช่หรือไม่", "ยืนยันคำตอบ",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
            getChoiceStateTwo(input);
        }
        if (GamePage2.comchoose.getText().equals(b)) {
            JOptionPane.showMessageDialog(null, "สีของคณะเราเอง Informatics", "คำใบ้", JOptionPane.WARNING_MESSAGE);
            int input = JOptionPane.showConfirmDialog(null, "คุณเลือกสี " + GamePage2.userchoose.getText() + " ไว้จะตอบใช่หรือไม่", "ยืนยันคำตอบ",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
            getChoiceStateTwo(input);
        }
        if (GamePage2.comchoose.getText().equals(c)) {
            JOptionPane.showMessageDialog(null, "สีของรถแนนนะ", "คำใบ้", JOptionPane.WARNING_MESSAGE);
            int input = JOptionPane.showConfirmDialog(null, "คุณเลือกสี " + GamePage2.userchoose.getText() + " ไว้จะตอบใช่หรือไม่", "ยืนยันคำตอบ",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
            getChoiceStateTwo(input);
        }
        if (GamePage2.comchoose.getText().equals(d)) {
            JOptionPane.showMessageDialog(null, "สีของภูเขา ที่ยังไม่ได้โดนตัดต้นไม้ ", "คำใบ้", JOptionPane.WARNING_MESSAGE);
            int input = JOptionPane.showConfirmDialog(null, "คุณเลือกสี " + GamePage2.userchoose.getText() + " ไว้จะตอบใช่หรือไม่", "ยืนยันคำตอบ",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
            getChoiceStateTwo(input);
        }
    }
    public static void getAnswerStateThree() {
        JOptionPane.showMessageDialog(null, "คุณเลือกสี "+GamePage3.userchoose.getText(), " คำยืนยัน", JOptionPane.INFORMATION_MESSAGE);
        int input = JOptionPane.showConfirmDialog(null, "คุณแน่ใจว่าจะเลือกสีนี้ใช่ไหม ถ้าผิดคุณจะต้องเริ่มใหม่", "ยืนยันคำตอบ",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
        getChoiceStateThree(input);
       
    }

    public static void getChoiceStateOne(int input) {
        if (input == 0) {
            if (GamePage1.userchoose.getText().equals(GamePage1.comchoose.getText())) {
                JOptionPane.showMessageDialog(null, "ถูกต้อง !!", "คำตอบ", JOptionPane.INFORMATION_MESSAGE);
                clean();
                JOptionPane.showMessageDialog(null, "ไปสู่ด้านที่สองกันเลย ");
                game1.setVisible(false);
                game2.setVisible(true);
                JOptionPane.showMessageDialog(null, "ด่านนี้จะมีทั้งหมด 4 ตัวเลือกแต่จะมีคำใบ้ให้แบบยากๆ เลยล่ะ ");
            } else {
                JOptionPane.showMessageDialog(null, "ผิดเลือกแล้วตอบใหม่ !!", "คำตอบ", JOptionPane.WARNING_MESSAGE);
                clean();
            }
        }

    }

    public static void getChoiceStateTwo(int input) {
        if (input == 0) {
            if (GamePage2.userchoose.getText().equals(GamePage2.comchoose.getText())) {
                JOptionPane.showMessageDialog(null, "ถูกต้อง !!", "คำตอบ", JOptionPane.INFORMATION_MESSAGE);
                clean();
                JOptionPane.showMessageDialog(null, "ไปสู่ด้านที่สามด่าน Final กันเลย ");
                game2.setVisible(false);
                game3.setVisible(true);
                JOptionPane.showMessageDialog(null, "ด่านนี้จะมีทั้งหมด 3 ตัวเลือก ไม่มีคำใบ้ แต่จะให้โอกาสตอบ สองครั้ง ");
            } else {
                JOptionPane.showMessageDialog(null, "ผิดกลับไปเล่นด่านแรกใหม่ !!", "คำตอบ", JOptionPane.WARNING_MESSAGE);
                game2.setVisible(false);
                game1.setVisible(true);
                clean();
            }
        }

    }
    public static void getChoiceStateThree(int input) {
        
        if (input == 0) {
            if (GamePage3.userchoose.getText().equals(GamePage3.comchoose.getText())) {
                JOptionPane.showMessageDialog(null, "ถูกต้อง !!", "คำตอบ", JOptionPane.INFORMATION_MESSAGE);
                clean();
                JOptionPane.showMessageDialog(null, "เก่งมากเลย ");
                JOptionPane.showMessageDialog(null, "ยินดีด้วยคุณเล่นมาครบสามด่าน จบเกมส์ของเราแล้วละ ขอบคุณที่เข้ามาเล่น");
                start.setVisible(true);
                game3.setVisible(false);
                
            } else {
                
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "ผิดเราให้โอกาสอีกหนึ่งครั้ง !!", "คำตอบ", JOptionPane.WARNING_MESSAGE);
                    i=2;
                }
                else{
                    JOptionPane.showMessageDialog(null, "ผิดเราให้โอกาสคุณไปหมดแล้ว กลับไปเริ่มด่านหนึ่งใหม่ !!", "คำตอบ", JOptionPane.WARNING_MESSAGE);
                    game3.setVisible(false);
                    game1.setVisible(true);
                    clean();
                }
            }
        }

    }

    public static int setAnswer(int i) {
        if (i == 1) {
            GamePage1.userchoose.setText(a);
        }
        if (i == 2) {
            GamePage1.userchoose.setText(b);
        }
        if (i == 3) {
            GamePage1.userchoose.setText(c);
        }
        if (i == 4) {
            GamePage2.userchoose.setText(a);
        }
        if (i == 5) {
            GamePage2.userchoose.setText(b);
        }
        if (i == 6) {
            GamePage2.userchoose.setText(c);
        }
        if (i == 7) {
            GamePage2.userchoose.setText(d);
        }
        if (i == 8) {
            GamePage3.userchoose.setText(d);
        }
        if (i == 9) {
            GamePage3.userchoose.setText(c);
        }
        if (i == 10) {
            GamePage3.userchoose.setText(a);
        }
        return 0;
    }

    public static void clean() {
        GamePage1.userchoose.setText("");
        GamePage1.comchoose.setText("");
        GamePage2.userchoose.setText("");
        GamePage2.comchoose.setText("");
        GamePage3.userchoose.setText("");
        GamePage3.comchoose.setText("");
    }

}
