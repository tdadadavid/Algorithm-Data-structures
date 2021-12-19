package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedListStack<String> stack = new LinkedListStack<>();
        String Html =
                "<html>\n" +
                "<head>\n" +
                "<title>Page Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h1>This is a Heading</h1>\n" +
                "<p>This is a paragraph.</p>\n" +
                "\n" +
                "</body>\n" +
                "</html> ";

        boolean verify =  stack.isHTMLMatched(Html);
        System.out.println(verify);

    }
}