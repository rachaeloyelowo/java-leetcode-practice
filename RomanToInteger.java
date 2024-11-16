public class RomanToInteger{
    public int romanToInt(String s) {
        
        int total = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'I'){
                total += 1;
            }
            if (s.charAt(i) == 'V'){
                total += 5;

                if (i != 0){
                    if (s.charAt(i - 1) == 'I'){
                        total -= 2;
                    }
                }
                
            }
            if (s.charAt(i) == 'X'){
                total += 10;

                if (i != 0){
                    if (s.charAt(i - 1) == 'I'){
                        total -= 2;
                    }
                }
            }
            if (s.charAt(i) == 'L'){
                total += 50;

                if (i != 0) {
                    if (s.charAt(i - 1) == 'X'){
                        total -= 20;
                    }
                }   
            }
            if (s.charAt(i) == 'C'){
                total += 100;

                if (i != 0) {
                    if (s.charAt(i - 1) == 'X'){
                        total -= 20;
                    }
                }
            }
            if (s.charAt(i) == 'D'){
                total += 500;

                if (i != 0){
                    if (s.charAt(i - 1) == 'C'){
                        total -= 200;
                    }
                }
            }
            if (s.charAt(i) == 'M'){
                total += 1000;

                if (i != 0){
                    if (s.charAt(i - 1) == 'C'){
                        total -= 200;
                    }
                }
            }
        }
        return total;
    }
}