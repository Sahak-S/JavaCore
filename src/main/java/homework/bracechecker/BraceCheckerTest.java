package homework.bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "[Hello] (from} {Java). [Javan {is} a {good] program.";

        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();


    }
}
