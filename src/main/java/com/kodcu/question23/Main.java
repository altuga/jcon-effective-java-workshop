package com.kodcu.question23;

import java.util.EnumSet;
import java.util.Set;



/**
 * TODO
 * 1 - Can you apply STYLE_BOLD and STYLE_STRIKETHROUGH at the same time ?
 * 2 - What are the alternative options other than working with INTEGERS ?
 */

public class Main {

    public static void main(String[] args) {
        PrintedWork printedWork = new PrintedWork();
        printedWork.applyStyles(EnumSet.of(PrintedWork.Style.BOLD,
                PrintedWork.Style.STRIKETHROUGH)); //1 and //4

    }
}
