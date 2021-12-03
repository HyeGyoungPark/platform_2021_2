import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

enum Command {ADD, LIST, SUM, MAX, MIN, QUIT, INVALID;};


public class ArrayEnum {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList();
        Command command;

        while(true){
            String cmd = scanner.next().toUpperCase();
            try {
                command = Command.valueOf(cmd);
            }
            catch (IllegalArgumentException e) {
                command = Command.INVALID;
            }
            if (command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    final int newValue = scanner.nextInt();
                    values.add(newValue);
                    break;
                case LIST:
                    for(int i=0; i<values.size();i++){
                        System.out.printf("%d ",values.get(i));
                    }
                    System.out.println();
                    break;
                case SUM:
                    int getSum = 0;
                    for(int i=0; i<values.size();i++) {
                        getSum += values.get(i);
                    }
                    System.out.println(getSum);
                    break;
                case MAX:
                    System.out.println(Collections.max(values));
                    break;
                case MIN:
                    System.out.println(Collections.min(values));
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }
}
