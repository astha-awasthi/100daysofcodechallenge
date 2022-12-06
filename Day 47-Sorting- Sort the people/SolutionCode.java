class Solution {
    class pair{
    String name;
    int h;
    pair(String name,int h){
        this.name=name;
        this.h=h;
    }
}

public String[] sortPeople(String[] names, int[] heights) {
    
   PriorityQueue<pair> pq=new PriorityQueue<>(new Comparator<pair>(){        
       public int compare(pair a,pair b){
           return b.h-a.h;
       }
   });
    
    for(int i=0;i<names.length;i++) pq.add(new pair(names[i],heights[i]));
    int i=0;
    
    while(pq.size()>0){
        
        names[i++]=pq.poll().name;
    }
    
    
    
    return names;
}
}
