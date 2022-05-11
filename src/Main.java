public class Main {

    public static void main(String[] args) {
    // write your code here
        int ageOfPerson = 20;
        int temperature = 10 ;
    }
    public static int metod(int temperature, int ageOfPerson) {
        return (temperature + ageOfPerson);

        if (ageOfPerson > 20 && ageOfPerson < 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if(ageOfPerson < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (ageOfPerson > 45 && temperature >-10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else{
            System.out.println("Оставайся дома");
        }
    }

}


