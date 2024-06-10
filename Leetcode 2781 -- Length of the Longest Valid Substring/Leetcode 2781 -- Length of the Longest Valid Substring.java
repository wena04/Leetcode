//Leetcode 2781: Length of the Longest Valid Substring
//https://leetcode.com/problems/length-of-the-longest-valid-substring/
class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        int len = 0; //the length of the longest forbidden word (normally we just use 10 based on problem spec, but we optimized it so that it's specific to the test case)
        Set<String> all = new HashSet<>(); //puts in set so can save time when checking if window contains substring or not
        for (String s : forbidden) {
            all.add(s);
            len = Math.max(len, s.length());
        }
        int n = word.length();
        int r = 0; //the current longest length
        for (int i = n - 1, right = n; right > r && i >= 0; --i) { //start from the most end of the string
            int now = 0;
            StringBuilder temp = new StringBuilder(); //build a temporary substring that is initially nothing
            for (int j = i; j < right && j - i < len; ++j) { //only iterate maximum of len (or just 9) times in worse case
                temp.append(word.charAt(j));
                if (all.contains(temp.toString())) {
                    right = j; //move the right index if found a forbidden word in the current longest string
                    break;
                }
            }
            r = Math.max(r, right - i);
        }
        return r;
    }
}

//Method: Sliding window + brute force
//time complexity: O(N * maxlengthofforbidden^2)
//space complexity: O(sum of forbidden words length)
/*
(1) Put all the forbidden strings in the hashmap.
(2) For each i from n - 1 to 0 (in reverse order).
(3) Check whether we have fobidden word by enumberating or the lengths from 1 to max_length_of_forbidden_word starting at i. Keep the valid right position.
The key point is if [i..x] is invalid then [(i - 1)..x] is invalid too. */