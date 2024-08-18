class RandomizedSet {
    HashMap<Integer, Integer> hm;
    List<Integer> list;

    public RandomizedSet() {
        hm = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))
            return false;
        list.add(val);
        hm.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val) == false)
            return false;

        int index = hm.get(val);
        Collections.swap(list, index, list.size()-1);
        int swappedwith = list.get(index);
        hm.put(swappedwith, index);
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random random = new Random();
        int randomindex = random.nextInt(list.size());
        return list.get(randomindex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */