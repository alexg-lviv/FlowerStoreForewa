package users;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Sender implements User{
    private int id = 0;

    public Sender() {
        this.id = TotalCounter.counter();
    }
    public int getId(){
        return id;
    }

    @Override
    public String update(int status) {
        if(status == 1){
            return "wow, I should send smth";
        }
        return "help me, world";
    }
}
