public class Main {
    public double converter(int amount, String currency){
        double exchangeRate = 0;
        if(currency.equals("RUB")){
            exchangeRate = 101.51;
        }
        double ans = amount*exchangeRate;
        return ans;
    }
    public static void main(String[] args) {
        Main temp = new Main();

        System.out.println(temp.converter(30, "RUB"));
    }
}