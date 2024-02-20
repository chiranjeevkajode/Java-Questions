class BiCycle{
    String define_me(){
        return "a vhicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcyle, I am "+ define_me());

        String temp = super.define_me();

        System.out.println("My ancestor is a cycle who is "+ temp);
    }
}

public class JavaMethodOverloding2 {
   public static void main(String[] args) {
    MotorCycle M = new MotorCycle();
   } 
}
