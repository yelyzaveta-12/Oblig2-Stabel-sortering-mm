package Oppgaver_uke6_v26_stabel_rekursjon;

import java.util.Stack;

public class ParentesSjekker {

    //"{ [ ( ) ] }" er korrekt
    //• "{ [ ( ) }" er ikke korrekt. Mangler sluttparentes ]
    //• "[ ( ) ] }" er ikke korrekt. Mangler startparentes {
    //• "{ [ ( ] ) }" er ikke korrekt. Sluttparentes ] kommer for tidlig.

    private boolean erStartParentes(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean erSluttParentes(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private boolean erParentesPar(char start, char slutt) {
        return (start == '(' && slutt == ')') ||
                (start == '{' && slutt == '}') ||
                (start == '[' && slutt == ']');
    }

    public boolean sjekkParenteser(String s) {

        Stack<Character> stabel = new Stack<>();

        for (char c : s.toCharArray()) {

            if (erStartParentes(c)) {
                stabel.push(c);
            }
            else if (erSluttParentes(c)) {
                if (stabel.isEmpty()) {
                    return false;
                }
                char start = stabel.pop();
                if (!erParentesPar(start, c)) {
                    return false;
                }
            }
        }

        return stabel.isEmpty();
    }
}
