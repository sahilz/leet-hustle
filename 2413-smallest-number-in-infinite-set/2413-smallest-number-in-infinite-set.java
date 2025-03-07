class SmallestInfiniteSet {
    private PriorityQueue<Integer> pq;
    private HashSet<Integer> hs;
    private int next; 

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        hs = new HashSet<>();
        next = 1;
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()) {
            int small = pq.poll();
            hs.remove(small);
            return small;
        }
        return next++;
    }
    
    public void addBack(int num) {
        if(num < next && hs.add(num)) {
            pq.offer(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */