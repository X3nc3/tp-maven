package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {

        String asciiArt = FigletFont.convertOneLine("app");
        System.out.println(asciiArt);
    }
}
