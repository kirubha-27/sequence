/*
* Given an integer array nums of unique elements, return all possible
subsets
* Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
* */

import java.util.ArrayList;
import java.util.List;

class Main {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sub = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        return subb(nums,0,sub,list);
    }
    public List<List<Integer>> subb(int[] nums,int index,List<List<Integer>> sub,List<Integer> list){
        if(index>=nums.length){
            sub.add(new ArrayList<>(list));
            return sub;
        }
        list.add(nums[index]);
        subb(nums,index+1,sub,list);
        list.remove(list.size()-1);
        subb(nums,index+1,sub,list);
        return sub;
    }
}