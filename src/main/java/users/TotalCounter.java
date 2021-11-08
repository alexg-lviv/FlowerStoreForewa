package users;
class TotalCounter {
    private static int counter;
    public static int counter(){
        counter += 1;
        return counter;
    }
}
