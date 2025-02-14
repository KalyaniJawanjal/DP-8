//time - O(n), space - O(1)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null || triangle.size()==0) return 0;
        int sum = 0;

        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }

        return triangle.get(0).get(0);
    }
}

