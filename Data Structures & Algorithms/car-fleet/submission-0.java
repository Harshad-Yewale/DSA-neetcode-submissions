class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        double[][] cars = new double[position.length][2];


        for(int i=0;i<position.length;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double) (target - position[i]) / speed[i];
        }

        Arrays.sort(cars, (a,b)-> Double.compare(a[0],b[0]));
        int count=0;
        double prevNum=0;

         for (int i = cars.length - 1; i >= 0; i--) {
            if (cars[i][1] > prevNum) {
                count++;
                prevNum = cars[i][1];
            }
        }

        return count;

        
    }
}
