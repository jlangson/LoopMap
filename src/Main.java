import java.util.*;

public class Main {

    //    Write a program that does the following:
    //    Asks the user for 5 numbers
    //    Stores them in an array list
    //    Finds the sum, product, largest, and smallest of those numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        int sum=0;
        int product=1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int line;
        //does sum product largest and smallest in one loop

        for(int i = 0; i < 5; i++){
            System.out.println("Enter an Integer");
            line = Integer.parseInt(scanner.nextLine());
            numbers.add(i, line);
            sum+=line;
            product*=line;
            if(line > max){
                max = line;
            }
            if(line < min){
                min = line;
            }
        }
        System.out.println("sum " + sum + " product " + product + " max " + max + " min " + min);

        //    You are a car dealer. Create a hash map of vehicles.
        //    The model is the Key, the make is the Value.
        //    Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
        //            (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
        //make is brand
        //model is product
        HashMap<String, String> inventory = new HashMap<String, String>();
        inventory.put("Mazda", "M3");
        inventory.put("Ford", "Bronco");
        inventory.put("Nissan", "Altima");
        inventory.put("Honda", "Accord");

        String model="";
        System.out.println("what model of car are you looking for?");
        model = scanner.nextLine();
        if(inventory.containsKey(model)){
            System.out.println("We have " + model + " it is a " + inventory.get(model));
        }
        else {
            System.out.println("We do NOT have " + model);
        }


    }





}
