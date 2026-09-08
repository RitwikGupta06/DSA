class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String sb = new StringBuilder(str).reverse().toString();
        return sb.equals(str);
    }
}