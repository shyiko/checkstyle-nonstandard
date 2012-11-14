package com.github.shyiko.checkstyle.nonstandard;

import com.puppycrawl.tools.checkstyle.api.Check;
import com.puppycrawl.tools.checkstyle.api.DetailAST;

/**
 * @author <a href="mailto:stanley.shyiko@gmail.com">Stanley Shyiko</a>
 */
public class NumberOfConsecutiveBlankLinesCheck extends Check {

    private int maximum = 1;

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public int[] getDefaultTokens() {
        return new int[0];
    }

    @Override
    public void beginTree(DetailAST aRootAST) {
        String[] lines = getLines();
        for (int i = 0, numberOfLines = lines.length, numberOfBlankLines = 0; i < numberOfLines; i++) {
            String line = lines[i];
            if (line.trim().isEmpty()) {
                numberOfBlankLines++;
            } else {
                if (numberOfBlankLines > getMaximum()) {
                    log(i - numberOfBlankLines + 1, numberOfBlankLines + " consecutive blank lines");
                }
                numberOfBlankLines = 0;
            }
        }
    }
}
