package com.techreturners.exercise001;

import java.util.List;
import java.text.DecimalFormat;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0) ) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Calculate 50% of 120: int k = (int)(120*(50.0f/100.0f));
        // more generally: int k = (int)(value*(percentage/100.0f));
        double vat = (originalPrice*(vatRate/100.0f) );

       // double total = originalPrice + vat;

        // Format to truncate trailing decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        return Double.parseDouble(df.format(originalPrice + vat));
    }

    public String reverse(String sentence) {
        String reverse = new StringBuffer(sentence).reverse().toString();
        return reverse;
    }

    public int countLinuxUsers(List<User> users) {
        return 0;
    }
}
