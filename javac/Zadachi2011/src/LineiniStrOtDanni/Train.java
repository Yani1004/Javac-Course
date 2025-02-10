package LineiniStrOtDanni;

import java.util.Stack;

public class Train {
    private Stack<String> wagons;

    public Train() {
        wagons = new Stack<>();
    }

    public void addWagon(String wagon) {
        wagons.push(wagon);
        System.out.printf("New wagon is added %s\n", wagon);
    }
    public void removeWagon() {
       if(!wagons.isEmpty()){
         String removed = wagons.pop();
           System.out.printf("The removed wagon is %s\n", removed);
       }else {
           System.out.println("The wagon is empty\n");
       }
    }
}

