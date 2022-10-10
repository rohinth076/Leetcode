class TimeMap {
    Map<String,TreeMap<Integer,String>> m;
    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer,String> l = m.getOrDefault(key,new TreeMap<>());
        l.put(timestamp,value);
        m.put(key,l);
    }
    
    public String get(String key, int timestamp) {
        if(!m.containsKey(key))return "";
        Map.Entry<Integer,String> l = m.get(key).floorEntry(timestamp);
        if(l == null)return "";
        return l.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */