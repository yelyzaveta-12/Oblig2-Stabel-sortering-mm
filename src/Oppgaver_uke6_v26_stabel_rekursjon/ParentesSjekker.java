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
}
