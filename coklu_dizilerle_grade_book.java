public class coklu_dizilerle_grade_book{
    public static void main(String[] Args){
        int[][] gradearr = {{87,96,70},
                            {68,87,90},
                            {94,100,90},
                            {100,81,82},
                            {83,65,85},
                            {78,87,65},
                            {85,75,83},
                            {91,94,100},
                            {76,72,84},
                            {87,93,73}};
        gradebook2 mygrade = new gradebook2(gradearr);
        mygrade.arrgoster(); 
        mygrade.process();
    }
}