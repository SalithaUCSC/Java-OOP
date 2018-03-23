class AddNumbers {

    // method with 2 integer parameters
    public int addition(int x, int y){
        return x+y;
    }
    // method with 3 integer parameters
    public int addition(int x, int y, int z){
        return x+y+z;
    }
    // method with 2 integer and double parameters
    public int addition(double x, int y){
        return (int)x+y;    //casting
    }
}

class Mathematics{
    public static void main(String args[]){
        AddNumbers a1 = new AddNumbers();
        System.out.println(a1.addition(1,2));
        System.out.println(a1.addition(1,2, 3));
        System.out.println(a1.addition(3,4));
    }
}
