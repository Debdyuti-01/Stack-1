// Time: O(n)
// Space: O(n)



class Solution {
    public int[] dailyTemperatures(int[] T) {
        if (T.length == 0) return new int[0];
        int n = T.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack();

        for (int i = 0; i<n; i++) {
            while (!st.isEmpty() && T[i] > T[st.peek()]) {
                int popIndx = st.pop();
                result[popIndx] = i - popIndx;
            }
            st.push(i);
        }
        return result;
    }
}