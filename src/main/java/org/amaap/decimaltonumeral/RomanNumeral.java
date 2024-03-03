package org.amaap.decimaltonumeral;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {
    public String convert(int integer) throws InvalidNumberException {
        //created empty string as roman
        String roman = "";

        Map<Integer, String> integerToRoman = new LinkedHashMap<>();
        integerToRoman.put(1000, "M");
        integerToRoman.put(900, "CM");
        integerToRoman.put(500, "D");
        integerToRoman.put(400, "CD");
        integerToRoman.put(100, "C");
        integerToRoman.put(90, "XC");
        integerToRoman.put(50, "L");
        integerToRoman.put(40, "XL");
        integerToRoman.put(10, "X");
        integerToRoman.put(9, "IX");
        integerToRoman.put(5, "V");
        integerToRoman.put(4, "IV");
        integerToRoman.put(1, "I");
        if (integer <= 0) {
            throw new InvalidNumberException("Cannot Convert to Roman for NumberLessThanEqualToZero");
        }


        else{
            while (integer > 0) {
                for (Map.Entry<Integer, String> entry : integerToRoman.entrySet()) {
                    if (integer >= entry.getKey()) {
                        roman += entry.getValue();
                        integer -= entry.getKey();
                        break;
                    }

                }
            }
            return roman;
        }
    }

}
