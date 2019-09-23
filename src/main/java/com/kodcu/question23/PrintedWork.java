package com.kodcu.question23;


import java.util.Set;

public class PrintedWork {



    public enum Style {
        BOLD(1), ITALIC(2), UNDERLINE(4), STRIKETHROUGH(8);

        public int styleValue;

        Style(int styleValue) {
            this.styleValue = styleValue;
        }
    }

    public void applyStyles(Set<Style> styles) {
        System.out.println(styles + " are applied ");

    }
}
