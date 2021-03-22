public class Calculations {
    public boolean primary(int input){
        boolean temp = true;
        for(int i = 2; i <= input; i++){
            if (input % i != 0){
                break;
            }else {
                temp = false;
            }
        }
        return temp;
    }

    public int primary(int input, int max){

        int number = 0;

        for (; input <= max; input++){
            if (primary(input)){
                number = input;
                break;
            }
        }
        return number;
    }

    public String euklides(int input){
        String result = "";
        int prime = 2;

        while (input > 1){
            if (input % prime == 0){
                result = result.concat(String.valueOf(prime)).concat(" * ");
                input /= prime;
            }else {
                prime = primary((prime + 1), input);
            }
        }
        return result;
    }
}
