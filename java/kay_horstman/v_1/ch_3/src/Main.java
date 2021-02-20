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
        }
    }
