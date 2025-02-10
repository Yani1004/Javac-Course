import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regexPawns = "[a-h][1-8]";
        String regexPieces = "[KQRNB][a-h]?[1-8]?[a-h][1-8]";
        String regexPawnsTake = "[a-h][1-8]x[a-h][1-8]";
        String regexPiecesTake = "[KQRNB][a-h]?[1-8]?x[a-h][1-8]";
        String regexRokada = "0-0(-0)?";
        String regexCheckMate = "(\\+|#)";
        String finalRegex = "(" + regexPawns + "|" + regexPieces + "|" + regexPawnsTake + "|" + regexPiecesTake + "|" + regexRokada + "|" + regexCheckMate + ")";

        Pattern p = Pattern.compile(finalRegex);
        String input = "e4xd5 a2c5";
        Matcher m = p.matcher(input);
        System.out.println(input+" is "+m.matches());
    }
}
