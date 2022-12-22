class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (var item : items1)
            map.put(item[0], item[1]);

        for (var item : items2) {
            map.putIfAbsent(item[0], 0);
            map.put(item[0], map.get(item[0]) + item[1]);
        }

        for (var item : map.keySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(item);
            list.add(map.get(item));
            result.add(list);
        }

        return result;
    }
}
