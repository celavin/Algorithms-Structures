package leetCode;

import java.util.HashMap;
import java.util.Stack;
/*20. 有效的括号
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。
 */
public class leetCode20 {
    static HashMap<Character,Character> hm = new HashMap<>(){{
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
    }};//这是匿名内部类重写代码块
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));

    }
    static boolean isValid(String s) {
        if(s.length() %2 !=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else if(c == ')' || c == '}' || c == ']'){
                if(!st.isEmpty() && st.peek().equals(hm.get(c))){
                    st.pop();
                }else {return false;}
            }
        }
        if(st.isEmpty()){
            return true;
        }else {return false;}
    }
}
