public class ThirdCode {

    public static void main(String[] args) {
        int year=2020;
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
            System.out.println("year = " + year);
        }
        else{
            System.out.println("COMMON YEAR");
            System.out.println("number");
        }
    }
}
