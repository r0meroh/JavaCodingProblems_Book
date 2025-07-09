public class ProblemOne {
    public static void main(String[] args) {
        // create a multiline string before Java 15
        String sql = String.join ("/n"
        ,"UPDATE \"public\".\"office\""
        ,"SET (\"address_first\", \"address_second\", \"phone\") ="
        ," (SELECT \"public\".\"employee\".\"first_name\","
        ,"          \"public\".\"employee\".\"last_name\", ?"
        ,"     FROM \"public\".\"employee\""
        ,"     WHERE \"public\".\"employee\".\"job_title\" = ?;"
        );

        // create a multiline string in Java 15 and later
        String sql15 = """
            UPDATE "public"."office"
            SET ("address_first", "address_second", "phone") =
                (SELECT "public"."employee"."first_name",
                        "public"."employee"."last_name", ?
                 FROM "public"."employee"
                 WHERE "public"."employee"."job_title" = ?)
    """;

        String json15 = """
            {
                "widget": {
                    "debug": "on",
                    "window": {
                        "title": "Sample Konfabulator Widget",
                        "name": "main_window",
                        "width": 500,
                        "height": 500
                    },
                    "image": {
                        "src": "Images/Sun.png",
                        "name": "sun1",
                        "hOffset": 250,
                        "vOffset": 250,
                        "alignment": "center"
                    },
                }
            }
                        """;

        System.out.println(sql + "\n");
        System.out.println("\n" + sql15);
        System.out.println(json15 + "\n");

        }
}
