package language.class5;

public class switchCase {
    public static void main(String[] args) {
        char c = 'a';
        switch(c){
            case 'A':
                System.out.println("I am in A");
                break;
            case 'B':
                System.out.println("I am in B");
                break;
            case 97:
                System.out.println("I am small a");
                break;
            default:
                System.out.println("I am in default 1");
                break;
        }

// ASSIGNMENT 3
        String month = "march";

        switch(month.toLowerCase()){
            case "jan":
            case "march":
            case "feb":
            case "dec":
                System.out.println("I am in "+month);
                break;
            default:
                System.out.println("I am in default 2"+month);
                break;
        }



        // ASSIGNMENT 5
        String num = "123456770";
        int length = num.length();
                    for(int i=0; i<length; i++){

                        switch (num.charAt(i)) {
                            case '1':
                                System.out.print("One ");
                                break;
                            case '2':
                                System.out.print("Two ");
                                break;
                            case '3':
                                System.out.print("Three ");
                                break;
                            case '4':
                                System.out.print("Four ");
                                break;
                            case '5':
                                System.out.print("Five ");
                                break;
                            case '6':
                                System.out.print("Six ");
                                break;
                            case '7':
                                System.out.print("Seven ");
                                break;
                            case '8':
                                System.out.print("Eight ");
                                break;
                            case '9':
                                System.out.print("Nine ");
                                break;
                            case '0':
                                System.out.print("Zero ");
                                break;
                            default:
                                break;
                        }

                    }

    }
}
