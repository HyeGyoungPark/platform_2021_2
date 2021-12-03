import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID};

public class StringSetManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringSet = new ArrayList();
        StringCommand command;

        while (true) {
            String cmd = scanner.next().toUpperCase();
            try {
                command = StringCommand.valueOf(cmd);
            } catch (IllegalArgumentException e) {
                command = StringCommand.INVALID;
            }
            if (command == StringCommand.QUIT) {
                System.out.println("BYE!");
                break;
            }

            switch (command) {
                case ADD: {
                    int flag = 0;
                    String str = scanner.next();
                    for(int i=0; i<stringSet.size();i++){
                        if(stringSet.get(i).equals(str)){
                            flag++;
                        }
                    }
                    if(flag==0)
                        stringSet.add(str);
                    break;
                }
                case REMOVE: {
                    String str = scanner.next();
                    for (int i = 0; i < stringSet.size(); i++) {
                        if (stringSet.get(i).equals(str)) {
                            stringSet.remove(i);
                        }
                    }
                    break;
                }
                case CLEAN: {
                    stringSet.clear();
                    break;
                }
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            System.out.println("Element Size: " + stringSet.size() + ", Values = " + stringSet);
        }
    }

}
