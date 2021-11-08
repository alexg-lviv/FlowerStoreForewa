package users;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Receiver implements User{
    private int id = 0;

    public Receiver() {
        this.id = TotalCounter.counter();
    }
    public int getId(){
        return id;
    }

    @Override
    public String update(int status) {
        if(status == 1){
            return "wow, my order was handled";
        }
        return "help me, world";
    }
}
