public enum EnumSample {
    MONDAY(1,"nk"),
    TUESDAY(2,"nk1"),
    WEDNESDAY(3,"nk3"),
    THURSDAY(4,"nk4"),
    FRIDAY(5,"nk5"),
    SATURDAY(6,"nk6"),
    SUNDAY(7,"nk7") ;
 int val;

    EnumSample(int val, String name) {
        this.val = val;
        this.name = name;
    }

    String name;

}

class Mian
{
    public static void main(String[] args) {
        // 1. usage of Values and Ordinal
//        for(EnumSample sample : EnumSample.values())
//        {
//            System.out.println(sample.ordinal());
//        }
       // EnumSample.FRIDAY;
       EnumSample.FRIDAY.ordinal();
    }
}
