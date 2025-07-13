package challenge7.oop;

public class ArrayChallenge {


    public static void main(String[] args) {
        String[]IDs={"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179","B238","A789","C654"};

        for(String item:IDs) {

            if(item.startsWith("B")){
                System.out.println(item);
            }


        }


    }


}
