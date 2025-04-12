class IntroOnArrays {
    public static void main(String[] args) {

        //Creation

        int[] marks=new int[5];

        //Initialization
        
        marks[0]=95;
        marks[1]=98;
        marks[2]=89;
        marks[3]=67;
        marks[4]=70;

        //Accessing

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        for(int mark:marks){
            System.out.print(mark+" ");
        }
        
    }
}


//Multi Dimensional Array

class MultiDimensional {
    public static void main(String[] args) {
        
        int[][] numbers = {{1,2},{3,4}};

        numbers = new int[][] { {1,3}, {2,3} };

        for(int[] num : numbers) {
            for(int n : num) {
                System.out.println(n);
            }
        }
    }
}

