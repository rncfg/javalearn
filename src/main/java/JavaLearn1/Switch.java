package JavaLearn1;

public class Switch {
    public static void main(String[] args){
        int num = 24;
        switch (num){
            case 12:
                System.out.print("num=12 ");
                break;
            case 23:
                System.out.println("Num=23");
                if(num == 23)
                    System.out.println("All good");
                break;
            default:
                System.out.println("Num is Unknown");

        }

    }

}
