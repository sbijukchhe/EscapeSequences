/*
Escape sequences
A character preceded by a backslash (\) is an escape sequence and has special meaning to the compiler. The following table shows the Java escape sequences. Note: Each escape sequence represents one character entity.

Escape Sequence	Description
\t	Insert a tab in the text at this point.
\b	Insert a backspace in the text at this point.
\n	Insert a newline in the text at this point.
\r	Insert a carriage return in the text at this point. Note: Windows uses \r\n for a new line.
\f	Insert a formfeed in the text at this point.
\'	Insert a single quote character in the text at this point.
\"	Insert a double quote character in the text at this point.
\	Insert a backslash character in the text at this point.
Write a Java program to print a box, an oval, or a diamond (choose one) using asterisks.
********
*      *
*      *
*      *
*      *
********

  ***
 *   *
*     *
*     *
 *   *
  ***

   *
  * *
 *   *
  * *
   *
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("******\n*    *\n*    *\n*    *\n*    *\n******");
    }
}
