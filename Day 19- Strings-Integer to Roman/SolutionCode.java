//APPROACH USING DICTIONARIES
public String intToRoman(int num) {

        // Approach:
        // This method uses two arrays with the corresponding integer-roman map, in descending order.

        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < value.length && num > 0; i++) {
            // Check from the highest value, 1000 to the smallest.
            // If it is possible to subtract, for example 400, we know the roman numeral next is "CD".
            while (num >= value[i]) {
                romanNumeral.append(roman[i]);
                num -= value[i];
            }
        }
        return romanNumeral.toString();
    }

//APPROACH USING HASHMAPS
class Solution {
    public String intToRoman(int num) {
        TreeMap<Integer, String> map = new TreeMap<>(){{
            put(1, "I");
            put(5, "V");
            put(4, "IV");
            put(9, "IX");
            put(10, "X");
            put(40, "XL");
            put(50, "L");
            put(90, "XC");
            put(100, "C");
            put(400, "CD");
            put(500, "D");
            put(900, "CM");
            put(1000, "M");
        }};

        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int closest = map.floorKey(num);
            sb.append(map.get(closest));
            num -= closest;
        }

        return sb.toString();
    }
}

//APPROACH USING ARRAYS
class Solution {
    public String intToRoman(int num) {
        int[] intCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < intCode.length; i++) {
            while (num >= intCode[i]) {
                sb.append(code[i]);
                num -= intCode[i];
            }
        }

        return sb.toString();
    }
}
