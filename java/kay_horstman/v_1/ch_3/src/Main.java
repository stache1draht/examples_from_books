public class Main
    {
        public static void main(String[] args) {
            /**
             * If you need to join two strings delimited with a symbol, you can join them
             * using the join() method.
             */
            String all=String.join("/", "L", "M", "S");
            System.out.println(all);


            /**
             * To determine the real length of a string, use the following method.
             */
            String greeting="Oello";
            int cpCount=greeting.codePointCount(0, greeting.length());
            System.out.println(cpCount);


            /**
             * The codePoints() method returns a stream of int values for separate code points.
             */
            int[] codePoints=greeting.codePoints().toArray();
            for (int i:codePoints) {
                System.out.println(i);
            }


            /**
             * An array of code points can be converted to a string using a String constructor,
             * as shown below.
             */
            String str=new String(codePoints, 0, codePoints.length);

            /**
             * If you need to create a string from several small pieces, construct an empty StringBuilder object
             */
            StringBuilder sb=new StringBuilder();

            /**
             * Call the append() method when you need to add a new piece to this string
             */
            char ch='a';
            sb.append(ch);

            String str1="some string";
            sb.append(str1);


            /**
             * Call the toString method when the new string has been created
             */
            String completeString=sb.toString();
        }
    }
