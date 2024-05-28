// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
package Binary_Search;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
    static char nextGreatestLetter(char[] letter,char target){
        int start = 0;
        int end = letter.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target < letter[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }
}
