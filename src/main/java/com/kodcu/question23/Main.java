package com.kodcu.question23;

import static com.kodcu.question23.PrintedWork.STYLE_BOLD;
import static com.kodcu.question23.PrintedWork.STYLE_STRIKETHROUGH;


/**
 * TODO
 * 1 - Can you apply STYLE_BOLD and STYLE_STRIKETHROUGH at the same time ?
 * 2 - What are the alternative options other than working with INTEGERS ?
 */

public class Main {

    public static void main(String[] args) {
        PrintedWork printedWork = new PrintedWork();
        printedWork.applyStyles(STYLE_BOLD);
    }
}
