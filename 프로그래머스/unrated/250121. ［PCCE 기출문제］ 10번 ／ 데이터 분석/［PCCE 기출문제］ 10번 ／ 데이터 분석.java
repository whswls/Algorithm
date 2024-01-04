import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        List<int[]> list = new ArrayList<>();
        String [] s = {"code", "date", "maximum", "remain"};
        int extIdx = 0;
        int sortIdx = 0;
        
        for(int i = 0; i<4; i++){
            if(ext.equals(s[i])) extIdx=i;
            if(sort_by.equals(s[i])) sortIdx=i;
        }
        
        for(int i=0; i<data.length; i++){
            if(data[i][extIdx]<val_ext) list.add(data[i]);
        }
        
        final int a = sortIdx;
        
        Collections.sort(list, (o1,o2) ->o1[a]-o2[a]);
        
        return list;
    }
}