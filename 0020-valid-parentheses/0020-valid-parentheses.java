import java.util.*;
class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        if(l<=1 || l%2!=0){
            return false;
        }
        Stack<Character> stack= new Stack<Character>();
        for (int i=0;i<l;i++){
            char t=s.charAt(i);
            if (t=='(' || t=='{' || t=='['){
                stack.push(t);
            }
            else if( (t==')') && (stack.isEmpty() || stack.pop()!='(')){
                return false;
            }
            else if( (t=='}') && (stack.isEmpty() || stack.pop()!='{')){
                return false;
            }
            else if( (t==']') && (stack.isEmpty() || stack.pop()!='[')){
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
        }
    }
