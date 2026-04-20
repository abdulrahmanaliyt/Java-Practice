public class Text_Block {
    public static void main(String[] args) {
        // Notice the opening quotes are followed by a newline
        // and the closing quotes determine the indentation level.
        String htmlStructure = """
                <!DOCTYPE html>
                <html>
                    <head>
                        <title>Java Text Blocks</title>
                    </head>
                    <body>
                        <h1>Success!</h1>
                        <p>This is a multi-line string without \\n or + operators.</p>
                    </body>
                </html>
                """;

        System.out.println(htmlStructure);
    }
}