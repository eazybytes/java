public class TextBlockDemo {

    public static void main(String[] args) {
        String input = "Hello, my name is John \n" +
                "and I am 25 years old.";
        System.out.println(input);

        String htmlCode = "<html>\n" +
                "<body>\n" +
                "<p>Hello World.</p>\n" +
                "</body>\n" +
                "</html>\n";
        System.out.println(htmlCode);

        String textBlock = """
                    <html>
                        <body>
                            <p> Hello World. </p>
                        </body>
                   </html>
                """;
        System.out.println(textBlock);
    }
}
