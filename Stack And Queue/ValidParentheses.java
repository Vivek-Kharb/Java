// # Intuition
// <!-- Describe your first thoughts on how to solve this problem. -->

// # Approach
// <!-- Describe your approach to solving the problem. -->

// # Complexity
// - Time complexity:
// <!-- Add your time complexity here, e.g. $$O(n)$$ -->

// - Space complexity:
// <!-- Add your space complexity here, e.g. $$O(n)$$ -->

// # Code
```java []
class Solution {
    public boolean isValid(String s) {
        
        int length = s.length();

        boolean isValid=true;
      
       Stack<Integer>  bracketStack= new Stack<>();

       if(length%2!=0){
          return !isValid; 
       }

		for(int i =0 ; i<length;i++){

           if(s.charAt(i)=='('){
               bracketStack.push(1);
           }
            else if(s.charAt(i)=='{'){
                bracketStack.push(2);
            }
           else  if(s.charAt(i)=='['){
                bracketStack.push(3);
            }

               else if ( 
                (s.charAt(i)==')' && ( bracketStack.empty() || bracketStack.peek()!=1)) ||
                (s.charAt(i)=='}' && ( bracketStack.empty() || bracketStack.peek()!=2)) ||
                (s.charAt(i)==']' && ( bracketStack.empty() || bracketStack.peek()!=3)) ){
                    return !isValid; 
                }
           else  if(s.charAt(i)==')' && bracketStack.peek() ==1  || s.charAt(i)=='}' && bracketStack.peek()==2 ||
                   s.charAt(i)==']' && bracketStack.peek()==3){
               bracketStack.pop();

           }
        }
        if(bracketStack.empty()){
          return isValid;  
        }
                
        return !isValid;
    }
}


```